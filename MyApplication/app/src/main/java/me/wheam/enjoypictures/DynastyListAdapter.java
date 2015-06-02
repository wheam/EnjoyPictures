package me.wheam.enjoypictures;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DynastyListAdapter extends BaseAdapter {

  private List<DynastyModel> dynastyModelList;
  private Context context;

  public DynastyListAdapter(Context context, List<DynastyModel> dynastyModelList) {
    this.context = context;
    this.dynastyModelList = dynastyModelList;
  }

  @Override
  public int getCount() {
    return dynastyModelList.size();
  }

  @Override
  public DynastyModel getItem(int i) {
    return dynastyModelList.get(i);
  }

  @Override
  public long getItemId(int i) {
    return i;
  }

  @Override
  public View getView(int i, View view, ViewGroup viewGroup) {
    DynastyListItemView itemView = null;
    if (view instanceof DynastyListItemView) {
      itemView = (DynastyListItemView) view;
    } else {
      itemView = new DynastyListItemView(context);
    }
    itemView.setData(dynastyModelList.get(i));
    return itemView;
  }
}
