package me.wheam.enjoypictures;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DiyActivity extends BaseActivity {

  private PictureContainer picturesContainer;
  private PictureSelector pictureSelector;
  private List<DiyModel.DiyPart> diyPartList = DiyModel.buildDefaultDiyParts();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_diy);
    Toolbar toolbar = (android.support.v7.widget.Toolbar) this.findViewById(R.id.toolbar);
    this.setSupportActionBar(toolbar);
    picturesContainer = (PictureContainer) findViewById(R.id.pictures_container);
    pictureSelector = (PictureSelector) findViewById(R.id.picture_selector);
    picturesContainer
        .setPictures("http://7u2h6n.com1.z0.glb.clouddn.com/diy_big_picture.jpg", diyPartList);
    pictureSelector.setDiyParts(diyPartList,
        new DiyPartItemView.OnItemClickListener() {
          @Override
          public void onClick(String partTitle, DiyModel.DiyLayer diyLayer) {
            picturesContainer.updateLayer(partTitle, diyLayer);
          }
        });

  }
}
