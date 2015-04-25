package me.wheam.enjoypictures;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DiyActivity extends Activity {

  private PictureModel pictureModel;

  private PictureContainer picturesContainer;
  private PictureSelector pictureSelector;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_diy);
    Intent intent = getIntent();
    pictureModel = (PictureModel) intent.getSerializableExtra(Constants.KEY_PICTURE_MODEL);

    picturesContainer = (PictureContainer) findViewById(R.id.pictures_container);
    pictureSelector = (PictureSelector) findViewById(R.id.picture_selector);

    if (pictureModel != null) {
      picturesContainer.setPictures(pictureModel.bigPictureDrawableId, pictureModel.diyPartList);
      pictureSelector.setDiyParts(pictureModel.diyPartList, new DiyPartItemView.OnItemClickListener() {
        @Override
        public void onClick(String partTitle, PictureModel.DiyLayer diyLayer) {
          picturesContainer.updateLayer(partTitle, diyLayer);
        }
      });
    }
  }
}
