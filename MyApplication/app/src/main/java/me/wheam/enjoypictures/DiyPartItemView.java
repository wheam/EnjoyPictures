package me.wheam.enjoypictures;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DiyPartItemView extends RelativeLayout {

  private RequestQueue requestQueue;
  private ImageLoader imageLoader;
  private TextView titleView;
  private LinearLayout itemContainer;

  public DiyPartItemView(Context context) {
    super(context);
    init();
  }

  public DiyPartItemView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public DiyPartItemView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  public DiyPartItemView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    init();
  }

  private void init() {
    View.inflate(getContext(), R.layout.diy_part_item_view, this);
    initViews();
  }

  private void initViews() {
    titleView = (TextView) findViewById(R.id.item_title);
    itemContainer = (LinearLayout) findViewById(R.id.item_container);
    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue(getContext());
      imageLoader = new ImageLoader(requestQueue, new BitmapCache());
    }
  }

  public void setData(final DiyModel.DiyPart diyPart,
      final OnItemClickListener onItemClickListener) {
    if (diyPart == null || TextUtils.isEmpty(diyPart.title) || diyPart.diyLayerList == null
        || diyPart.diyLayerList.isEmpty()) {
      return;
    }
    titleView.setText(diyPart.title);
    LinearLayout.LayoutParams layoutParams =
        new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT);
    for (final DiyModel.DiyLayer diyLayer : diyPart.diyLayerList) {
      if (diyLayer != null && !TextUtils.isEmpty(diyLayer.previewResUrl)) {
        NetworkImageView layer = new NetworkImageView(getContext());
        layoutParams.height = 400;
        layoutParams.width = 400;
        layer.setImageUrl(diyLayer.previewResUrl, imageLoader);
        itemContainer.addView(layer, layoutParams);
        layer.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View view) {
            onItemClickListener.onClick(diyPart.title, diyLayer);
          }
        });
      }
    }
  }

  public interface OnItemClickListener {
    void onClick(String partTitle, DiyModel.DiyLayer diyLayer);
  }
}
