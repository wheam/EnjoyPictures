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
public class ArtistListItemView extends RelativeLayout {


  private NetworkImageView pictureBack;
  private TextView dynasty;
  private TextView artistName;
  private static ImageLoader imageLoader;
  private static RequestQueue requestQueue;

  public ArtistListItemView(Context context) {
    super(context);
    init();
  }

  public ArtistListItemView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public ArtistListItemView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  public ArtistListItemView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    init();
  }

  private void init() {
    View.inflate(getContext(), R.layout.artist_list_item_view, this);
    initViews();
  }

  private void initViews() {
    pictureBack = (NetworkImageView) findViewById(R.id.picture_back);
    dynasty = (TextView) findViewById(R.id.dynasty);
    artistName = (TextView) findViewById(R.id.artist_name);
    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue((Activity) getContext());
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }

  }

  public void setData(final ArtistModel artistModel) {
    if (artistModel != null) {
      pictureBack.setImageUrl(artistModel.littlePictureUrl, imageLoader);
      dynasty.setText(artistModel.dynasty);
      artistName.setText(artistModel.artistName);
      this.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
          Intent intent = new Intent(getContext(), ArtistDetailActivity.class);
          intent.putExtra(Constants.KEY_ARTIST_MODEL, artistModel);
          getContext().startActivity(intent);
        }
      });
    }
  }
}
