package me.wheam.enjoypictures;

import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class PictureSelector extends LinearLayout {

  public PictureSelector(Context context) {
    super(context);
  }

  public PictureSelector(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public PictureSelector(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public PictureSelector(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  public void setDiyParts(List<PictureModel.DiyPart> diyParts,
      DiyPartItemView.OnItemClickListener onItemClickListener) {
    if (diyParts == null || diyParts.isEmpty()) {
      return;
    }
    LinearLayout.LayoutParams layoutParams =
        new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT);
    for (PictureModel.DiyPart diyPart : diyParts) {
      if (diyPart != null) {
        DiyPartItemView itemView = new DiyPartItemView(getContext());
        itemView.setData(diyPart, onItemClickListener);
        this.addView(itemView, layoutParams);
      }
    }
  }
}
