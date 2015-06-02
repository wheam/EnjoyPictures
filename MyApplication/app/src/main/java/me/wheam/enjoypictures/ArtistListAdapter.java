package me.wheam.enjoypictures;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class ArtistListAdapter extends BaseAdapter {

  private List<ArtistModel> artistModelList;
  private Context context;

  public ArtistListAdapter(Context context, List<ArtistModel> artistModelList) {
    this.context = context;
    this.artistModelList = artistModelList;
  }

  @Override
  public int getCount() {
    return artistModelList.size();
  }

  @Override
  public ArtistModel getItem(int i) {
    return artistModelList.get(i);
  }

  @Override
  public long getItemId(int i) {
    return i;
  }

  @Override
  public View getView(int i, View view, ViewGroup viewGroup) {
    ArtistListItemView itemView = null;
    if (view instanceof ArtistListItemView) {
      itemView = (ArtistListItemView) view;
    } else {
      itemView = new ArtistListItemView(context);
    }
    itemView.setData(artistModelList.get(i));
    return itemView;
  }
}
