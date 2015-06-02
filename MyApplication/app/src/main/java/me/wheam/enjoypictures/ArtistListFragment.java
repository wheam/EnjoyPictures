package me.wheam.enjoypictures;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class ArtistListFragment extends Fragment {

  private GridView listView;
  private ArtistListAdapter adapter;

  public ArtistListFragment() {}

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_artist_list, container, false);
    listView = (GridView) rootView.findViewById(R.id.list_view);
    return rootView;
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    adapter = new ArtistListAdapter(getActivity(), ModelFactory.buildArtistModelList());
    listView.setAdapter(adapter);
    listView.setNumColumns(2);
  }
}
