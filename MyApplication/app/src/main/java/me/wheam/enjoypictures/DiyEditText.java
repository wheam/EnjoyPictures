package me.wheam.enjoypictures;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DiyEditText extends LinearLayout {

  private EditText editText;

  public DiyEditText(Context context) {
    super(context);
    init();
  }

  public DiyEditText(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public DiyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  public DiyEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    init();
  }

  private void init() {
    View.inflate(getContext(), R.layout.diy_text_layout, this);
    editText = (EditText) findViewById(R.id.edit);
  }

  public EditText getEditText() {
    return editText;
  }
}
