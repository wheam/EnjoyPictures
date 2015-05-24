package me.wheam.enjoypictures;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class DiyModel {
  public final String poemTite;
  public final String poemMessage;

  public DiyModel(String poemTite, String poemMessage) {
    this.poemTite = poemTite;
    this.poemMessage = poemMessage;
  }

  public static List<DiyPart> buildDefaultDiyParts() {
    List<DiyPart> diyPartList = new ArrayList<DiyPart>();
    List<DiyLayer> diyLayerList = new ArrayList<DiyLayer>();
//    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/ diy_1.png",
//        "http://7u2h6n.com1.z0.glb.clouddn.com/ diy_1.png"));
//    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/diy_2.png",
//        "http://7u2h6n.com1.z0.glb.clouddn.com/diy_2.png"));
//    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/diy_3.png",
//        "http://7u2h6n.com1.z0.glb.clouddn.com/diy_3.png"));
//    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/diy_4.png",
//        "http://7u2h6n.com1.z0.glb.clouddn.com/diy_4.png"));
//    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/diy_5.png",
//        "http://7u2h6n.com1.z0.glb.clouddn.com/diy_5.png"));
//    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/diy_6.png",
//        "http://7u2h6n.com1.z0.glb.clouddn.com/diy_6.png"));
//    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/diy_7.png",
//        "http://7u2h6n.com1.z0.glb.clouddn.com/diy_7.png"));
//    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/diy_8.png",
//        "http://7u2h6n.com1.z0.glb.clouddn.com/diy_8.png"));
//    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/diy_9.png",
//        "http://7u2h6n.com1.z0.glb.clouddn.com/diy_9.png"));
    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/flower1_layer.png",
        "http://7u2h6n.com1.z0.glb.clouddn.com/flower1.png"));
    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/flower2_layer.png",
        "http://7u2h6n.com1.z0.glb.clouddn.com/flower2.png"));
    diyLayerList.add(new DiyLayer("http://7u2h6n.com1.z0.glb.clouddn.com/flower3_layer.png",
        "http://7u2h6n.com1.z0.glb.clouddn.com/flower3.png"));
    diyPartList.add(new DiyPart("自定义花朵", diyLayerList));
    return diyPartList;
  }

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
