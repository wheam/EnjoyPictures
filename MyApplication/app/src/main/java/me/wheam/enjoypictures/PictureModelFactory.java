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
    pictureModelForShiqi.descriptionTitle = "人面鱼纹陶盆";
    pictureModelForShiqi.descriptionDetail =
        "中国远古的文明渊远流长，形成于七千年前的仰韶文化是中国新石器文化发展的一支主干，它展现了中国母系氏族制度从繁荣至衰落时期的社会结构和文化成就，其中彩陶艺术达到了相当完美的境地，成为中国原始艺术创作的范例，这件彩陶盆便是其中代表之作。\n" +
            "    彩陶是在陶器表面以红黑赭白等色,  作画后烧成，彩画永不掉落。此盆由细泥红陶制成，敞口卷唇，盆内壁用黑彩绘出两组对称的人面鱼纹。人面概括成圆形，额的左半部涂成黑色，右半部为黑色半弧形，可能是当时的文面习俗。眼睛细而平直，鼻梁挺直，神态安祥，嘴旁分置两个变形鱼纹，鱼头与人嘴外廓重合，加上两耳旁相对的两条小鱼，构成形象奇特的人鱼合体，表现出丰富的想像力，人头顶的尖状角形物，可能是发髻，加上鱼鳍形的装饰，显得威武华丽。\n" +
            "仰韶文化的彩陶图案中有大量的动物形纹饰，如鱼、鹿、蛙等，以鱼纹最为典型。人面鱼纹彩陶盆是公认的彩陶艺术精品。类似内容的彩陶盆在遗址中出土了很多件，多作为儿童瓮棺的棺盖来使用，很像一种特制的葬具。人面由人鱼合体而成，人头装束奇特，像是进行某种宗教活动的化妆形象，具有巫师的身份特征，因此这类图画一般被认为象征着巫师请鱼神附体，为夭折的儿童招魂祈福。也有人认为人面与鱼纹共存构成人鱼合体，寓意鱼已经被充分神化，可能是作为图腾来加以崇拜。";
    pictureModelForShiqi.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/shiqishidai.jpg";
    pictureModelForShiqi.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/shiqishidai.jpg";
    pictureModelList.add(pictureModelForShiqi);

    // sample 2
    PictureModel pictureModelForZhanguo = new PictureModel();
    pictureModelForZhanguo.dynasty = "战国";
    pictureModelForZhanguo.pictureName = "人物驭龙图";
    pictureModelForZhanguo.descriptionTitle = "人物驭龙图";
    pictureModelForZhanguo.descriptionDetail =
        "帛画是一种可以挂在墙上陈列欣赏的装饰物，具有早期中国画的特征，产生在战国时期（公元前403--公元前221年）,至西汉发展到高峰。其中最能代表这个时期绘画艺术成就的遗物，是中国湖南省长沙出土的《人物龙凤图》和《人物御龙图》两件帛画，它们都是随葬的物品，具有送死者灵魂升天的含意。现存世帛画《楚帛书图像》，《人物龙凤》，《王堆汉墓帛画》，《金山汉墓画》还有《人物御龙图》都出土于长沙。\n" +
            "    这幅帛画一九七三年于湖南长沙子弹库楚墓出土，\n" +
            "可以说是《人物龙凤图》帛画的姊妹篇，二者从制作的时代到风格技法大体相同。但《人物御龙图》在绘画技巧上比前者更趋成熟，画面中心绘一有胡须的男子，侧身直立，身配宝剑，手执缰绳，驾驭着一条巨龙正向天国飞升。龙头高昂，身平伏呈舟形，翘起的尾上立一只鹭，圆目长嘴，顶有翰毛，仰首向天。画中人物上方有一舆盖，三条飘带随风拂动。绘者较好地把握了从细微的局部来烘托主题，画中龙、人物均面向左，而人物的飘带、舆盖上的饰物则向右，表现出 种较强的方向性和人御龙出行时的动感。\n" +
            "在中国传统文化中视“龙”为神物。是通天地之灵物，它可以载人或神上天或邀游太空。这虽是一种虚幻，但都反映出中华民族的先民们征服自然的浪漫主义气质。这幅帛画反映出先民们对人死后灵魂不灭，乘龙天游或乘龙升天的一种愿望。图中男子可能就是死者的侧面肖像。画中男子，高冠岌岌，长剑陆离。而白鹭象征着男子的人格风范，同时白鹭又是传说中仙境之物。整幅帛画呈现出男子走完了尘世之历程，踏上天游之行。御龙乘风白鹭相随，表现出男子轩昂自若的风度。这种广阔的襟宇，正是中华民族文化在艺术中的体现，反映出中华民族对生与死独特的认识。";
    pictureModelForZhanguo.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/zhanguo.jpg";
    pictureModelForZhanguo.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/zhanguo.jpg";
    pictureModelList.add(pictureModelForZhanguo);

    // sample 3
    PictureModel pictureModelForHandai = new PictureModel();
    pictureModelForHandai.dynasty = "汉代";
    pictureModelForHandai.pictureName = "车马过桥画像砖";
    pictureModelForHandai.descriptionTitle = "车马过桥画像砖";
    pictureModelForHandai.descriptionDetail =
        "画像砖起源于战国时期，盛行于两汉，多在墓室中构成壁画，也有的用在宫室建筑上。画像砖主要用木模压印，然后经火烧制成，也有的是在砖上刻出纹饰。画面的表现形式有浅浮雕、阴刻线条和凸刻线条。其题材可分为画像、文字和花纹等种类，画面内容丰富繁杂，因此，它们不仅是美术作品，记录当时社会生产、生活的实物资料，更是古代绘画和雕刻艺术高度结合的珍品，是研究中国雕刻工艺的重要实物资料。 \n" +
            "\n" +
            "汉代画像砖是汉代三大画像之一，其画像内容异常丰富，包含了汉代政治、经济、文化、民俗等各个方面，是我们研究汉代历史文化的“大百科全书”。\n" +
            "\n" +
            "汉代画像砖原本是一种嵌在墓壁上用于装饰墓室、炫耀墓主身份与地位的建筑装饰材料，造型上多为方形、长方形或条形。方形砖的尺寸一般在50×40厘米左右，制作较精，长方形砖尺寸一般在50×25厘米。由于在砖的表面或侧面采用模印、彩绘或雕刻等技法，将需要表现的图像呈现出来，深刻反映了汉代的社会风情和审美风格，给冰冷的建筑材料赋予了鲜活的生命，所代表的艺术审美，至今在中国美术发展史上占据着重要地位。\n" +
            "\n" +
            "关于马的题材画像，在汉代画像砖中表现比较多，如车马出行、狩猎、轺车、骑吏、车骑过桥等等，但这些有马的画像一般都不会单独出现，都是伴随着其他社会活动而出现在画像里。\n" +
            "\n" +
            "由于马早已融入到汉代社会生活的各个方面，与汉代人的日常生活密不可分，因此，在汉代画像砖上，所表现的很多画像题材上均能看见马的影子。";
    pictureModelForHandai.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/handai.jpg";
    pictureModelForHandai.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/handai.jpg";
    pictureModelList.add(pictureModelForHandai);

    // sample 4
    PictureModel pictureModelForSanguo = new PictureModel();
    pictureModelForSanguo.dynasty = "三国";
    pictureModelForSanguo.pictureName = "画赞序";
    pictureModelForSanguo.descriptionTitle = "画赞序";
    pictureModelForSanguo.descriptionDetail =
        "中国绘画艺术在汉代武帝、明帝时期，因帝王的提倡而盛极一时，皇宫收藏绘画作品极其丰富。但是，到了东汉末年，董卓之乱，献帝西迁，士兵们大量使用绘有图画的缣帛作行囊帐幕。 西迁途中，除使用外，还余七十多车备用，但因遇到大雨冲毁路基，车马行人举步维艰，于是，便将所余尽皆遗弃。这是中国绘画史上前所未有的灾难。对于刚刚兴起的中国绘画艺术，无疑是个严重的打击。之后，军阀混战，民不聊生，一些士族、王室贵族因苦于战乱而借绘画排遣消极情绪。与此同时，佛教进入中国，并迅速蔓延。因佛教思想与当时中国社会思潮吻合，于是形成了魏晋南北朝隋唐佛教题材的绘画盛行的时代。\n" +
            "\n" +
            "    在三国之前，绘画主要是“设色之工”所从事的职业，属于“百工之苑”，还没有进入艺术殿堂，因而也没有产生较为完整的绘画理论及较为成功的绘画作品。无论是“铸鼎像物”而“使民知神奸”（《左传》语）也好，或者是认为壁画是“明镜所以察形，往古者所以细今”（《孔子家语》语）也好，都充分强调了绘画的社会功能，而没有对其艺术性给予足够重视。到了三国时代（及之后的两晋南北朝），这种鉴戒规劝被残酷的社会现实击得粉碎，人们渴望安定、幸福、祥和的生活，于是，绘画中更多地加入了现实题材的内容，因此，绘画由说教发展到反映现实生活，向艺术化迈进了一大步。如嘉峪关出土的约在公元240——280年的魏晋墓室中，发现了镶嵌了六百多块描绘人物活动场面的砖画，其中人物千姿百态，神情各异。酒泉丁家闸出土的此期墓室中，还画上了一只神情惊异的猫在偷看一个裸体的女子在扫场院。江苏南京等地发掘的墓壁上，无功无禄、不礼不 法、非圣非贤、道遥自在的“竹林七贤”占据了原来被神仙灵异、忠臣义士所占据的地下殿堂。这些都说明了一个问题，即魏晋时期的绘画与思想解放相一致，都在追求人性解放、个性自由，追求自我的社会价值与审美实质。\n" +
            "\n" +
            "但是，尽管如此，相对于同期的政治、军事、文学人物来说，三国时期专门从事绘画的画家并不多，而且，有不少绘画仍是两汉绘画说教的继续，如曹植的《画赞序》就说明了这个问题。";
    pictureModelForSanguo.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/sanguo.jpg";
    pictureModelForSanguo.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/sanguo.jpg";
    pictureModelList.add(pictureModelForSanguo);

    // sample 5
    PictureModel pictureModelForLiangjin = new PictureModel();
    pictureModelForLiangjin.dynasty = "两晋南北朝";
    pictureModelForLiangjin.pictureName = "洛神赋图";
    pictureModelForLiangjin.descriptionTitle = "洛神赋图";
    pictureModelForLiangjin.descriptionDetail =
        "晋南北朝时期在艺术方面的变化更多的是体现在书法艺术方面，楷书真正出现了。绘画艺术的变化虽然不像书法那么显著，但是社会风气的变化，崇佛思想的上扬，都让本来简略明晰的绘画进一步变得繁复起来。曹不兴创立了佛画，他的弟子卫协在他的基础上又有所发展。作为绘画走向成熟的标志之一，南方出现了顾恺之、戴逵、陆探微、张僧繇等著名的画家，北方也出现了杨子华、曹仲达、田僧亮诸多大家，画家这一身份逐渐地进入了历史书籍的撰写之中，开始在社会生活中扮演愈来愈重要的角色。\n" +
            "在这一时期中，发展得最为突出的是人物画（包括佛教人物画）和走兽画，而中国绘画中的其他各科还远未成熟，东晋顾恺之的传世作品《洛神赋图》中出现的山水只是作为人物故事画的衬景，山水画的逐步独立直到南北朝后期才趋于完成。之所以会这样，也是由于这一时期绘画的主要任务决定的－－为政教服务，“是知存乎鉴戒者图画也”。这也是那时绘画的一个主要特点。\n" +
            "在《洛神赋图》中，作者把那位似去似来，飘忽无定、在水面上凌波微步的洛神描绘得非常娴雅而传情;通过处于惊疑、恍惚中的曹植，在洛水之滨与洛神遥遥相对、留恋徘徊可望而不可即的样子，传达出无限惆怅的情意和哀伤情调。清风微拂，河水泛流，从衣袖襟带到山水衬景，莫不生动谐调。其他如惊鸿游龙、云霞映月，奇禽异兽，车船马驾，结合想像与现实，将神人世界融成一片，充满了浪漫主义色彩和诗意气氛。图中山石树木的描绘，还处于单线勾勒、排列均匀、比例欠缺的不成熟阶段，反映出魏晋山水画的一般面貌。";
    pictureModelForLiangjin.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/liangjin.jpg";
    pictureModelForLiangjin.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/liangjin.jpg";
    pictureModelList.add(pictureModelForLiangjin);

    // sample 6
    PictureModel pictureModelForSuitang = new PictureModel();
    pictureModelForSuitang.dynasty = "隋唐";
    pictureModelForSuitang.pictureName = "送子天王图";
    pictureModelForSuitang.descriptionTitle = "送子天王图";
    pictureModelForSuitang.descriptionDetail =
        "作为一幅佛诞名画，可以从中看到佛教自印度传入中国后，经汉末而至盛唐，渐渐与中国文化融合：画中的人物已经本土化，不再是眼眶深凹、脸色黝黑，如达摩样，而完全是汉人模样。\n" +
            "作为一幅中国画，又昭示着线描的一个新时代的开始：由“铁线”衍生出“兰叶线”，从此中国画的线描技法大备，无怪乎苏东坡语：“画至吴道子，古今之变，天下之能事毕矣。”\n" +
            "   《送子天王图》反映了吴道子的基本画风。吴道子打破了长期以来沿袭的顾恺之陆探微“紧劲联绵，如春蚕吐丝”那种游丝描法，因为游丝描的线条圆润挺健，但如铁线一般而无变化。吴道子开创兰叶描，“行笔磊落，挥霍如莼莱条，圆间折算，方圆凹凸”。他用笔起伏变化，状势雄峻而疏放，表现了内在的精神力量。同时，他敷色比较简淡，甚至不着色。他在创作的时候，处于一种高度兴奋与紧张状态，很有点表现主义的味道。这些，似乎都透出了后来疏笔水墨画的先声。\n" +
            "吴道子所画的人物颇有特色，与晋人顾恺之、陆探微不同，以疏体而胜顾、陆的密体，笔不周而意足，貌有缺而神全；一变东晋顾恺之以来那种粗细一律的“铁线描”，突破南北朝“曹衣出水”的艺术形式，笔势圆转，衣服飘举，盈盈若舞，形成“吴带当风”的艺术风格，风行于时。吴道子善于把握住传神的法则，注意形象塑造的整体性。";
    pictureModelForSuitang.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/suitang.jpg";
    pictureModelForSuitang.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/suitang.jpg";
    pictureModelList.add(pictureModelForSuitang);

    return pictureModelList;
  }
}
