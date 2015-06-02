package me.wheam.enjoypictures;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class MainActivity extends BaseActivity implements MaterialTabListener {
  MaterialTabHost tabHost;
  ViewPager pager;
  ViewPagerAdapter adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (android.support.v7.widget.Toolbar) this.findViewById(R.id.toolbar);
    this.setSupportActionBar(toolbar);

    tabHost = (MaterialTabHost) this.findViewById(R.id.tabHost);
    pager = (ViewPager) this.findViewById(R.id.pager);

    // init view pager
    adapter = new ViewPagerAdapter(getSupportFragmentManager());
    pager.setAdapter(adapter);
    pager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
      @Override
      public void onPageSelected(int position) {
        // when user do a swipe the selected tab change
        tabHost.setSelectedNavigationItem(position);

      }
    });

    // insert all tabs from pagerAdapter data
    for (int i = 0; i < adapter.getCount(); i++) {
      tabHost.addTab(
          tabHost.newTab()
              .setText(adapter.getPageTitle(i))
              .setTabListener(this)
          );

    }
  }

  @Override
  public void onTabSelected(MaterialTab materialTab) {
    pager.setCurrentItem(materialTab.getPosition());
  }

  @Override
  public void onTabReselected(MaterialTab materialTab) {

  }

  @Override
  public void onTabUnselected(MaterialTab materialTab) {

  }

  private class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
      super(fm);
    }

    public Fragment getItem(int num) {
      switch (num) {
        case 0:
          return new PictureListFragment();
        case 1:
          return new DynastyListFragment();
        case 2:
          return new ArtistListFragment();
        default:
          return new PictureListFragment();
      }
    }

    @Override
    public int getCount() {
      return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
      switch (position) {
        case 0:
          return "画集";
        case 1:
          return "朝代";
        case 2:
          return "画家";
        default:
          return null;
      }
    }
  }
}
