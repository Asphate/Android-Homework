package com.example.hyj7.bean;

import com.example.hyj7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "从你的全世界路过", "解忧杂货店", "精灵宝钻", "波西杰克逊系列", "说话心理学", "天才在左疯子在右","我不喜欢这个世界,我只喜欢你","小王子 "
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = new String[]{
            "从你的全世界路过 张嘉佳电影原著 让我留在你身边 青春励志文学都市青春励志小说畅销书",
            "解忧杂货店 东野圭吾继白夜行疾风回旋曲之后又一新书文学救赎励志心理学读",
            "现货 英文原版 The Silmarillion 精灵宝钻 托尔金手绘封面",
            "现货 波西杰克逊系列 神火之盗 魔兽之海 5本套装 带海报 英文原版 Percy Jackson and the Olympians Rick Riordan 莱尔顿",
            "说话心理学正版书籍 人际交往社交沟通书籍提高情商沟通术 情商书籍口才说话技巧书籍职场书籍非暴力沟通的艺术正版好好说话的书籍",
            "天才在左疯子在右正版完整版高铭新增未公开10章节 墨菲定律犯罪读心术社会心理学与生活入门基础书籍天才在左疯子右",
            "我不喜欢这个世界,我只喜欢你 乔一著电视剧原著小说精装漫画书籍都市爱情青春小说暖心故事爱情回忆录",
            "小王子 李继宏翻译王一博袁泉推荐原版精装纪念简体中文版 中小学生阅读世界名著书籍"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {52, 21, 240, 52, 18, 19,16,49};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.cnd, R.drawable.jy, R.drawable.mm_s,
            R.drawable.nn_s, R.drawable.sh, R.drawable.tc, R.drawable.xhsj, R.drawable.xwz,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.cnd_s, R.drawable.jy_s, R.drawable.mm,
            R.drawable.nn, R.drawable.sh_s, R.drawable.tc_s,
            R.drawable.xhsj_s, R.drawable.xwz_s
    };

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
}
