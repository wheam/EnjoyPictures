package me.wheam.enjoypictures;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class PictureDetailActivity extends Activity {

  private PictureModel pictureModel;
  private static ImageLoader imageLoader;
  private static RequestQueue requestQueue;
  private NetworkImageView pictureBack;
  private TextView title;
  private TextView description;
  private View diyIt;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_picture_detail);
    Intent intent = getIntent();
    pictureModel = (PictureModel) intent.getSerializableExtra(Constants.KEY_PICTURE_MODEL);
    pictureBack = (NetworkImageView) findViewById(R.id.picture_back);
    title = (TextView) findViewById(R.id.title);
    description = (TextView) findViewById(R.id.description);
    diyIt = findViewById(R.id.diy_it);

    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue(this);
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }
    if (pictureModel != null) {
      setTitle(pictureModel.pictureName);
      pictureBack.setImageUrl(pictureModel.bigPictureDrawableId, imageLoader);
      title.setText(pictureModel.descriptionTitle);
      description.setText(pictureModel.descriptionDetail);
      diyIt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          if (pictureModel.diyPartList != null && !pictureModel.diyPartList.isEmpty()) {
            Intent intent = new Intent(PictureDetailActivity.this, DiyActivity.class);
            intent.putExtra(Constants.KEY_PICTURE_MODEL, pictureModel);
            startActivity(intent);
          }
        }
      });
    }

  }

}
