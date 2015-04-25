package me.wheam.enjoypictures;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class PictureListAdapter extends BaseAdapter {

  private List<PictureModel> pictureModelList;
  private Context context;

  public PictureListAdapter(Context context, List<PictureModel> pictureModelList) {
    this.context = context;
    this.pictureModelList = pictureModelList;
  }

  @Override
  public int getCount() {
    return pictureModelList.size();
  }

  @Override
  public PictureModel getItem(int i) {
    return pictureModelList.get(i);
  }

  @Override
  public long getItemId(int i) {
    return i;
  }

  @Override
  public View getView(int i, View view, ViewGroup viewGroup) {
    PictureListItemView itemView = null;
    if (view instanceof PictureListItemView) {
      itemView = (PictureListItemView) view;
    } else {
      itemView = new PictureListItemView(context);
    }
    itemView.setData(pictureModelList.get(i));
    return itemView;
  }
}
