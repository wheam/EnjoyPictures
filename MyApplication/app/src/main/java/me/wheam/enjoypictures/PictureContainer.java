package me.wheam.enjoypictures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class PictureContainer extends RelativeLayout {

  private RequestQueue requestQueue;
  private ImageLoader imageLoader;
  private String backPictureUrl;
  private Map<String, NetworkImageView> networkImageViewMap =
      new HashMap<String, NetworkImageView>();

  public PictureContainer(Context context) {
    super(context);
    init();
  }

  public PictureContainer(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public PictureContainer(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  public PictureContainer(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    init();
  }

  private void init() {
    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue(getContext());
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }
  }

  public void setPictures(String backPictureUrl, List<PictureModel.DiyPart> diyParts) {
    this.backPictureUrl = backPictureUrl;

    if (TextUtils.isEmpty(backPictureUrl) || diyParts == null || diyParts.isEmpty()) {
      return;
    }

    RelativeLayout.LayoutParams layoutParams =
        new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    NetworkImageView back = new NetworkImageView(getContext());
    back.setImageUrl(backPictureUrl, imageLoader);
    this.addView(back, layoutParams);

    for (PictureModel.DiyPart diyPart : diyParts) {
      if (diyPart != null && diyPart.diyLayerList != null && !diyPart.diyLayerList.isEmpty()) {
        NetworkImageView partLayer = new NetworkImageView(getContext());
        networkImageViewMap.put(diyPart.title, partLayer);
        partLayer.setImageUrl(diyPart.diyLayerList.get(0).layerResUrl, imageLoader);
        this.addView(partLayer, layoutParams);
      }
    }
  }

  public void updateLayer(String partTitle, PictureModel.DiyLayer diyLayer) {
    if (TextUtils.isEmpty(partTitle) && diyLayer != null && !networkImageViewMap.isEmpty()) {
      NetworkImageView networkImageView = networkImageViewMap.get(partTitle);

      if (networkImageView != null && !TextUtils.isEmpty(diyLayer.layerResUrl)) {
        networkImageView.setImageUrl(diyLayer.layerResUrl, imageLoader);
      }
    }
  }


}
