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
public class PictureListItemView extends RelativeLayout {


  private NetworkImageView pictureBack;
  private TextView dynasty;
  private TextView pictureName;
  private static ImageLoader imageLoader;
  private static RequestQueue requestQueue;

  public PictureListItemView(Context context) {
    super(context);
    init();
  }

  public PictureListItemView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public PictureListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  public PictureListItemView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    init();
  }

  private void init() {
    View.inflate(getContext(), R.layout.list_item_view, this);
    initViews();
  }

  private void initViews() {
    pictureBack = (NetworkImageView) findViewById(R.id.picture_back);
    dynasty = (TextView) findViewById(R.id.dynasty);
    pictureName = (TextView) findViewById(R.id.picture_name);
    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue((Activity) getContext());
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }

  }

  public void setData(final PictureModel pictureModel) {
    if (pictureModel != null) {
      pictureBack.setImageUrl(pictureModel.littlePictureDrawableId, imageLoader);
      dynasty.setText(pictureModel.dynasty);
      pictureName.setText(pictureModel.pictureName);
      this.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
          if (pictureModel.bigPictureDrawableId != null) {
            Intent intent = new Intent(getContext(), PictureDetailActivity.class);
            intent.putExtra(Constants.KEY_PICTURE_MODEL, pictureModel);
            getContext().startActivity(intent);
          }
        }
      });
    }
  }
}
