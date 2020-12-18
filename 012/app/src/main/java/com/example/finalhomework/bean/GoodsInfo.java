package com.example.finalhomework.bean;

import com.example.finalhomework.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc1; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public GoodsInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "波西杰克逊系列", "从你的全世界路过", "解忧杂货店", "说话心理学", "天才在左，疯子在右", "小王子","精灵宝钻","我不喜欢这个世界只喜欢你 "
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = new String[]{
            "现货 波西杰克逊系列 神火之盗 魔兽之海 5本套装 带海报 英文原版 Percy Jackson and the Olympians Rick Riordan 莱尔顿",
            "从你的全世界路过 张嘉佳电影原著 让我留在你身边 青春励志文学都市青春励志小说畅销书",
            "解忧杂货店 东野圭吾继白夜行疾风回旋曲之后又一新书文学救赎励志心理学读",
            "说话心理学正版书籍 人际交往社交沟通书籍提高情商沟通术 情商书籍口才说话技巧书籍职场书籍非暴力沟通的艺术正版好好说话的书籍",
            "天才在左疯子在右正版完整版高铭新增未公开10章节 墨菲定律犯罪读心术社会心理学与生活入门基础书籍天才在左疯子右",
            "小王子 李继宏翻译王一博袁泉推荐原版精装纪念简体中文版 中小学生阅读世界名著书籍",
            "现货 英文原版 The Silmarillion 精灵宝钻 托尔金手绘封面",
            "我不喜欢这个世界,我只喜欢你 乔一著电视剧原著小说精装漫画书籍都市爱情青春小说暖心故事爱情回忆录"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {50, 52, 18, 27, 36, 42,41,51};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.kdlk_s, R.drawable.bk6_s, R.drawable.bk7_s,
            R.drawable.ktz_s, R.drawable.pst_s, R.drawable.xflcx_s, R.drawable.huia_s,R.drawable.tgl_s,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.kdlk, R.drawable.bk6, R.drawable.bk7,
            R.drawable.ktz, R.drawable.pst, R.drawable.xflcx,
            R.drawable.huia, R.drawable.tgl
    };

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}
