package me.wheam.enjoypictures;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DynastyListFragment extends Fragment {

  private ListView listView;
  private DynastyListAdapter adapter;

  public DynastyListFragment() {}

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_dynasty_list, container, false);
    listView = (ListView) rootView.findViewById(R.id.list_view);
    return rootView;
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    adapter = new DynastyListAdapter(getActivity(), ModelFactory.buildDynastyModelList());
    listView.setAdapter(adapter);
  }
}
