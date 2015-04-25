package me.wheam.enjoypictures;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DiyActivity extends Activity {

  private PictureModel pictureModel;

  private RelativeLayout picturesContainer;
  private RelativeLayout partsContainer;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_diy);
    Intent intent = getIntent();
    pictureModel = (PictureModel) intent.getSerializableExtra(Constants.KEY_PICTURE_MODEL);

    picturesContainer = (RelativeLayout) findViewById(R.id.pictures_container);
    partsContainer = (RelativeLayout) findViewById(R.id.parts_container);



  }
}
