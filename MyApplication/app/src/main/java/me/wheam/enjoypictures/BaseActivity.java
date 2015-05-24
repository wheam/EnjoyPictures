package me.wheam.enjoypictures;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.readystatesoftware.systembartint.SystemBarTintManager;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class BaseActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    applyKitKatTranslucency();
  }

  /**
   * Apply KitKat specific translucency.
   */
  private void applyKitKatTranslucency() {
    // KitKat translucent navigation/status bar.
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
      setTranslucentStatus(true);
      // setNavigationStatus(true);
      SystemBarTintManager mTintManager = new SystemBarTintManager(this);
      mTintManager.setStatusBarTintEnabled(true);
      mTintManager.setNavigationBarTintEnabled(true);
      mTintManager.setStatusBarTintColor(getResources().getColor(R.color.back));
      // mTintManager.setNavigationBarAlpha(0);
    }

  }

  @TargetApi(19)
  private void setTranslucentStatus(boolean on) {
    Window win = getWindow();
    WindowManager.LayoutParams winParams = win.getAttributes();
    final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
    if (on) {
      winParams.flags |= bits;
    } else {
      winParams.flags &= ~bits;
    }
    win.setAttributes(winParams);
  }

  @TargetApi(19)
  private void setNavigationStatus(boolean on) {
    Window win = getWindow();
    WindowManager.LayoutParams winParams = win.getAttributes();
    final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION;
    if (on) {
      winParams.flags |= bits;
    } else {
      winParams.flags &= ~bits;
    }
    win.setAttributes(winParams);
  }
}
