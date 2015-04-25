package me.wheam.enjoypictures;

import java.io.Serializable;
import java.util.List;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class PictureModel implements Serializable {
  public String dynasty;
  public String pictureName;
  public String littlePictureDrawableId;
  public String bigPictureDrawableId;
  public String descriptionTitle;
  public String descriptionDetail;
  public List<DiyPart> diyPartList;

  public static class DiyPart implements Serializable {
    public String title;
    public List<DiyLayer> diyLayerList;

    public DiyPart(String title, List<DiyLayer> diyLayerList) {
      this.title = title;
      this.diyLayerList = diyLayerList;
    }
  }

  public static class DiyLayer implements Serializable {
    public String layerResUrl;
    public String previewResUrl;

    public DiyLayer(String layerResUrl, String previewResUrl) {
      this.layerResUrl = layerResUrl;
      this.previewResUrl = previewResUrl;
    }
  }
}
