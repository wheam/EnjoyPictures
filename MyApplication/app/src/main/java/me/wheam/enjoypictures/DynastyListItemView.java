package me.wheam.enjoypictures;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DynastyListItemView extends RelativeLayout {


  private NetworkImageView pictureBack;
  private TextView dynasty;
  private static ImageLoader imageLoader;
  private static RequestQueue requestQueue;

  public DynastyListItemView(Context context) {
    super(context);
    init();
  }

  public DynastyListItemView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public DynastyListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  public DynastyListItemView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    init();
  }

  private void init() {
    View.inflate(getContext(), R.layout.dynasty_list_item_view, this);
    initViews();
  }

  private void initViews() {
    pictureBack = (NetworkImageView) findViewById(R.id.picture_back);
    dynasty = (TextView) findViewById(R.id.dynasty);
    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue((Activity) getContext());
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }

  }

  public void setData(final DynastyModel dynastyModel) {
    if (dynastyModel != null) {
      pictureBack.setImageUrl(dynastyModel.littlePictureUrl, imageLoader);
      dynasty.setText(dynastyModel.dynastyName);
      this.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
          Intent intent = new Intent(getContext(), DynastyDetailActivity.class);
          intent.putExtra(Constants.KEY_DYNASTY_MODEL, dynastyModel);
          getContext().startActivity(intent);
        }
      });
    }
  }
}
