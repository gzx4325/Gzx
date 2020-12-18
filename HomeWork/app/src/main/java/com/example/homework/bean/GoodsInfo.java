package com.example.homework.bean;

import com.example.homework.R;

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
            "项链", "马丁靴", "窗帘", "口红", "鸡爪", "家具","女士上衣","花卉"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "项链 天然紫水晶 永恒之心",
            "马丁靴 雪地靴2020年新款 时尚休闲款",
            "窗帘 高档大气 奢华简约 现代绣花双层挡光",
            "口红 秋冬限量 雾面质感 暗红色管身",
            "鸡爪 酸辣无骨鸡爪 泡椒 香辣 黑椒 只要20",
            "家具 宜室家居 限量购买",
            "女士上衣 大衣 看着好看，穿着更好看 米白色  ",
            "花卉 绿植 让你眼前一亮的美"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {3000, 160, 1800, 100, 20,3000,1000,60};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.xianglian_s, R.drawable.madingxue_s, R.drawable.chuanglian_s,
            R.drawable.kouhong_s, R.drawable.jizhua_s, R.drawable.jiaju_s,
            R.drawable.yifu_s,R.drawable.zhiwu_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.xianglian, R.drawable.madingxue, R.drawable.chuanglian,
            R.drawable.kouhong, R.drawable.jizhua, R.drawable.jiaju,
            R.drawable.yifu,R.drawable.zhiwu
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
