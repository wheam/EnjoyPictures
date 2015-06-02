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
public class ArtistDetailActivity extends BaseActivity {

  private ArtistModel artistModel;
  private static ImageLoader imageLoader;
  private static RequestQueue requestQueue;
  private NetworkImageView pictureBack;
  private TextView description;
  private TextView dynasty;
  private TextView artistName;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_artist_detail);
    Toolbar toolbar = (android.support.v7.widget.Toolbar) this.findViewById(R.id.toolbar);
    this.setSupportActionBar(toolbar);
    Intent intent = getIntent();
    artistModel = (ArtistModel) intent.getSerializableExtra(Constants.KEY_ARTIST_MODEL);
    pictureBack = (NetworkImageView) findViewById(R.id.picture_back);
    description = (TextView) findViewById(R.id.description);
    dynasty = (TextView) findViewById(R.id.dynasty);
    artistName = (TextView) findViewById(R.id.artist_name);

    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue(this);
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }
    if (artistModel != null) {
      pictureBack.setImageUrl(artistModel.bigPictureUrl, imageLoader);
      dynasty.setText(artistModel.dynasty);
      description.setText(artistModel.descriptionDetail);
      artistName.setText(artistModel.artistName);
    }
  }

}
