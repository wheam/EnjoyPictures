package me.wheam.enjoypictures;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class PictureModelFactory implements Serializable {

  public static List<PictureModel> buildPictureList() {
    List<PictureModel> pictureModelList = new ArrayList<PictureModel>();

    // sample 1
    PictureModel pictureModelForShiqi = new PictureModel();
    pictureModelForShiqi.dynasty = "新石器时代";
    pictureModelForShiqi.pictureName = "人面鱼纹陶盆";
    pictureModelForShiqi.descriptionTitle = "这是介绍的标题";
    pictureModelForShiqi.descriptionDetail =
        "喜欢笑起来有小梨涡的人，看她们的笑颜醉倒在小梨涡里…。 引用林徽因的＜深笑＞\n" +
            "是谁笑得那样甜，那样深，\n" +
            "那样圆转？一串一串明珠，\n" +
            "大小闪着光亮，迸出天真！\n" +
            "清泉底浮动，泛流到水面上，";
    pictureModelForShiqi.littlePictureDrawableId =
        "http://7u2h6n.com1.z0.glb.clouddn.com/shiqishidai.jpg";
    pictureModelForShiqi.bigPictureDrawableId =
        "http://7u2h6n.com1.z0.glb.clouddn.com/diy_big_picture.jpg";

    List<PictureModel.DiyPart> diyPartList = new ArrayList<PictureModel.DiyPart>();
    List<PictureModel.DiyLayer> diyLayerList = new ArrayList<PictureModel.DiyLayer>();
    diyLayerList.add(new PictureModel.DiyLayer(
        "http://7u2h6n.com1.z0.glb.clouddn.com/flower1_layer.png",
        "http://7u2h6n.com1.z0.glb.clouddn.com/flower1.png"));
    diyLayerList.add(new PictureModel.DiyLayer(
        "http://7u2h6n.com1.z0.glb.clouddn.com/flower2_layer.png",
        "http://7u2h6n.com1.z0.glb.clouddn.com/flower2_layer.png"));
    diyLayerList.add(new PictureModel.DiyLayer(
        "http://7u2h6n.com1.z0.glb.clouddn.com/flower3_layer.png",
        "http://7u2h6n.com1.z0.glb.clouddn.com/flower3.png"));
    PictureModel.DiyPart diyPartFlower = new PictureModel.DiyPart("水墨花", diyLayerList);
    diyPartList.add(diyPartFlower);
    pictureModelForShiqi.diyPartList = diyPartList;
    pictureModelList.add(pictureModelForShiqi);

    // sample 2
    PictureModel pictureModelForZhanguo = new PictureModel();
    pictureModelForZhanguo.dynasty = "战国";
    pictureModelForZhanguo.pictureName = "人物驭龙图";
    pictureModelForZhanguo.descriptionTitle = "这是介绍的标题";
    pictureModelForZhanguo.descriptionDetail =
        "喜欢笑起来有小梨涡的人，看她们的笑颜醉倒在小梨涡里…。 引用林徽因的＜深笑＞\n" +
            "是谁笑得那样甜，那样深，\n" +
            "那样圆转？一串一串明珠，\n" +
            "大小闪着光亮，迸出天真！\n" +
            "清泉底浮动，泛流到水面上，";
    pictureModelForZhanguo.littlePictureDrawableId =
        "http://7u2h6n.com1.z0.glb.clouddn.com/zhanguo.jpg";
    pictureModelForZhanguo.diyPartList = null;
    pictureModelList.add(pictureModelForZhanguo);

    // sample 3
    PictureModel pictureModelForHandai = new PictureModel();
    pictureModelForHandai.dynasty = "汉代";
    pictureModelForHandai.pictureName = "官员出行画像砖";
    pictureModelForHandai.descriptionTitle = "这是介绍的标题";
    pictureModelForHandai.descriptionDetail =
        "喜欢笑起来有小梨涡的人，看她们的笑颜醉倒在小梨涡里…。 引用林徽因的＜深笑＞\n" +
            "是谁笑得那样甜，那样深，\n" +
            "那样圆转？一串一串明珠，\n" +
            "大小闪着光亮，迸出天真！\n" +
            "清泉底浮动，泛流到水面上，";
    pictureModelForHandai.littlePictureDrawableId =
        "http://7u2h6n.com1.z0.glb.clouddn.com/handai.jpg";
    pictureModelForHandai.diyPartList = null;
    pictureModelList.add(pictureModelForHandai);

    pictureModelList.add(pictureModelForShiqi);
    pictureModelList.add(pictureModelForZhanguo);
    pictureModelList.add(pictureModelForHandai);


    return pictureModelList;
  }
}
