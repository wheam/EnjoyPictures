package me.wheam.enjoypictures;

import android.graphics.Bitmap;
import android.util.LruCache;

import com.android.volley.toolbox.ImageLoader;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class BitmapCache implements ImageLoader.ImageCache {

  private LruCache<String, Bitmap> cache;

  public BitmapCache() {
    cache = new LruCache<String, Bitmap>(8 * 1024 * 1024) {
      @Override
      protected int sizeOf(String key, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
      }
    };
  }

  @Override
  public Bitmap getBitmap(String url) {
    return cache.get(url);
  }

  @Override
  public void putBitmap(String url, Bitmap bitmap) {
    cache.put(url, bitmap);
  }
}

