package me.wheam.enjoypictures;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.materialdialog.MaterialDialog;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class NewDiyActivity extends Activity {

  private static final String BACK_PICTURE_URL =
      "http://7u2h6n.com1.z0.glb.clouddn.com/diy_background.jpg";
  private static final String TEXT_TITLE = "text_title";
  private static final String TEXT_LINE1 = "text_line1";
  private static final String TEXT_LINE2 = "text_line2";
  private static final String TEXT_LINE3 = "text_line3";
  private static final String TEXT_LINE4 = "text_line4";
  private static ImageLoader imageLoader;
  private static RequestQueue requestQueue;
  private NetworkImageView back;
  private RelativeLayout parent;
  private ViewPager pager;
  private ViewPageAdapter pageAdapter = new ViewPageAdapter();
  private List<DiyModel.DiyLayer> diyLayerList = new ArrayList<DiyModel.DiyLayer>();
  private TextView titleTextView;
  private TextView line1TextView;
  private TextView line2TextView;
  private TextView line3TextView;
  private TextView line4TextView;
  private String title;
  private String line1;
  private String line2;
  private String line3;
  private String line4;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState != null) {
      title = savedInstanceState.getString(TEXT_TITLE);
      line1 = savedInstanceState.getString(TEXT_LINE1);
      line2 = savedInstanceState.getString(TEXT_LINE2);
      line3 = savedInstanceState.getString(TEXT_LINE3);
      line4 = savedInstanceState.getString(TEXT_LINE4);
    }
    setContentView(R.layout.activity_diy_new);
    hideSystemUi();
    parent = (RelativeLayout) this.findViewById(R.id.parent);
    back = (NetworkImageView) this.findViewById(R.id.picture_back);
    pager = (ViewPager) this.findViewById(R.id.pager);
    titleTextView = (TextView) this.findViewById(R.id.title);
    line1TextView = (TextView) this.findViewById(R.id.line1);
    line2TextView = (TextView) this.findViewById(R.id.line2);
    line3TextView = (TextView) this.findViewById(R.id.line3);
    line4TextView = (TextView) this.findViewById(R.id.line4);
    List<DiyModel.DiyPart> diyPartList = DiyModel.buildDefaultDiyParts();
    if (diyPartList != null && !diyPartList.isEmpty() && diyPartList.get(0) != null) {
      diyLayerList.addAll(diyPartList.get(0).diyLayerList);
    }
    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue(this);
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }
    Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/huangcao.ttf");
    titleTextView.setTypeface(typeFace);
    line1TextView.setTypeface(typeFace);
    line2TextView.setTypeface(typeFace);
    line3TextView.setTypeface(typeFace);
    line4TextView.setTypeface(typeFace);
    pager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
      @Override
      public void onPageSelected(int position) {
        super.onPageSelected(position);
        parent.bringChildToFront(titleTextView);
      }
    });
    pager.setAdapter(pageAdapter);
    pager.setAnimation(AnimationUtils.loadAnimation(
        this, android.R.anim.fade_in));
    pager.setCurrentItem(0);
    back.setImageUrl(BACK_PICTURE_URL, imageLoader);
    pager.setOnTouchListener(new View.OnTouchListener() {
      @Override
      public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
      }
    });
    titleTextView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        final MaterialDialog builder = new MaterialDialog(NewDiyActivity.this);
        builder.setTitle("自定义题词的标题");
        final DiyEditText editText = new DiyEditText(NewDiyActivity.this);
        editText.getEditText().setHint("自定义题词的标题");
        builder.setView(editText);
        builder.setPositiveButton("确定", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            if (!TextUtils.isEmpty(editText.getEditText().getText().toString())) {
              title = editText.getEditText().getText().toString();
              titleTextView.setText(title);
            } else {
              Toast.makeText(NewDiyActivity.this, "不可以空着噢", Toast.LENGTH_SHORT);
            }
            builder.dismiss();
          }
        });
        builder.setNegativeButton("取消", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            builder.dismiss();
          }
        });
        builder.show();
      }
    });
    line1TextView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        final MaterialDialog builder = new MaterialDialog(NewDiyActivity.this);
        builder.setTitle("自定义题词第一行");
        final DiyEditText editText = new DiyEditText(NewDiyActivity.this);
        editText.getEditText().setHint("自定义题词第一行");
        builder.setView(editText);
        builder.setPositiveButton("确定", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            if (!TextUtils.isEmpty(editText.getEditText().getText().toString())) {
              line1 = editText.getEditText().getText().toString();
              line1TextView.setText(line1);
            } else {
              Toast.makeText(NewDiyActivity.this, "不可以空着噢", Toast.LENGTH_SHORT);
            }
            builder.dismiss();
          }
        });
        builder.setNegativeButton("取消", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            builder.dismiss();
          }
        });
        builder.show();
      }
    });
    line2TextView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        final MaterialDialog builder = new MaterialDialog(NewDiyActivity.this);
        builder.setTitle("自定义题词第二行");
        final DiyEditText editText = new DiyEditText(NewDiyActivity.this);
        editText.getEditText().setHint("自定义题词第二行");
        builder.setView(editText);
        builder.setPositiveButton("确定", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            if (!TextUtils.isEmpty(editText.getEditText().getText().toString())) {
              line2 = editText.getEditText().getText().toString();
              line2TextView.setText(line2);
            } else {
              Toast.makeText(NewDiyActivity.this, "不可以空着噢", Toast.LENGTH_SHORT);
            }
            builder.dismiss();
          }
        });
        builder.setNegativeButton("取消", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            builder.dismiss();
          }
        });
        builder.show();
      }
    });
    line3TextView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        final MaterialDialog builder = new MaterialDialog(NewDiyActivity.this);
        builder.setTitle("自定义题词第三行");
        final DiyEditText editText = new DiyEditText(NewDiyActivity.this);
        editText.getEditText().setHint("自定义题词第三行");
        builder.setView(editText);
        builder.setPositiveButton("确定", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            if (!TextUtils.isEmpty(editText.getEditText().getText().toString())) {
              line3 = editText.getEditText().getText().toString();
              line3TextView.setText(line3);
            } else {
              Toast.makeText(NewDiyActivity.this, "不可以空着噢", Toast.LENGTH_SHORT);
            }
            builder.dismiss();
          }
        });
        builder.setNegativeButton("取消", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            builder.dismiss();
          }
        });
        builder.show();
      }
    });
    line4TextView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        final MaterialDialog builder = new MaterialDialog(NewDiyActivity.this);
        builder.setTitle("自定义题词第四行");
        final DiyEditText editText = new DiyEditText(NewDiyActivity.this);
        editText.getEditText().setHint("自定义题词第四行");
        builder.setView(editText);
        builder.setPositiveButton("确定", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            if (!TextUtils.isEmpty(editText.getEditText().getText().toString())) {
              line4 = editText.getEditText().getText().toString();
              line4TextView.setText(line4);
            } else {
              Toast.makeText(NewDiyActivity.this, "不可以空着噢", Toast.LENGTH_SHORT);
            }
            builder.dismiss();
          }
        });
        builder.setNegativeButton("取消", new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            builder.dismiss();
          }
        });
        builder.show();
      }
    });
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString(TEXT_TITLE, title);
    outState.putString(TEXT_LINE1, line1);
    outState.putString(TEXT_LINE2, line2);
    outState.putString(TEXT_LINE3, line3);
    outState.putString(TEXT_LINE4, line4);
  }

  private void hideSystemUi() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
      Window window = getWindow();
      // // Translucent status bar
      // window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
      // WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
      // Translucent navigation bar
      window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
          WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
    }
  }

  private class ViewPageAdapter extends PagerAdapter {

    @Override
    public int getCount() {
      return diyLayerList.size();
    }

    @Override
    public NetworkImageView instantiateItem(ViewGroup container, int position) {
      NetworkImageView imageView = new NetworkImageView(NewDiyActivity.this);
      imageView.setAdjustViewBounds(true);
      imageView.setLayoutParams(new ViewGroup.LayoutParams(
          ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
      imageView.setImageUrl(diyLayerList.get(position).layerResUrl, imageLoader);
      container.addView(imageView);
      return imageView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
      if (object instanceof NetworkImageView) {
        container.removeView((NetworkImageView) object);
      }
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
      return view == object;
    }
  }
}
