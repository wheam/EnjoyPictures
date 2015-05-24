package me.wheam.enjoypictures;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class PictureDetailActivity extends BaseActivity {

  private PictureModel pictureModel;
  private static ImageLoader imageLoader;
  private static RequestQueue requestQueue;
  private NetworkImageView pictureBack;
  private TextView description;
  private TextView dynasty;
  private TextView pictureName;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_picture_detail);
    Intent intent = getIntent();
    pictureModel = (PictureModel) intent.getSerializableExtra(Constants.KEY_PICTURE_MODEL);
    pictureBack = (NetworkImageView) findViewById(R.id.picture_back);
    description = (TextView) findViewById(R.id.description);
    dynasty = (TextView) findViewById(R.id.dynasty);
    pictureName = (TextView) findViewById(R.id.picture_name);

    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue(this);
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }
    if (pictureModel != null) {
      pictureBack.setImageUrl(pictureModel.bigPictureUrl, imageLoader);
      dynasty.setText(pictureModel.dynasty);
      pictureName.setText(pictureModel.descriptionTitle);
      description.setText(pictureModel.descriptionDetail);
    }
  }

}
