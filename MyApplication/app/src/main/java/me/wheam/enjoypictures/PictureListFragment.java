package me.wheam.enjoypictures;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.getbase.floatingactionbutton.FloatingActionButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class PictureListFragment extends Fragment {

  private ListView listView;
  private PictureListAdapter adapter;
  private FloatingActionButton diyButton;

  public PictureListFragment() {}

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_picture_list, container, false);
    listView = (ListView) rootView.findViewById(R.id.list_view);
    diyButton = (FloatingActionButton) rootView.findViewById(R.id.diy_button);
    return rootView;
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    adapter = new PictureListAdapter(getActivity(), ModelFactory.buildPictureList());
    listView.setAdapter(adapter);
    diyButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(getActivity(), DiyActivity.class);
        getActivity().startActivity(intent);
      }
    });
  }
}
