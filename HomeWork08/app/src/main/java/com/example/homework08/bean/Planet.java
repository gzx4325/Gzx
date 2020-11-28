package com.example.homework08.bean;

import com.example.homework08.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = {R.drawable.xianglian, R.drawable.madingxue, R.drawable.chuanglian,
            R.drawable.kouhong, R.drawable.jizhua, R.drawable.jiaju,
            R.drawable.yifu,R.drawable.zhiwu};
    private static String[] nameArray = {"项链", "马丁靴", "窗帘", "口红", "鸡爪", "家具","女士上衣","花卉"};
    private static String[] descArray = {
            "项链 天然紫水晶 永恒之心",
            "马丁靴 雪地靴2020年新款 时尚休闲款",
            "窗帘 高档大气 奢华简约 现代绣花双层挡光",
            "口红 秋冬限量 雾面质感 暗红色管身",
            "鸡爪 酸辣无骨鸡爪 泡椒 香辣 黑椒 只要20",
            "家具 宜室家居 限量购买",
            "女士上衣 大衣 看着好看，穿着更好看 米白色  ",
            "花卉 绿植 让你眼前一亮的美"
    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
