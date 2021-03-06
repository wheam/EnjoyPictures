package me.wheam.enjoypictures;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wheam@wandoujia.com (Qi Zhang)
 */
public class ModelFactory implements Serializable {

  public static List<DynastyModel> buildDynastyModelList() {
    List<DynastyModel> dynastyModelList = new ArrayList<DynastyModel>();
    DynastyModel dynastyModelForShiqi = new DynastyModel();
    dynastyModelForShiqi.dynastyName = "新石器时代";
    dynastyModelForShiqi.dynastyDuration = "公元前 1.4 万年 - 公元前 4000 年";
    dynastyModelForShiqi.descriptionDetail =
        "新石器时代指在考古学上是石器时代的最后一个阶段，以使用磨制石器为标志的人类物质文化发展阶段。这一名称是英国考古学家卢伯克于1865年首先提出的，这个时代在地质年代上已进入全新世，继旧石器时代之后，或经过中石器时代的过渡而发展起来，属于石器时代的后期。这个时代大约从1.4万年前开始，结束时间距今4000年左右。一般认为新石器时代有3个基本特征：1、开始制造和使用磨制石器 2、发明了陶器 3、出现了原始农业、畜牧业和手工业有的学者特别强调农业起源的意义，认为它才是新石器时代的主要特征，或者说是新石器时代革命的主要内容。世界各地这一时代的发展道路很不相同。有的地方在农业产生后的很长一段时期里没有陶器，因而被称为前陶新石器时代或无陶新石器时代；有的地方在1万多年以前就已出现陶器，却迟迟没有农业的痕迹，甚至磨制石器也很不发达。所以并不是3个特征齐备才能称新石器时代。";
    dynastyModelForShiqi.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/shiqi_dynasty.jpg";
    dynastyModelForShiqi.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/shiqi_dynasty.jpg";
    dynastyModelList.add(dynastyModelForShiqi);
    DynastyModel dynastyModelForZhanguo = new DynastyModel();
    dynastyModelForZhanguo.dynastyName = "春秋战国";
    dynastyModelForZhanguo.dynastyDuration = "公元前 770 年 － 公元前 221 年";
    dynastyModelForZhanguo.descriptionDetail =
        "\t中国春秋战国时代的绘画处于发展的初期阶段。绘画应用的范围主要是壁画、章服以及青铜器、玉器、牙骨雕刻、漆木器等的纹饰。早期基本上是装饰性图案，到西周以后，开始有以表现人物活动为主的纪事性绘画作品，其实物遗存，最早的见于春秋晚期的青铜器刻纹与镶嵌图像纹饰。商周时期在统治阶级服装和旌旗、器物上分别绘有各种图像，以标示等级身份的差别。图画文字商、西周、春秋青铜器铭文和甲骨文中有一部分图画文字，其中有一些是单体的人或动物形象，有的颇为逼真，如虎、牛、鸟、马、象、龟、鱼等。\n"
            +
            "春秋战国时期的绘画，正处在由萌芽向成熟的过渡阶段，其主要特征有如下几点:\n"
            +
            "　　中国画的基本特征至战国开始呈现出来，以线造型，线条运用已比较成熟，设色虽未脱离平涂的初起阶段，但渲染技法已开始使用。人物形象注意动态表现，五官表情尚无力作细致描绘。这是早期绘画不可避免的缺点。\n"
            +
            "　　春秋战国绘画受到社会实用功能制约，题材和手法都要受到限制，但在条件允许的范围内，匠师已熟练地掌握了写实和虚拟的手法，用于描绘不同的对象。\n";
    dynastyModelForZhanguo.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/zhanguo_dynasty.jpg";
    dynastyModelForZhanguo.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/zhanguo_dynasty.jpg";
    dynastyModelList.add(dynastyModelForZhanguo);
    DynastyModel dynastyModelForHandai = new DynastyModel();
    dynastyModelForHandai.dynastyName = "两汉";
    dynastyModelForHandai.dynastyDuration = "公元前 202 年 — 公元 220 年";
    dynastyModelForHandai.descriptionDetail =
        "中国从秦朝建立经西汉，至东汉灭亡这一时期的绘画艺术，在战国绘画发展的基础上，随着封建社会的日益巩固和上升，社会经济趋于繁荣和发展，而展现出新的面貌，更加重视绘画的政治功能和伦理教化作用。它将战国时期地域不同的绘画风格融合起来，形成雄厚博大、昂然向上的总的统一的时代风格。\n"
            +
            "\t秦汉时期，是中国统一的多民族封建国家的建立与巩固时期，也是中国民族艺术风格确立与发展的极为重要的时期。公元前221年，秦始皇统一中国后在政治、文化、经济领域的一系列改革使得社会产生了巨大的变化。为了宣扬功业，显示王权而进行的艺术活动，在事实上促进了绘画的发展。西汉统治者也同样重视可以为其政治宣传和道德说教服务的绘画，在西汉的武帝、昭帝、宣帝时期，绘画变成了褒奖功臣的有效方式，宫殿壁画建树非凡。东汉的皇帝们同样为了巩固天下，控制人心，鼓吹\"天人感应\"论及\"符瑞\"说，祥瑞图像及标榜忠、孝、节、义的历史故事成为画家的普遍创作题材。汉代厚葬习俗，使得我们今天可以从陆续发现的壁画墓、画像石及画像砖墓中见到当时绘画的遗迹。秦汉时代艺术以其深沉雄大的气魄，在中国美术史上放射着夺目的光彩。";
    dynastyModelForHandai.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/handai_dynasty.jpg";
    dynastyModelForHandai.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/handai_dynasty.jpg";
    dynastyModelList.add(dynastyModelForHandai);
    DynastyModel dynastyModelForSanguo = new DynastyModel();
    dynastyModelForSanguo.dynastyName = "三国";
    dynastyModelForSanguo.dynastyDuration = "公元 220 年 - 公元 280 年";
    dynastyModelForSanguo.descriptionDetail =
        "中国从三国鼎峙开始至隋王朝建国为止的绘画艺术。这一时期,上起三国曹魏,中历西晋、东晋、十六国，下迄南北朝至隋统一,历时369年。此间的绘画，在整个中国绘画发展历程中占有特殊重要的地位。\n"
            +
            "三国魏晋南北朝的历史，是由统一而分裂的过程。先是魏、蜀、吴三国鼎立，随后由司马家族统一为西晋，但十六国的连年战乱，使得中国再次进入了一个分裂的时代。5世纪时，由北魏的统一和相继分裂而形成的北朝和西晋王朝偏安江左后被宋、齐、梁、陈替代形成的南朝相互对峙。政治的不稳定、时局的混乱动荡，带来的是经济的普遍衰退，但在意识形态领域却有了超乎寻常的改变。此时的统治阶级早已被儒家思想所左右，民间的风气也随之俯仰。纷乱的社会，又给宗教的蔓延和传播创造了极好的机会，社会各个阶层都对佛教有了更为迫切的需要和更为广泛的接受。作为社会意识形态的映象之一的书画艺术在此时也发生了强烈的变化。绘画中的人物画得到了突出的发展，对其他对象的描绘则还处在很不成熟的阶段。";
    dynastyModelForSanguo.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/sanguo_dynasty.jpg";
    dynastyModelForSanguo.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/sanguo_dynasty.jpg";
    dynastyModelList.add(dynastyModelForSanguo);
    DynastyModel dynastyModelForLiangjin = new DynastyModel();
    dynastyModelForLiangjin.dynastyName = "两晋南北朝";
    dynastyModelForLiangjin.dynastyDuration = "公元 280 年 — 公元 589 年";
    dynastyModelForLiangjin.descriptionDetail =
        "两晋南北朝时期在艺术方面的变化更多的是体现在书法艺术方面，楷书真正出现了。绘画艺术的变化虽然不像书法那么显著，但是社会风气的变化，崇佛思想的上扬，都让本来简略明晰的绘画进一步变得繁复起来。曹不兴创立了佛画，他的弟子卫协在他的基础上又有所发展。作为绘画走向成熟的标志之一，南方出现了顾恺之、戴逵、陆探微、张僧繇等著名的画家，北方也出现了杨子华、曹仲达、田僧亮诸多大家，画家这一身份逐渐地进入了历史书籍的撰写之中，开始在社会生活中扮演愈来愈重要的角色。\n"
            +
            "在这一时期中，发展得最为突出的是人物画（包括佛教人物画）和走兽画，而中国绘画中的其他各科还远未成熟，东晋顾恺之的传世作品《洛神赋图》中出现的山水只是作为人物故事画的衬景，山水画的逐步独立直到南北朝后期才趋于完成。之所以会这样，也是由于这一时期绘画的主要任务决定的－－为政教服务，“是知存乎鉴戒者图画也”。这也是那时绘画的一个主要特点。";
    dynastyModelForLiangjin.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/liangjin_dynasty.jpg";
    dynastyModelForLiangjin.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/liangjin_dynasty.jpg";
    dynastyModelList.add(dynastyModelForLiangjin);
    DynastyModel dynastyModelForSuitang = new DynastyModel();
    dynastyModelForSuitang.dynastyName = "隋唐";
    dynastyModelForSuitang.dynastyDuration = "公元 581年 — 907 年";
    dynastyModelForSuitang.descriptionDetail =
        "隋代国祚仅38年，但绘画成就显著。由于国家统一，南北地区的名家巨匠如杨子华、展子虔、董伯仁、郑法士、孙尚子、阎毗等人，云集京洛，得以相互借鉴和交流。隋代统治者复兴佛教，使北周灭法中遭受打击的佛教又得以抬头和传播。隋文帝下诏修建寺院，宗教美术又重新活跃,并有大规模创作活动，长安、洛阳、江都等地寺庙都有名家手笔。敦煌莫高窟现有隋窟70余座，题材和风格都在进行新的探索。自南北朝兴起的描绘贵族人物肖像和生活风俗的绘画也有较大发展，以描写山川风景为主的山水画则开始脱离稚拙而逐渐进入成熟阶段。隋代统治者对古书画的收藏也比较重视，隋灭陈时即将其宫廷收藏尽数收纳，隋炀帝时又于洛阳观文殿后建妙楷台、宝迹台，分别收藏法书名画。隋代绘画的发展为唐代绘画艺术高度繁荣奠定了基础。\n"
            +
            "唐代绘画是中国封建社会绘画的巅峰，其艺术成就大大超过往代。初唐绘画即显示出不寻常的成就，唐太宗在巩固政权的同时也注意文治建设，阎立德、阎立本兄弟及尉迟乙僧的绘画活动,以及以敦煌220窟为代表的壁画体现着此一时期绘画艺术的最高成就。高宗李治至玄宗李隆基统治时期，在政权昌盛、社会富庶的基础上，使文化出现了丰富多彩、百舸争流的局面，吴道子及其画派体现了佛教美术民族化的巨大成就，钱国养、殷□ 、殷季友、法明等人的肖像画，张萱、杨宁的绮罗人物画，陈闳、韦无忝、曹霸、韩□的鞍马画，李思训、李昭道父子、卢鸿、郑虔等人的山水画，冯绍正、薛稷、姜皎等人的花鸟鹰鹤画等，寓示了题材的扩大。敦煌壁画在此时也发展到繁荣的顶点,莫高窟第130窟的乐庭□夫妇大供养像、172窟、217窟之巨幅净土变相、173窟之维摩变相都是宏 伟精妙的壁画杰作。";
    dynastyModelForSuitang.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/suitang_dynasty.jpg";
    dynastyModelForSuitang.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/suitang_dynasty.jpg";
    dynastyModelList.add(dynastyModelForSuitang);

    DynastyModel dynastyModelForSong = new DynastyModel();
    dynastyModelForSong.dynastyName = "两宋";
    dynastyModelForSong.dynastyDuration = "公元 960 年 — 公元 1279 年";
    dynastyModelForSong.descriptionDetail =
        "宋代绘画是在中国宋代期间的绘画作品，中国宋朝延续300多年，其绘画在隋唐五代的基础上继续得到发展。民间绘画、宫廷绘画、士大夫绘画各自形成体系，彼此间又互相影响、吸收、渗透，构成宋代绘画丰富多彩的面貌。\n"
            +
            "北宋统一消除了封建割据造成的分裂和隔阂，在一段时期内社会保持着相对安定局面，商业手工业迅速发展，城市布局打破坊和市的严格界限，出现空前未有的繁荣。南宋虽然偏安江南，由于物产丰盛的江、浙、湖、广地区都在其境内，大量南迁的北方人和南方人一起共同开发江南，经济、文化都得到继续发展并超过北方。北宋的汴梁（今河南省开封市）、南宋的临安（今浙江省杭州市）等城市商业繁盛，除贵族聚集外，还住有大量的商人、手工业者和市民阶层，城市文化生活空前活跃，绘画的需求量明显增长，绘画的服务对象也有所扩大，为绘画发展和繁荣提供了物质条件和群众基础。\n"
            +
            "宋代绘画进入手工业商业行列，与更多的群众建立较为密切的联系。一批技艺精湛的职业画家，将作品作为商品在市场上出售，汴京及临安都有纸画行业。汴京大相国寺每月开放5次庙会，百货云集，其中就有售卖书籍和图画的摊店；南宋临安夜市也有细画扇面、梅竹扇面出售；汴京、临安等地的酒楼也以悬挂字画美化店堂，作为吸引顾客的手段。市民遇有喜庆宴会，所需要的屏风、画帐、书画陈设等都可以租赁。适应年节的需要，岁末时又有门神、钟馗等节令画售卖，为市甚盛。北宋时，汴京善画“照盆孩儿”的画家刘宗道，每创新稿必画出几百幅在市场一次售出，以防别人仿制；专画楼阁建筑的赵楼台；画婴儿的杜孩儿，也在汴京享有盛名。吴兴籍军人燕文贵常到汴京州桥一带卖画。山西绛州杨威，善画村田乐，每有汴京贩画商人买画，他即嘱其如到画院门前去卖，可得高价。社会对绘画的需求和民间职业画家创作的活跃，是推动宋代绘画发展的重要因素。宋代由于手工业的发达，促成了雕版印刷的发展与普及，出现了汴京、临安、平阳、成都、建阳等雕版中心，不少书籍及佛经都附有版画插图，现存宋金雕印的弥勒像、陀罗尼经咒、《佛国禅师文殊指南图赞》、《赵城藏》等，可见其绘刻之精美程度。\n";
    dynastyModelForSong.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/song_dynasty.jpg";
    dynastyModelForSong.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/song_dynasty.jpg";
    dynastyModelList.add(dynastyModelForSong);

    DynastyModel dynastyModelForYuan = new DynastyModel();
    dynastyModelForYuan.dynastyName = "元朝";
    dynastyModelForYuan.dynastyDuration = "公元 1271 年 — 公元 1368 年";
    dynastyModelForYuan.descriptionDetail =
        "元代绘画中，文人画占据画坛主流。因元代未设画院，除少数专业画家直接服务于宫廷外，大都是身居高位的士大夫画家和在野的文人画家。他们的创作比较自由，多表现自身的生活环境、情趣和理想。山水、枯木、竹石、梅兰等题材大量出现，直接反映社会生活的人物画减少。作品强调文学性和笔墨韵味，重视以书法用笔入画和诗、书、画的三结合。在创作思想上继承北宋末年文同、苏轼、米芾等人的文人画理论，提倡遗貌求神，以简逸为上，追求古意和士气，重视主观意兴的抒发。与宋代院体画的刻意求工、注重形似大相径庭，形成鲜明的时代风貌，也有力地推动了后世文人画的蓬勃发展。在元代短短90余年内，画坛名家辈出，其中以钱选、高克恭、王渊等和号称元四家的黄公望、吴镇、倪瓒、王蒙最负盛名。\n"
            +
            "元代绘画以山水画为最盛，其创作思想、艺术追求、风格面貌，均反映了画坛的主要倾向，影响后世也最深远。元初山水画家以钱选、高克恭为代表，他们均对传统山水画进行了认真探索，并托复古以寻求新路。钱选善画青绿山水，师法唐代李思训、李昭道父子和南宋赵伯驹，并融进文人画的笔意和气韵，具有一种生拙之趣。赵孟頫的山水画，广泛吸收名家之长，强调书画同源，并将书法用笔引入绘画创作中，形成多种面貌。他早年学晋唐，多青绿设色，如<幼舆丘壑图> ，空勾填色，不加皴点，格调古拙；46岁以后师法五代董源和北宋李成、郭熙，以水墨为主，有时将水墨与青绿画法有机结合，一扫南宋院体积习，发展了山水画的表现技法，成就突出。高克恭变化出入于米芾、董源、李成之间，形成了浑穆秀润的独特风格，在元初与赵孟頫、钱选并驱。 元代中后期，崛起黄公望、王蒙、吴镇、倪瓒这四大家。他们主要继承董源、巨然等的山水画传统，在创作思想和创作方法上，直接或间接地受到赵孟□的影响，又各具特色。黄公望发展了赵孟頫的水墨画法，并上追董源、巨然，多用披麻皴，晚年大变其法，自成一家。其作品有浅绛和水墨两种面貌。他的浅绛山水，烟云流润、笔墨秀逸、气势雄浑；水墨山水，萧散苍秀、笔墨洒脱、境界高旷，其韵致高于赵孟頫。王蒙是赵孟頫外孙，除受赵孟頫影响外，也曾得黄公望指点，又直窥董源、巨然画法。他的山水画以水墨为主，间或设色，善用枯笔，创牛毛皴、解索皴法。其作品布局饱满、结构茂密，山峦多至远近10层，树木不下几十种，笔法苍浑，有蓊郁秀逸、浑厚华滋之致。\n";
    dynastyModelForYuan.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/yuan_dynasty.jpg";
    dynastyModelForYuan.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/yuan_dynasty.jpg";
    dynastyModelList.add(dynastyModelForYuan);

    DynastyModel dynastyModelForMing = new DynastyModel();
    dynastyModelForMing.dynastyName = "明朝";
    dynastyModelForMing.dynastyDuration = "公元 1368 年 — 公元 1644 年";
    dynastyModelForMing.descriptionDetail =
        "在中国绘画史上，明代画风迭变，画派繁兴。在绘画的门类、题材方面，传统的人物画、山水画、花岛画盛行，文人墨戏画的梅、兰、竹及杂画等也相当发达。在艺术流派方面，涌现出众多以地区为中心、或以风格相区别的绘画派系。在师承方面，主要有师承南宋院体风格的宫廷绘画和浙派，以及发展文人画传统的吴门派和松江派、苏松派等两大派系。在画法方面，水墨山水和写意花鸟勃兴，成就显著，人物画也出现了变形人物、墨骨敷彩肖像等独特的新面貌。\n"
            +
            "明代早期，江南地区还有一批继承元代水墨画传统的文人画家，如徐贲、王绂、刘珏、杜琼、姚绶等人。徐贲山水承董源、巨然，笔法苍劲秀润。王绂喜用披麻兼折带皴作山水，繁复似王蒙，墨竹挺秀潇洒，被称为明代“开山手”。刘珏山水取景幽深，笔墨浓郁，近王蒙、吴镇。杜琼善水墨浅绛山水，多用干笔皴染。姚绶主要师法吴镇、王蒙，风格苍厚。他们的画风堪称吴门派先驱。\n"
            +
            "　　还有一些画家，虽未归宗立派，亦各有建树。如初宗马远、夏圭，后师法自然，以画《华山图》著名的王履；被称为院派，给唐寅、仇英以较大影响的周臣；擅长水墨写意人物和山水的郭诩、史忠；以白描人物著称的杜堇等人。\n"
            +
            "明代后期山水画，以张宏为最著名，吴门画派到此进入全盛时期。并对其他画派产生深远影响，其中较著名的画家有莫是龙，受吴门派影响的晚期画家还有程嘉燧、李流芳、卞文瑜、邵弥、杨文□等人。程嘉燧的山水枯简疏放，李流芳爽朗清秀，卞文瑜细秀，邵弥简逸，杨文兼具枯笔、秀润两种风貌。\n";
    dynastyModelForMing.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/ming_dynasty.jpg";
    dynastyModelForMing.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/ming_dynasty.jpg";
    dynastyModelList.add(dynastyModelForMing);

    DynastyModel dynastyModelForQing = new DynastyModel();
    dynastyModelForQing.dynastyName = "清朝";
    dynastyModelForQing.dynastyDuration = "公元 1636 年 — 公元 1912 年";
    dynastyModelForQing.descriptionDetail =
        "  清代绘画，在当时政治、经济、思想、文化等方面的影响下，呈现出特定的时代风貌。卷轴画延续元、明以来的趋势，文人画风靡，山水画勃兴，水墨写意画法盛行。文人画呈现出崇古和创新两种趋向。在题材内容、思想情趣、笔墨技巧等方面各有不同的追求，并形成纷繁的风格和流派。宫廷绘画在康熙、乾隆时期也获得了较大的发展，并呈现出迥异前代院体的新风貌。民间绘画以年画和版画的成就最为突出，呈现空前繁盛的局面。清代绘画发展的历史进程，与整个社会的发展变迁相联系，亦可分为早、中、晚3个时期。\n"
            +
            "文人画日益占据画坛主流，山水画的创作及水墨写意画盛行。画坛流派之多，前所未有。清代绘画，分早，中，晚三期，初期以四王为代表江南出现了反正统的画家，有髡残，石涛，朱耷，弘仁等四僧。以龚贤为代表的金陵八家，以查士标，梅清为代表的新安派等。中期，出现了康乾盛世，绘画也大发展，人物画的成就也最为突出。同时，在商品经济发达的扬州，掀起了一股新的艺术潮流，形成了以扬州八怪为代表的扬州画派，对近现代的花鸟都产生了深远的影响。后期，中国逐渐沦为半殖民地半封建社会，画坛也随之发生了极大变化。形成了以新兴商业城市为中心的新技巧，新风格的新画派。主要有以四任为代表的海派和广东居廉，居巢，高剑父，高奇峰为代表的岭南画派。\n"
            +
            "清朝初期，以四王和吴恽为代表的画坛六大家成为正统派。四僧和金陵八家，新安画派，江西派等各擅长。\n" +
            "清朝中期，以扬州八怪，宫廷画家和高其佩为代表的指画家成为这一时期的主流. 清朝后期，以海派和岭南派画家为主体，另有改琦，费丹旭等人物和戴熙等山水画家。\n";
    dynastyModelForQing.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/qing_dynasty.jpg";
    dynastyModelForQing.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/qing_dynasty.jpg";
    dynastyModelList.add(dynastyModelForQing);

    return dynastyModelList;
  }

  public static List<ArtistModel> buildArtistModelList() {
    List<ArtistModel> artistModelList = new ArrayList<ArtistModel>();
    ArtistModel artistModelForShiqi = new ArtistModel();
    artistModelForShiqi.artistName = "陶工匠";
    artistModelForShiqi.dynasty = "石器时代";
    artistModelForShiqi.descriptionDetail =
        "作为中国原始社会先民的艺术杰作，当时还没有职业的画家，但蕴含在人面鱼纹陶盆中的工艺和艺术家的心血，也可以视为古代艺术的起源。\n"
            +
            "\t有人认为，此图反映了半坡人和鱼之间的密切关系和特殊的感情，是半坡氏族崇奉的图腾。半坡人在河谷阶地营建聚落，生活方式与渔猎密不可分，他们喜爱鱼崇拜鱼，认为其氏族起源于鱼，故把鱼奉做自己氏族的图腾祖先加以崇拜，人与鱼组合画在一起，代表着人与鱼是不可分的，你中有我、我中有你，共生共存，能力“互渗”。此外，古籍记有人鱼互变的神话，《山海经》说颛顼死后复苏化身为鱼，变形的鱼纹很可能是代表人格化的独立神灵———鱼神。有人以《诗经》《周易》中鱼有隐喻“男女相合”之义推之，这人面鱼纹也应有祈求生殖繁衍族丁兴旺的含义。 \n"
            +
            "\n"
            +
            "\t无论半坡人用这种图案表达什么思想意识，能够把如此丰富的社会内容凝聚于绘画艺术之中的这种创作动机，都是令人惊叹的。今天的人们无法知道它的真实含义，但它仍然给人以强烈的印象和美的感受，使人产生对悠久历史之谜的探究渴望。半坡博物馆宣称，他们将组织专家对围绕人面鱼纹盆所引起的种种谜团进行破解，人们期待着谜底的早日揭开。";
    artistModelForShiqi.littlePictureUrl = "http://7u2h6n.com1.z0.glb.clouddn.com/shiqi_artist.jpg";
    artistModelForShiqi.bigPictureUrl = "http://7u2h6n.com1.z0.glb.clouddn.com/shiqi_artist.jpg";
    artistModelList.add(artistModelForShiqi);
    ArtistModel artistModelForZhanguo = new ArtistModel();
    artistModelForZhanguo.artistName = "宫廷匠师";
    artistModelForZhanguo.dynasty = "春秋战国";
    artistModelForZhanguo.descriptionDetail =
        "　　匠师们在用笔用色等绘画创作实践上积累了一定的经验，墨线勾画人物的技法为后世传统绘画表现技法的发展奠定了一定的基础。但构图和技法处在幼稚阶段，匠师还没有掌握透视法则，处理形象的前后关系，通常采取上下层隔开的形式：上层表现远，下层表现近。形象角度只有正面和正侧面两种，没有半侧面形象。这种手法直至汉代仍在沿用。但战国时已出现了透视画法的尝试，例如湖北荆门包山楚墓出土的漆奁画面描绘正侧面车马形象，辕和马的画法已是近视线的一匹马绘全身，稍远的则在它身后显露出头和脊背，比起一些镶嵌图像中将四匹马平列在车辕上下，上侧两匹足朝天，下侧两匹足朝地的办法，明显进步了。战国末至秦的咸阳宫壁画的车马，也已采用这样的构图。\n"
            +
            "　　由于绘画用场日益扩大，特别是在装点统治者的生活方面越来越显示它的作用，引起政治家和哲学家的关注，绘画活动被用来阐述政治观点和哲理。如韩非子关于画“狗马难、鬼魅易”的论述；记述漆工花三年功夫“画荚”，初看与一般漆器无别，在早晨太阳刚刚出来时放到特制的窗口前对照太阳观看时，发现荚上有龙蛇车马之状，非常壮观。又如楚国诗人屈原对着祠庙里的大型壁画，联系自己的遭遇，对天发问，写成千古名篇《天问》。再如庄子描写宋国画史“解衣磅礴，裸”，舐笔和墨作画时的心态，也是重要的绘画史料。\n";
    artistModelForZhanguo.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/zhanguo_artist.jpg";
    artistModelForZhanguo.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/zhanguo_artist.jpg";
    artistModelList.add(artistModelForZhanguo);
    ArtistModel artistModelForHandai = new ArtistModel();
    artistModelForHandai.artistName = "画工";
    artistModelForHandai.dynasty = "两汉";
    artistModelForHandai.descriptionDetail =
        "\t秦汉时代的绘画艺术，大致包括宫殿寺观壁画、墓室壁画、帛画等门类。 秦代的绘画，实物流传极为稀少。现在能够据以了解秦代绘画面 貌的遗物，仅是历年来从陕西临潼、凤翔等地出土的模印画像砖，咸阳秦宫遗址出土的壁画残片、刻纹画像砖、建筑瓦当纹样，以及在其他地区发现的少量工艺品上的装饰图案等。汉代历时4个多世纪，是我国传统美术特定的民族精神与形式风格基本确立并得到进一步发展巩固的重要时期。汉代统治者非常重视绘画艺术，毛延寿、樊育、陈敞、刘白等都是后世知名的御用画工。\n"
            +
            "\t1972至1974年间，湖南长沙马王堆两座汉墓以及山东临沂全雀山九号汉墓的几幅彩绘帛的相继出土，丰富了汉代绘画的实物资料，弥补了汉初绘画的空白，使人们对于西汉绘画的实际面貌有了清晰的认识。其中以马王堆一号墓彩绘画最为成熟，是迄今发现的我国最早的工笔重彩画珍品，勾线匀细有力，飞游腾跃，与后人总结的\"高古游丝描\"相符;设色以矿物颜料为主，厚重沉稳，鲜丽夺目而又谐调;构图以密托疏，采用规整、均衡的图案结构与写实形象相结合的手法，主体突出，上下连贯，丰富而又奇变动人。在马王堆三号墓，还有3件值得注意的帛画作品。其一是藏在漆奄之内的气功强身图解，人物单个排列，以显示各自的健身体态，形貌服饰各个不同。另两幅分别张挂在棺室东西壁上，其内容被认为是表现统治者的“耕祠”活动，有车马，仪仗之属，数以百计，可谓洋洋大观;构图上克服了先奏时期人物上下平列的手法，用俯视的角度来描绘车马仪仗行列的全貌，这是时下所见最早的记录现实生活的大型绘画作品。惜剥损较重，只能观其大略。\n"
            +
            "\t由于社会风俗习惯的改变，战国时期在绘画中占据主导地位的（从遗存物看）青铜器、漆器上的装饰性绘画，让位于纯绘画的宫殿壁画、地上建筑壁画、墓室壁画及与此相关的画像石、画像砖等。作为用于丧葬的丝织帛画继续流行，漆器上的绘画也得到进一步发展和提高。在对外交流中，不断吸收域外艺术的新因素。因此，秦汉绘画在题材内容和表现形式及技法方面，均较战国绘画有了巨大的丰富、提高和拓展，呈现出一派充满生机与活力的繁荣景象，为以后绘画艺术的发展奠定了坚实的基础，成为中国绘画史上的第一个发展高潮。";
    artistModelForHandai.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/handai_artist.jpg";
    artistModelForHandai.bigPictureUrl = "http://7u2h6n.com1.z0.glb.clouddn.com/handai_artist.jpg";
    artistModelList.add(artistModelForHandai);
    ArtistModel artistModelForSanguo = new ArtistModel();
    artistModelForSanguo.artistName = "曹植";
    artistModelForSanguo.dynasty = "三国";
    artistModelForSanguo.descriptionDetail =
        "   曹植（192—232），三国魏人，字子建，沛国谯（今安徽亳县）人。曹操第三子，封陈王，谥思，世称陈思王，他以诗文著称，十岁属文，援笔立成，后人以“绣虎”形容其文风丰美雄健。有《曹子建集》十卷。他关于绘画的观点集中在《画赞序》一文中。所谓“画赞”，始于汉代，以评价画像中的人物为主旨的一种文体，曹植继汉人遗风，所作画像赞包括庖犠、女娲以来的始祖、圣君、隐士等，共31则，今存《画赞序》，是中国绘画史上第一篇专门论画的文章。\n"
            +
            "曹植才华横溢，传为他所作的《七步诗》妇孺皆知。六朝山水诗人谢灵运赞其“才高八斗”，无人可比：“天下才有一石，曹子建独占八斗，我得一斗，天下共分一斗。”曹植《与杨德祖书》中“辞赋小道，固未足以揄扬大义，彰示来世也。”一句亦引发诸多争议。曹丕《典论·论文》云：“盖文章，经国之大业，不朽之盛事。” 认为文章是可以辅佐政教统治天下的大事，应当推为历代不朽之事业。从字面看，曹植与其兄曹丕观点相左，实际上，曹植所传达的仍然是“达则兼济天下，穷则独善其身”历代文人的根本价值观，体现了意欲建功立业而不得的在野文人的无奈。曹丕、曹植所论并无矛盾之处，恰是朝野不同立场的文人内心世界的真实展现。\n"
            +
            "《画赞序》云：\n"
            +
            "盖画者，鸟书之流也。昔明德马后美于色，厚于德，帝用嘉之。尝从观画。过虞舜之像，见娥皇女英。帝指之戏后曰：“恨不得如此人为妃。”又前，见陶唐之像。后指尧曰：“嗟乎！群臣百僚，恨不得戴君如是。”帝顾而咨嗟焉。故夫画，所见多矣，上形太极混元之前，却列将来未萌之事。（《艺文类聚》卷七十四）\n"
            +
            "曹植以帝、后观画之例喻绘画的功能。“画者，鸟书之流也。”这句话，阐明了绘画之起源，亦隐含了后世所云“书画同源”之意。他进而指出绘画的鉴戒功能之所以得以实现和倡扬，根本原因在于绘画能有力地作用于人们的感情：\n"
            +
            "观画者，见三皇五帝，莫不仰戴；见三季暴主，莫不悲惋；见篡臣贼嗣，莫不切齿；见高节妙士，莫不忘食；见忠节死难，莫不抗首；见放臣斥子，莫不叹息；见淫夫妒妇，莫不侧目；见令妃顺后，莫不嘉贵。是知存乎鉴戒者，图画也。（《全三国文》卷十七）\n"
            +
            "曹植对情感的重视是他诗文创作的一大特点，所作《洛神赋》即是描写黄初四年（223年）赴洛阳朝觐魏文帝曹丕的归途中，在洛水边邂逅洛水女神宓妃，两人互传情愫，却无奈别离的爱情故事。凄美的哀情绝恋激发了历代文人墨客的创作愿望，以不同的方式传诵至今。《画赞序》丰富了以往绘画教化功能的内容，由于艺术能够以其独有的感染力潜移默化地作用于人的情感，绘画的教育功能才得以恒久的倡导和发展。曹植指出“观画者”见“三皇五帝”、“三季暴主”、“篡臣贼嗣”、“高节妙士”、“忠节死难”、“放臣斥子”、“淫夫妒妇”、“令妃顺后”，莫不产生“仰戴”、“悲惋”、“切齿”、“忘食”、“抗首”、“叹息”、“侧目”、“嘉贵”等不同的感情，第一次将绘画的表现与观者情感密切联系，点明了绘画的“存乎鉴戒”绝非直接地说理教训，而是以“情”动人。\n"
            +
            "序文最终归纳：“是知存乎鉴戒者，图画也”，承续了儒家政教观点，是典型的绘画教育功能的体现，这一观点是对绘画发展初期主要功能的总结，并不是曹植的独创，然而曹植挖掘出绘画之所以能够实现其教化功能的根本原因——即对观画者情感的作用，是值得我们重视的。";
    artistModelForSanguo.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/sanguo_artist.jpg";
    artistModelForSanguo.bigPictureUrl = "http://7u2h6n.com1.z0.glb.clouddn.com/sanguo_artist.jpg";
    artistModelList.add(artistModelForSanguo);
    ArtistModel artistModelForLiangjin = new ArtistModel();
    artistModelForLiangjin.artistName = "顾恺之";
    artistModelForLiangjin.dynasty = "两晋南北朝";
    artistModelForLiangjin.descriptionDetail =
        "   顾恺之（348年— 409年），字长康，小字虎头，汉族，晋陵无锡（今江苏焦溪）人。顾恺之博学多才，擅诗赋、书法，尤善绘画。精于人像、佛像、禽兽、山水等，时人称之为三绝：画绝、文绝和痴绝。谢安深重之，以为苍生以来未之有。顾恺之与曹不兴、陆探微、张僧繇合称“六朝四大家”。顾恺之作画，意在传神，其“迁想妙得” “以形写神”等论点，为中国传统绘画的发展奠定了基础。\n"
            +
            "顾恺之的作品，据唐宋人的记载，除了一些政治上的名人肖像以外，也画有一些佛教的图像，这是当时流行的一部分题材。另外还有飞禽走兽，这种题材和汉代的绘画有联系。他也画了一些神仙的图像，因为那也是当时流行的信仰。而最值得注意的是他画了不少名士们的肖像。这就改变了汉代以宣扬礼教为主的风气，而反映了观察人物的新的方法和艺术表现的新的目的，即：离开礼教和政治而重视人物的言论丰采和才华。这表示绘画艺术视野的扩大；从而为人物画提出了新的要求——表现人的性格和精神特点。 在顾恺之的著作言论中，我们见到他反复强调描写人的神情和精神状态。顾恺之和陆探微、张僧繇是南北朝时期的三位最重要画家，代表了汉代美术得到迅速发展和成熟的人物画艺术。唐代张怀瓘对其画评价甚高，云：\"张僧繇得其肉，陆探微得其骨，顾恺之得其神。\"";
    artistModelForLiangjin.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/liangjin_artist.jpg";
    artistModelForLiangjin.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/liangjin_artist.jpg";
    artistModelList.add(artistModelForLiangjin);
    ArtistModel artistModelForSuitang = new ArtistModel();
    artistModelForSuitang.artistName = "吴道子";
    artistModelForSuitang.dynasty = "隋唐";
    artistModelForSuitang.descriptionDetail =
        "\t吴道子，（约公元680～759年），唐代著名画家，画史尊称画圣，又名道玄。汉族，阳翟（今河南禹州）人。约生于公元680（永隆一年） ，卒于公元758（乾元元年）前后。少孤贫，年轻时即有画名。曾任兖州瑕丘（今山东滋阳）县尉，不久即辞职。后流落洛阳，从事壁画创作。开元年间以善画被召入宫廷，历任供奉、内教博士、宁王友。曾随张旭、贺知章学习书法，通过观赏公孙大娘舞剑，体会用笔之道。擅佛道、神鬼、人物、山水、鸟兽、草木、楼阁等，尤精于佛道、人物，长于壁画创作。\n"
            +
            "    由于他能“穷丹青之妙”，在画坛上有些名气，公元713年左右，即被唐玄宗召到京都长安，入内供奉，充任内教博士，并命他“非有诏不得画”。后官至“宁王友”。吴道子入内供奉之后，多在宫中作画，有时也随从玄宗巡游各地。一次，他随驾去东都洛阳，会见了将军裴旻和书法家张旭，三人各自表演了自己的绝技：裴旻善于舞剑，当即舞剑一曲；张旭长于草书，挥毫泼墨，作书壁；吴道子也奋笔作画，“俄顷而就，有若神助”。\n"
            +
            "    公元725（开元十三年），唐玄宗东封泰山，吴道子陪同前往。事后还至潞州（今山西长治），车驾过金桥，御路“曲折萦转”。玄宗见数千里间“旗鲜洁，羽卫整肃”，心中非常兴奋，对左右侍从说：“张说言‘勒兵三十万，旌旗千里间，陕右上党，至于太原’。真才子也。”左右皆呼万岁。于是召来吴道子、韦无忝、陈闳等，命他们三人共同绘制《金桥图》。陈闳主画玄宗真容及所乘照夜白马，韦无忝主画狗马、骡驴、牛羊等动物之类，而桥梁、山水、车舆、人物、草树、雁鸟、器仗、帷幕等主题部分则由吴道子主画。《金桥图》绘成后，“时谓三绝”。";
    artistModelForSuitang.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/suitang_artist.jpg";
    artistModelForSuitang.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/suitang_artist.jpg";
    artistModelList.add(artistModelForSuitang);

    ArtistModel artistModelForSong = new ArtistModel();
    artistModelForSong.artistName = "李唐";
    artistModelForSong.dynasty = "两宋";
    artistModelForSong.descriptionDetail =
        "李唐，1066年生，1150年逝世，河阳三城（今河南孟县）人。北宋末南宋初画家。字晞古。初以卖画为生，徽宗赵佶朝（1100～1125）补入画院。高宗南渡，李唐亦流亡至临安，以成忠郎衔任画院待诏，时年近八十。擅画山水，变荆浩、范宽之法，用峭劲的笔墨，写出山川雄峻的气势。晚年去繁就简，创“大斧劈”皴，所画石质坚硬，立体感强。他画的山水画对南宋画院有极大的影响，是南宋山水新画风的标志。兼工人物，初似李公麟，后衣褶变为方折劲硬，并以画牛著称。李唐的画风为刘松年、马远、夏圭、萧照等师法，在南宋一代传流很广，对后世影响很大。存世作品有《万壑松风》、《清溪渔隐》、《长夏江寺》、《采薇》等图。《采薇图》，绢本，淡设色，纵27.2厘米，横90.5厘米。现藏北京故宫博物院。画商末伯夷、叔齐不食周粟，避于首阳山采薇（俗名野豌豆），最后饿死的故事。借以颂扬民族气节，间接地表达了他反对民族投降屈服的立场，有的题跋也指出此画是“为南渡降臣发”。画面采用截取式构图，图绘半山之腰，苍藤、古松之阴，伯夷与叔齐采摘薇蕨，其间正在休息对话的情景。两位主人公画得笔墨劲秀，衣纹简劲爽利，神态生动，殷殷凄凄，若声出绢素。树石笔墨粗简，墨色湿润，已开马远、夏圭法门。画中石壁上有“河阳李唐画伯夷、叔齐”题款两行\n"
            +
            "画面绘长松深壑，主峰耸峙，岩石壁立，山泉奔流。画家虽采用北宋山水作品的全景式构图，便取景的视点已拉得较近，用质实坚重的大斧劈皴表现岩石的方峻峭硬，加之用墨浓重，很好地表现出山水的壮美，给人以很强的视觉震撼。画上署有[皇宋宣和甲辰春河阳李唐笔]隶书款。宣和甲辰为宣和六年（公元一一二四年），李唐时年已七十岁左右，可知是他南渡前的作品。他此时的画法既有范宽画风的影响，又具有一些新的特征，反映出北宋末期的山水画在继承中的嬗变。本幅上钤有南宋贾似道“悦生”葫芦印，明初“典礼纪察司印”半印、清初梁清标及清内府鉴藏印，《石渠宝笈三编》著录。\n"
            +
            "作者的构图与其他山水稍有不同，虽取全景，但不突出主峰，通过环绕着的松林将峰顶连成一个统一的整体，近、中、远三个空间层次表现得自然得体。全图的笔墨沉厚浑朴而不失腴润秀雅，天趣盎然。山腰处多多白云，好像冉冉欲动，一方面把群山的前后层次感划分出来，还使画面有了疏密相间的效果，也使整个气氛上有柔和调剂的一面，不会因为太密、太实而让欣赏者有过分的压迫感坡石用淡墨作长披麻皴，再以焦墨、破笔点苔，有沉郁清壮之韵。画中屋宇，以界画而成，表现了画家怀有丰富的绘画技巧。由于李唐身历两宋画院，个人的成就，影响力所及，几可视为画史上南北宋之间的承先吞后人物。像本幅画中磅礴的气势，可谓承接范宽的「溪山行旅图」，往后的南宋画院名画家，如马远、夏圭，其山石的描写，直可视为系出于李唐了。李唐表现石面质感的用笔，称作「斧劈皴」，是其笔法的一大特色。比起范宽、郭熙两位前代的大师，由于主山的比例缩小，且去除了雾气的使用，山水看来格外清晰，亦令观者产生如临其境、如在的感受，翻出了不同的山水气象。\n";
    artistModelForSong.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/song_artist.jpg";
    artistModelForSong.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/song_artist.jpg";
    artistModelList.add(artistModelForSong);

    ArtistModel artistModelForYuan = new ArtistModel();
    artistModelForYuan.artistName = "黄公望";
    artistModelForYuan.dynasty = "元朝";
    artistModelForYuan.descriptionDetail =
        "黄公望（1269-1354），元代画家。本姓陆，名坚，汉族，江浙行省常熟县人。后过继永嘉府（今浙江温州市）平阳县（今苍南县）黄氏为子，居虞山（今宜山）小山，因改姓黄，名公望，字子久，号一峰、大痴道人。中年当过中台察院椽吏，后皈依\"全真教\"，在江浙一带卖卜。擅画山水，师法董源、巨然，兼修李成法，得赵孟頫指授。所作水墨画笔力老到，简淡深厚。又于水墨之上略施淡赭，世称“浅绛山水”。晚年以草籀笔意入画，气韵雄秀苍茫，与吴镇、倪瓒、王蒙合称“元四家”。擅书能诗，撰有《写山水诀》，为山水画创作经验之谈。存世作品有《富春山居图》、《九峰雪霁图》、《丹崖玉树图》《天池石壁图》等。\n"
            +
            "黄公望在绘画史上独树一帜，被尊为“元四家”之首。由于成名时已是全真道士，浪迹江湖，所以即使是同时代的人，也没有讲清他的籍贯和逝世时间、地点。\n"
            +
            "他的一些山水画素材，就来自于这些山林胜处。他居松江时，观察山水更是到了如痴如醉的地步，有时终日在山中静坐，废寝忘食。 在他居富春江时，身上总是带着皮囊，内置画具，每见山中胜景，必取具展纸，摹写下来。富春江北有大岭山，公望晚年曾隐居于此，他以大岭山为师，曾画有《富春大岭图》。纸本，水墨，纵33厘米，横636.9厘米，开始创稿于至正七年（1347年），时断时续，历经数年，至正十年，他83岁，为此图作题时，尚未最后竣稿。此图描绘富春江两岸初秋景色，坡陀起伏，林峦深秀，笔墨纷披，苍茫简远（见彩图《富春山居图》（部分元））。 元惠宗至正七年（1347年），黄公望准备画一幅富春山全图，此时黄公望已是近八十岁的老人了，前后经历三四年的经营，始告完成。此图描写富春江两岸秋景，笔法上取董、巨，又自出新意，多用披麻皴，干笔皴擦，丛树平林多用横点，林峦浑秀，似平而实奇，整个画面，似融有一种仙风道骨之神韵。这便是《富春山居图》。此图经明沈周、文彭、周天球、董其昌、邹之麟等题记。邹之麟在题跋中称此图“笔端变化鼓舞，右军之兰亭也，圣而神矣!”明清许多画家都从《富春山居图》中得到启示，影响深远。\n";
    artistModelForYuan.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/yuan_artist.jpg";
    artistModelForYuan.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/yuan_artist.jpg";
    artistModelList.add(artistModelForYuan);

    ArtistModel artistModelForMing = new ArtistModel();
    artistModelForMing.artistName = "张宏";
    artistModelForMing.dynasty = "明朝";
    artistModelForMing.descriptionDetail =
        "   张宏（1577年—1652年后）字君度，号鹤涧，明代著名画家，江苏苏州人。善画山水，重视写生，笔力峭拔、墨色湿润、层峦叠嶂、秋壑深邃、有元人古意；他画石面皴染结合为其特色。所作写意人物，形神俱佳，散聚得宜，是明末吴门画坛的中坚人物，吴中学者尊崇之。他在文人山水画方面另辟蹊径，在继承吴门画派风格和特色的基础上加以创新，师自然造化，创作出了富有生活气息的绘画作品，并在画作中体现出了超凡脱俗的精神境界，画面清新典雅，意境空灵清旷。\n"
            +
            "传世作品有：《栖霞山图》、《句曲松风图》、《浮岚暖翠图》、《止园图》、《青绿山水图》、《西山爽气图》、《华子冈图》、《兰亭雅集图》、《琳宫晴雪图》等。在文献记载中，张宏一六五二年画过一幅《蜀葵图》，这是他留给人们的最后资讯。后来相传有柴人在苏州西山的密林中，见到了年逾九旬的张宏在山中作画，其道袍加身，鹤发童颜，犹如仙人一般。\n"
            +
            "张宏的绘画继承了吴门画派的文人画风格和特色，并在写生的基础上搞创作，外师造化，中得心源，在画中体现出清旷幽深的精神境界，使山水画活了起来。他在绘画中所使用的透视法与西方立体画法不谋而合，故宫博物院专家也称张宏的山水画笔墨精湛，世所罕见。他曾登高画鸟瞰俯视图，更是当时罕见。张宏经常携笔墨进入山林中作画，在那个时代，去名山大川写生者不多见，可见张宏是非常难得的一位 重视写生的绘画大师。\n"
            +
            "他所画山石质感坚硬，仿佛敲击有声，云山烟树之间，流水清澈，涓涓而下，使人身临其境，恍若隔世。他的山水画用渲染的手法烘托出深远高逸的气氛，奇峰怪石、浓密古木、清泉飞瀑共同构成了清新典雅、气韵生动的画面。\n";
    artistModelForMing.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/ming_artist.jpg";
    artistModelForMing.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/ming_artist.jpg";
    artistModelList.add(artistModelForMing);

    ArtistModel artistModelForQing = new ArtistModel();
    artistModelForQing.artistName = "郑燮";
    artistModelForQing.dynasty = "清朝";
    artistModelForQing.descriptionDetail =
        "郑燮(1693--1765)，字克柔，号板桥，江苏兴化人，应科举为康熙秀才，雍正十年举人，乾隆元年进士。官山东范县、潍县知县，有政声以岁饥为民请赈，忤大吏，遂乞病归。作官前后，均居扬州， 以书画营生。擅画兰、竹、石、松、菊等，而画兰竹五十余年，成就最为突出。取法于徐渭、石涛、八大山人，而自成家法，体貌疏朗，风格劲峭。工书法，用汉八分杂入楷行草，自称六分半书。并将书法用笔融于绘画之中。主张继承传统十分学七要抛三，不泥古法， 重视艺术的独创性和风格的多样化，所谓未画之先，不立一格，既画之后，不留一格，对今天仍有借鉴意义。诗文真挚风趣,为人民大众所喜诵。亦能治印。有《郑板桥全集》、《板桥先生印册》等。\n"
            +
            "他的代表作是《竹石图》。板桥画竹有“胸无成竹”的理论，他画竹并无师承，多得于纸窗粉壁日光月影，直接取法自然。针对苏东坡“胸有成竹”的说法，板桥强调的是胸中“莫知其然而然”的竹，要“胸中无竹”。这两个理论看似矛盾，实质却相通，同时强调构思与熟练技巧的高度结合，但板桥的方法要“如雷霆霹雳，草木怒生”。 板桥这幅《竹石图》，竹子画得艰瘦挺拔，节节屹立而上，直冲云天，他的叶子，每一张叶子都有着不同的表情，墨色水灵，浓淡有致，逼真地表现竹的质感。在构图上，板桥将竹、石的位置关系和题诗文字处理得十分协调。竹的纤细清飒的美更衬托了石的另一番风情。这种丛生植物成为板桥理想的幻影。板桥的竹子，连“扬州八怪”之一金农都感叹说，相较两人的画品，自己画的竹子终不如板桥有林下风度啊。\n"
            +
            "有“凡吾画兰、画竹、画石，用以慰天下之劳人，非以供天下之安享人也。”\n"
            +
            "板桥的书法， 自称为“六分半书”，他以兰草画法入笔，极其潇洒自然，参以篆、隶、草、楷的字形， 穷极变化。这幅“两歇杨林东渡头”行书，体现了郑板桥书法艺术独特的形式美，“桃花岸”三字提顿之间尤为明媚动人。郑板桥别具一格的新书体，开创了书法历史的先河。\n";
    artistModelForQing.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/qing_artist.jpg";
    artistModelForQing.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/qing_artist.jpg";
    artistModelList.add(artistModelForQing);
    return artistModelList;
  }

  public static List<PictureModel> buildPictureList() {
    List<PictureModel> pictureModelList = new ArrayList<PictureModel>();

    // sample 1
    PictureModel pictureModelForShiqi = new PictureModel();
    pictureModelForShiqi.dynasty = "新石器时代";
    pictureModelForShiqi.pictureName = "人面鱼纹陶盆";
    pictureModelForShiqi.descriptionTitle = "人面鱼纹陶盆";
    pictureModelForShiqi.descriptionDetail =
        "中国远古的文明渊远流长，形成于七千年前的仰韶文化是中国新石器文化发展的一支主干，它展现了中国母系氏族制度从繁荣至衰落时期的社会结构和文化成就，其中彩陶艺术达到了相当完美的境地，成为中国原始艺术创作的范例，这件彩陶盆便是其中代表之作。\n"
            +
            "    彩陶是在陶器表面以红黑赭白等色,  作画后烧成，彩画永不掉落。此盆由细泥红陶制成，敞口卷唇，盆内壁用黑彩绘出两组对称的人面鱼纹。人面概括成圆形，额的左半部涂成黑色，右半部为黑色半弧形，可能是当时的文面习俗。眼睛细而平直，鼻梁挺直，神态安祥，嘴旁分置两个变形鱼纹，鱼头与人嘴外廓重合，加上两耳旁相对的两条小鱼，构成形象奇特的人鱼合体，表现出丰富的想像力，人头顶的尖状角形物，可能是发髻，加上鱼鳍形的装饰，显得威武华丽。\n"
            +
            "仰韶文化的彩陶图案中有大量的动物形纹饰，如鱼、鹿、蛙等，以鱼纹最为典型。人面鱼纹彩陶盆是公认的彩陶艺术精品。类似内容的彩陶盆在遗址中出土了很多件，多作为儿童瓮棺的棺盖来使用，很像一种特制的葬具。人面由人鱼合体而成，人头装束奇特，像是进行某种宗教活动的化妆形象，具有巫师的身份特征，因此这类图画一般被认为象征着巫师请鱼神附体，为夭折的儿童招魂祈福。也有人认为人面与鱼纹共存构成人鱼合体，寓意鱼已经被充分神化，可能是作为图腾来加以崇拜。";
    pictureModelForShiqi.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/shiqi_picture.jpg";
    pictureModelForShiqi.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/shiqi_picture.jpg";
    pictureModelList.add(pictureModelForShiqi);

    // sample 2
    PictureModel pictureModelForZhanguo = new PictureModel();
    pictureModelForZhanguo.dynasty = "战国";
    pictureModelForZhanguo.pictureName = "人物驭龙图";
    pictureModelForZhanguo.descriptionTitle = "人物驭龙图";
    pictureModelForZhanguo.descriptionDetail =
        "帛画是一种可以挂在墙上陈列欣赏的装饰物，具有早期中国画的特征，产生在战国时期（公元前403--公元前221年）,至西汉发展到高峰。其中最能代表这个时期绘画艺术成就的遗物，是中国湖南省长沙出土的《人物龙凤图》和《人物御龙图》两件帛画，它们都是随葬的物品，具有送死者灵魂升天的含意。现存世帛画《楚帛书图像》，《人物龙凤》，《王堆汉墓帛画》，《金山汉墓画》还有《人物御龙图》都出土于长沙。\n"
            +
            "    这幅帛画一九七三年于湖南长沙子弹库楚墓出土，\n"
            +
            "可以说是《人物龙凤图》帛画的姊妹篇，二者从制作的时代到风格技法大体相同。但《人物御龙图》在绘画技巧上比前者更趋成熟，画面中心绘一有胡须的男子，侧身直立，身配宝剑，手执缰绳，驾驭着一条巨龙正向天国飞升。龙头高昂，身平伏呈舟形，翘起的尾上立一只鹭，圆目长嘴，顶有翰毛，仰首向天。画中人物上方有一舆盖，三条飘带随风拂动。绘者较好地把握了从细微的局部来烘托主题，画中龙、人物均面向左，而人物的飘带、舆盖上的饰物则向右，表现出 种较强的方向性和人御龙出行时的动感。\n"
            +
            "在中国传统文化中视“龙”为神物。是通天地之灵物，它可以载人或神上天或邀游太空。这虽是一种虚幻，但都反映出中华民族的先民们征服自然的浪漫主义气质。这幅帛画反映出先民们对人死后灵魂不灭，乘龙天游或乘龙升天的一种愿望。图中男子可能就是死者的侧面肖像。画中男子，高冠岌岌，长剑陆离。而白鹭象征着男子的人格风范，同时白鹭又是传说中仙境之物。整幅帛画呈现出男子走完了尘世之历程，踏上天游之行。御龙乘风白鹭相随，表现出男子轩昂自若的风度。这种广阔的襟宇，正是中华民族文化在艺术中的体现，反映出中华民族对生与死独特的认识。";
    pictureModelForZhanguo.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/zhanguo_picture.jpg";
    pictureModelForZhanguo.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/zhanguo_picture.jpg";
    pictureModelList.add(pictureModelForZhanguo);

    // sample 3
    PictureModel pictureModelForHandai = new PictureModel();
    pictureModelForHandai.dynasty = "汉代";
    pictureModelForHandai.pictureName = "车马过桥画像砖";
    pictureModelForHandai.descriptionTitle = "车马过桥画像砖";
    pictureModelForHandai.descriptionDetail =
        "画像砖起源于战国时期，盛行于两汉，多在墓室中构成壁画，也有的用在宫室建筑上。画像砖主要用木模压印，然后经火烧制成，也有的是在砖上刻出纹饰。画面的表现形式有浅浮雕、阴刻线条和凸刻线条。其题材可分为画像、文字和花纹等种类，画面内容丰富繁杂，因此，它们不仅是美术作品，记录当时社会生产、生活的实物资料，更是古代绘画和雕刻艺术高度结合的珍品，是研究中国雕刻工艺的重要实物资料。 \n"
            +
            "\n"
            +
            "汉代画像砖是汉代三大画像之一，其画像内容异常丰富，包含了汉代政治、经济、文化、民俗等各个方面，是我们研究汉代历史文化的“大百科全书”。\n"
            +
            "\n"
            +
            "汉代画像砖原本是一种嵌在墓壁上用于装饰墓室、炫耀墓主身份与地位的建筑装饰材料，造型上多为方形、长方形或条形。方形砖的尺寸一般在50×40厘米左右，制作较精，长方形砖尺寸一般在50×25厘米。由于在砖的表面或侧面采用模印、彩绘或雕刻等技法，将需要表现的图像呈现出来，深刻反映了汉代的社会风情和审美风格，给冰冷的建筑材料赋予了鲜活的生命，所代表的艺术审美，至今在中国美术发展史上占据着重要地位。\n"
            +
            "\n" +
            "关于马的题材画像，在汉代画像砖中表现比较多，如车马出行、狩猎、轺车、骑吏、车骑过桥等等，但这些有马的画像一般都不会单独出现，都是伴随着其他社会活动而出现在画像里。\n" +
            "\n" +
            "由于马早已融入到汉代社会生活的各个方面，与汉代人的日常生活密不可分，因此，在汉代画像砖上，所表现的很多画像题材上均能看见马的影子。";
    pictureModelForHandai.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/handai_picture.jpg";
    pictureModelForHandai.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/handai_picture.jpg";
    pictureModelList.add(pictureModelForHandai);

    // sample 4
    PictureModel pictureModelForSanguo = new PictureModel();
    pictureModelForSanguo.dynasty = "三国";
    pictureModelForSanguo.pictureName = "画赞序";
    pictureModelForSanguo.descriptionTitle = "画赞序";
    pictureModelForSanguo.descriptionDetail =
        "中国绘画艺术在汉代武帝、明帝时期，因帝王的提倡而盛极一时，皇宫收藏绘画作品极其丰富。但是，到了东汉末年，董卓之乱，献帝西迁，士兵们大量使用绘有图画的缣帛作行囊帐幕。 西迁途中，除使用外，还余七十多车备用，但因遇到大雨冲毁路基，车马行人举步维艰，于是，便将所余尽皆遗弃。这是中国绘画史上前所未有的灾难。对于刚刚兴起的中国绘画艺术，无疑是个严重的打击。之后，军阀混战，民不聊生，一些士族、王室贵族因苦于战乱而借绘画排遣消极情绪。与此同时，佛教进入中国，并迅速蔓延。因佛教思想与当时中国社会思潮吻合，于是形成了魏晋南北朝隋唐佛教题材的绘画盛行的时代。\n"
            +
            "\n"
            +
            "    在三国之前，绘画主要是“设色之工”所从事的职业，属于“百工之苑”，还没有进入艺术殿堂，因而也没有产生较为完整的绘画理论及较为成功的绘画作品。无论是“铸鼎像物”而“使民知神奸”（《左传》语）也好，或者是认为壁画是“明镜所以察形，往古者所以细今”（《孔子家语》语）也好，都充分强调了绘画的社会功能，而没有对其艺术性给予足够重视。到了三国时代（及之后的两晋南北朝），这种鉴戒规劝被残酷的社会现实击得粉碎，人们渴望安定、幸福、祥和的生活，于是，绘画中更多地加入了现实题材的内容，因此，绘画由说教发展到反映现实生活，向艺术化迈进了一大步。如嘉峪关出土的约在公元240——280年的魏晋墓室中，发现了镶嵌了六百多块描绘人物活动场面的砖画，其中人物千姿百态，神情各异。酒泉丁家闸出土的此期墓室中，还画上了一只神情惊异的猫在偷看一个裸体的女子在扫场院。江苏南京等地发掘的墓壁上，无功无禄、不礼不 法、非圣非贤、道遥自在的“竹林七贤”占据了原来被神仙灵异、忠臣义士所占据的地下殿堂。这些都说明了一个问题，即魏晋时期的绘画与思想解放相一致，都在追求人性解放、个性自由，追求自我的社会价值与审美实质。\n"
            +
            "\n" +
            "但是，尽管如此，相对于同期的政治、军事、文学人物来说，三国时期专门从事绘画的画家并不多，而且，有不少绘画仍是两汉绘画说教的继续，如曹植的《画赞序》就说明了这个问题。";
    pictureModelForSanguo.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/sanguo_picture.jpg";
    pictureModelForSanguo.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/sanguo_picture.jpg";
    pictureModelList.add(pictureModelForSanguo);

    // sample 5
    PictureModel pictureModelForLiangjin = new PictureModel();
    pictureModelForLiangjin.dynasty = "两晋南北朝";
    pictureModelForLiangjin.pictureName = "洛神赋图";
    pictureModelForLiangjin.descriptionTitle = "洛神赋图";
    pictureModelForLiangjin.descriptionDetail =
        "晋南北朝时期在艺术方面的变化更多的是体现在书法艺术方面，楷书真正出现了。绘画艺术的变化虽然不像书法那么显著，但是社会风气的变化，崇佛思想的上扬，都让本来简略明晰的绘画进一步变得繁复起来。曹不兴创立了佛画，他的弟子卫协在他的基础上又有所发展。作为绘画走向成熟的标志之一，南方出现了顾恺之、戴逵、陆探微、张僧繇等著名的画家，北方也出现了杨子华、曹仲达、田僧亮诸多大家，画家这一身份逐渐地进入了历史书籍的撰写之中，开始在社会生活中扮演愈来愈重要的角色。\n"
            +
            "在这一时期中，发展得最为突出的是人物画（包括佛教人物画）和走兽画，而中国绘画中的其他各科还远未成熟，东晋顾恺之的传世作品《洛神赋图》中出现的山水只是作为人物故事画的衬景，山水画的逐步独立直到南北朝后期才趋于完成。之所以会这样，也是由于这一时期绘画的主要任务决定的－－为政教服务，“是知存乎鉴戒者图画也”。这也是那时绘画的一个主要特点。\n"
            +
            "在《洛神赋图》中，作者把那位似去似来，飘忽无定、在水面上凌波微步的洛神描绘得非常娴雅而传情;通过处于惊疑、恍惚中的曹植，在洛水之滨与洛神遥遥相对、留恋徘徊可望而不可即的样子，传达出无限惆怅的情意和哀伤情调。清风微拂，河水泛流，从衣袖襟带到山水衬景，莫不生动谐调。其他如惊鸿游龙、云霞映月，奇禽异兽，车船马驾，结合想像与现实，将神人世界融成一片，充满了浪漫主义色彩和诗意气氛。图中山石树木的描绘，还处于单线勾勒、排列均匀、比例欠缺的不成熟阶段，反映出魏晋山水画的一般面貌。";
    pictureModelForLiangjin.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/liangjin_picture.jpg";
    pictureModelForLiangjin.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/liangjin_picture.jpg";
    pictureModelList.add(pictureModelForLiangjin);

    // sample 6
    PictureModel pictureModelForSuitang = new PictureModel();
    pictureModelForSuitang.dynasty = "隋唐";
    pictureModelForSuitang.pictureName = "送子天王图";
    pictureModelForSuitang.descriptionTitle = "送子天王图";
    pictureModelForSuitang.descriptionDetail =
        "作为一幅佛诞名画，可以从中看到佛教自印度传入中国后，经汉末而至盛唐，渐渐与中国文化融合：画中的人物已经本土化，不再是眼眶深凹、脸色黝黑，如达摩样，而完全是汉人模样。\n"
            +
            "作为一幅中国画，又昭示着线描的一个新时代的开始：由“铁线”衍生出“兰叶线”，从此中国画的线描技法大备，无怪乎苏东坡语：“画至吴道子，古今之变，天下之能事毕矣。”\n"
            +
            "   《送子天王图》反映了吴道子的基本画风。吴道子打破了长期以来沿袭的顾恺之陆探微“紧劲联绵，如春蚕吐丝”那种游丝描法，因为游丝描的线条圆润挺健，但如铁线一般而无变化。吴道子开创兰叶描，“行笔磊落，挥霍如莼莱条，圆间折算，方圆凹凸”。他用笔起伏变化，状势雄峻而疏放，表现了内在的精神力量。同时，他敷色比较简淡，甚至不着色。他在创作的时候，处于一种高度兴奋与紧张状态，很有点表现主义的味道。这些，似乎都透出了后来疏笔水墨画的先声。\n"
            +
            "吴道子所画的人物颇有特色，与晋人顾恺之、陆探微不同，以疏体而胜顾、陆的密体，笔不周而意足，貌有缺而神全；一变东晋顾恺之以来那种粗细一律的“铁线描”，突破南北朝“曹衣出水”的艺术形式，笔势圆转，衣服飘举，盈盈若舞，形成“吴带当风”的艺术风格，风行于时。吴道子善于把握住传神的法则，注意形象塑造的整体性。";
    pictureModelForSuitang.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/suitang_picture.jpg";
    pictureModelForSuitang.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/suitang_picture.jpg";
    pictureModelList.add(pictureModelForSuitang);

    PictureModel pictureModelForSong = new PictureModel();
    pictureModelForSong.dynasty = "两宋";
    pictureModelForSong.pictureName = "万壑松风图";
    pictureModelForSong.descriptionTitle = "万壑松风图";
    pictureModelForSong.descriptionDetail =
        "画面绘长松深壑，主峰耸峙，岩石壁立，山泉奔流。画家虽采用北宋山水作品的全景式构图，便取景的视点已拉得较近，用质实坚重的大斧劈皴表现岩石的方峻峭硬，加之用墨浓重，很好地表现出山水的壮美，给人以很强的视觉震撼。画上署有皇宋宣和甲辰春河阳李唐笔隶书款。\n"
            +
            "《万壑松风图》款识题于远峰上：“皇宋宣和甲辰春，河阳李唐笔。”可知作于一一二四年，其时李唐约七十岁左右，是南渡前的作品。画面山峰高峙，山石巉岩，峭壁悬崖间有飞瀑鸣泉，山腰间白云缭绕清岚浮动。从山麓至山巅，松林高密，郁郁葱葱。山脚下乱石珠连，水流奔涌。大自然雄壮之气扑面而来，给人以气势磅礴的感觉。李唐布局中取近景，突出主峰和崖岸，以造成迫在眉睫的视觉感受。山石皴法，融合了李成、范宽、郭熙诸家技巧，用多种皴法表现不同的石质，如主峰，上端用长钉皴刮铁皴，中部偶尔参以解索皴；在山腰以下使用独创的马牙皴。此外还可以看出其后来创造出小斧劈、大斧劈的雏型。对皴法的运用是李唐在此图中的最大特点，对后世造成了极大的影响。到现代还在为人们所学习探讨。\n"
            +
            "万壑松风图是李唐在北宋画院时的作品。这一幅画在主峰旁边的远山上，题有「皇宋宣和甲辰春河阳李唐笔」。甲辰是宋宣和六年（1124），李唐已经步入高龄。尽管如，此画中表现的山石仍然是雷霆万钧的阳刚力量。画上的插云尖峰。冈峦、峭壁，好像斧头刚刚凿过，对一片石质的山，表现山特别坚硬的感觉。\n"
            +
            "是图绘江南烟岚松涛，矾头重叠；深谷里清泉奔涌，溪畔浓荫森森；沿着曲折的山脊，是一片片浓密的松林，“丰”字形的松树随风摇曳，似乎能使观者感受到阵阵湿润的凉风扑面而来；沟壑里聚起团团云雾，缓缓地向上升腾；山瀑下置一水磨磨坊，溪上架一木桥，在这世外桃源里留下人间烟火。\n";
    pictureModelForSong.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/song_picture.jpg";
    pictureModelForSong.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/song_picture.jpg";
    pictureModelList.add(pictureModelForSong);

    PictureModel pictureModelForYuan = new PictureModel();
    pictureModelForYuan.dynasty = "元朝";
    pictureModelForYuan.pictureName = "富春山居图";
    pictureModelForYuan.descriptionTitle = "富春山居图";
    pictureModelForYuan.descriptionDetail =
        "《富春山居图》是元朝书画，画家黄公望为郑樗（无用师）所绘，以浙江富春江为背景，全图用墨淡雅，山和水的布置疏密得当，墨色浓淡干湿并用，极富于变化，是黄公望的代表作，被称为“中国十大传世名画”之一。明朝末年传到收藏家吴洪裕手中，吴洪裕极为喜爱此画，甚至在临死前下令将此画焚烧殉葬，被吴洪裕的侄子从火中抢救出，但此时画已被烧成一大一小两段。较长的后段称《无用师卷》，现藏台北故宫博物院；前段称《剩山图》，现收藏于浙江省博物馆。在中国国务院前总理温家宝先生的决定下，《富春山居图》2011年6月在台湾台北故宫博物院展出。\n"
            +
            "《富春山居图》是黄公望七十九岁高龄时开始创作的。这幅纵33厘米，横636．9厘米的长卷，是他生活在富阳，又以富春江为题材推出的力作。为了画好这幅画，他终日不辞辛劳'奔波于富春江两岸，观察烟云变幻之奇，领略江山钓滩之胜，并身带纸笔，遇到好景，随时写生，富春江边的许多山村都留下他的足迹。深入的观察，真切的体验，丰富的素材，使《富春山居图》的创作有了扎实的生活基础，加上他晚年那炉火纯青的笔墨技法，因此落笔从容。千丘万卷，壑，越出越奇，重峦迭嶂，越深越妙，既形象地再现了富春山水的秀丽外貌，又把其本质美的特征挥洒得淋漓尽致。这件宏幅巨制直到他谢世前不久才告完成，前后倾注了大约七年的心血，这是画家与富春山水情景交融的结晶。展开画呈现在我们面前的是富春江一带秋初景色：丘陵起伏，峰回路转，江流沃土，沙町平畴。云烟掩映村舍，水波出没鱼舟。近树苍苍，疏密有致，溪山深远，飞泉倒挂。亭台小桥，各得其所，人物飞禽，生动适度。正是“景随人迁，人随景移”，达到步步可观的艺术效果。\n";
    pictureModelForYuan.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/yuan_picture.jpg";
    pictureModelForYuan.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/yuan_picture.jpg";
    pictureModelList.add(pictureModelForYuan);

    PictureModel pictureModelForMing = new PictureModel();
    pictureModelForMing.dynasty = "明朝";
    pictureModelForMing.pictureName = "华子冈图";
    pictureModelForMing.descriptionTitle = "华子冈图";
    pictureModelForMing.descriptionDetail =
        "   《华子冈图》是明代画家张宏在1625年所画的一幅山水长卷，所绘辋川别业二十景之一华子冈的景色。张宏擅以古诗词作画，用画来表达诗意，他那种不拘泥于传统文人笔墨，师法自然的写景思维也从他的《华子冈图》中反映出来。他此图所描绘的是王维寄友人诗中《山中与裴迪秀才书》的一个片段，描述华子冈的夜景。\n"
            +
            "   张宏按照王维诗中所描述的情景，依照自己的想象画成此卷，画中将王维的诗意完全地体现了出来，仿佛画家本人亲历了当时之景一般。我们仿佛看到了王维夜登华子冈的情景，同时也听到了冈下村庄中传来了人语声。\n"
            +
            "   张宏曾以古诗词作画，用画来表达诗意，他那种不拘泥于传统文人笔墨，师法自然的写景思维也从他的《华子冈图》中反映出来。他此处所描绘的，乃是王维寄友人诗意中的情景。在诗中，王维记述了他夜登华子冈的景况。张宏依自己对王维诗词的理解而画成此卷，仿佛他也亲历了当时之景一般：眼观王维登上了华子冈，同时也听到了冈下村中传来的人语声。在张宏的笔下，景中的山冈与树木都位于极真实的空间中，且看起来朦朦胧胧，仿佛是在月光之下一般。此一营造法颇能表现王维书信中的诗意感，以及诗中对景物的生动描述。张宏将王维诗中的景物一一具象化，巨细靡遗，乃至于视线难以到达的冈下村人夜捣香粳，以及深巷犬吠之类的细节等，也都在描绘之中。这种不脱原来字句，据实表现的画法，是对文人画表现形式的一次升华，是具有历史意义的。由于张宏在文人画中加入了栩栩如生的写实画法，使晚明的文人画为后世所推崇。美国学者高居翰还著书颂扬以张宏为首的晚明画家，称其为“山外之山”。\n";
    pictureModelForMing.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/ming_picture.jpg";
    pictureModelForMing.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/ming_picture.jpg";
    pictureModelList.add(pictureModelForMing);

    PictureModel pictureModelForQing = new PictureModel();
    pictureModelForQing.dynasty = "清朝";
    pictureModelForQing.pictureName = "竹石图";
    pictureModelForQing.descriptionTitle = "竹石图";
    pictureModelForQing.descriptionDetail =
        "此图为庭院中的竹石。瘦石壁立，以白描的笔意为主，长折带皴勾出坚硬挺削的石质，褶裥处略施以小斧劈皴。石前新篁三枝，劲拔挺秀，以“冗繁削尽留清瘦”的简洁风格写成。画面简约明快，竹清石秀。《竹石图》这幅画上题诗一首：\n"
            +
            "乌纱掷去不为官，\n"
            +
            "囊橐萧萧两袖寒。\n"
            +
            "写取一枝清瘦竹，\n"
            +
            "秋风江上作渔杆。\n"
            +
            "《竹石图》绘奇石与立竹，行笔平直，奇石两侧各绘欹竹，皆作随风倾斜之态。画面轻重布置得当。写竹笔意贯穿，叶叶交加，下笔遒健苍劲，浓淡之墨，相互呼应，极有风致。石下小竹丛生，秀健活泼，生气浮动。风格潇洒，得墨竹之妙。款书直抒胸怀，颇多自负。此作系应友人徐明法之请，为默金先生七十三岁祝寿之作。\n";
    pictureModelForQing.littlePictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/qing_picture.jpg";
    pictureModelForQing.bigPictureUrl =
        "http://7u2h6n.com1.z0.glb.clouddn.com/qing_picture.jpg";
    pictureModelList.add(pictureModelForQing);

    return pictureModelList;
  }
}
