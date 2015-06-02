package me.wheam.enjoypictures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DynastyDetailActivity extends BaseActivity {

  private DynastyModel dynastyModel;
  private static ImageLoader imageLoader;
  private static RequestQueue requestQueue;
  private NetworkImageView pictureBack;
  private TextView description;
  private TextView dynasty;
  private TextView dynastyDuration;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dynasty_detail);
    Toolbar toolbar = (android.support.v7.widget.Toolbar) this.findViewById(R.id.toolbar);
    this.setSupportActionBar(toolbar);
    Intent intent = getIntent();
    dynastyModel = (DynastyModel) intent.getSerializableExtra(Constants.KEY_DYNASTY_MODEL);
    pictureBack = (NetworkImageView) findViewById(R.id.picture_back);
    description = (TextView) findViewById(R.id.description);
    dynasty = (TextView) findViewById(R.id.dynasty);
    dynastyDuration = (TextView) findViewById(R.id.dynasty_duration);

    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue(this);
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }
    if (dynastyModel != null) {
      pictureBack.setImageUrl(dynastyModel.bigPictureUrl, imageLoader);
      dynasty.setText(dynastyModel.dynastyName);
      description.setText(dynastyModel.descriptionDetail);
      dynastyDuration.setText(dynastyModel.dynastyDuration);
    }
  }

}
