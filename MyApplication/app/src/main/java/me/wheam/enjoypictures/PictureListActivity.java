package me.wheam.enjoypictures;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class PictureListActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_picture_list);
    if (savedInstanceState == null) {
      getFragmentManager().beginTransaction()
          .add(R.id.container, new PictureListFragment())
          .commit();
    }
  }

  /**
   * A placeholder fragment containing a simple view.
   */
  public static class PictureListFragment extends Fragment {

    private ListView listView;
    private PictureListAdapter adapter;

    public PictureListFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.fragment_picture_list, container, false);
      listView = (ListView) rootView.findViewById(R.id.list_view);
      return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
      super.onViewCreated(view, savedInstanceState);
      adapter = new PictureListAdapter(getActivity(), PictureModelFactory.buildPictureList());
      listView.setAdapter(adapter);
    }
  }
}
