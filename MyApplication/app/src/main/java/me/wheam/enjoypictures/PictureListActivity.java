package me.wheam.enjoypictures;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.readystatesoftware.systembartint.SystemBarTintManager;


public class PictureListActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_picture_list);
    if (savedInstanceState == null) {
      getFragmentManager().beginTransaction()
          .add(R.id.container, new PictureListFragment())
          .commit();
    }
    getActionBar().setHomeButtonEnabled(false);
  }

  /**
   * A placeholder fragment containing a simple view.
   */
  public static class PictureListFragment extends Fragment {

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
      adapter = new PictureListAdapter(getActivity(), PictureModelFactory.buildPictureList());
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
}
