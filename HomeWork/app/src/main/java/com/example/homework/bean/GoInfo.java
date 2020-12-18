package com.example.homework.bean;

import com.example.homework.R;

import java.util.ArrayList;

public class GoInfo {
    public int pic_id;
    public String title;
    public String desc;
    public boolean bPressed;
    public int id;
    private static int seq = 0;

    public GoInfo(int pic_id, String title, String desc) {
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    private static int[] listImageArray = {R.drawable.public_01, R.drawable.public_02
            , R.drawable.public_03, R.drawable.public_04, R.drawable.public_05};
    private static String[] listTitleArray = {
            "首都日报", "海峡时报", "北方周末", "参照消息", "挨踢杂志"};
    private static String[] listDescArray = {
            "金秋时节香山染红，市民纷纷登山赏叶",
            "台风接踵而来，出门小心暴雨",
            "俄罗斯老人在东北，生活滋润乐不思蜀",
            "蒙内铁路建成通车，中国标准再下一城",
            "米6大战Mate10，千元智能机谁领风骚"};

    public static ArrayList<GoInfo> getDefaultList() {
        ArrayList<GoInfo> listArray = new ArrayList<GoInfo>();
        for (int i = 0; i < listImageArray.length; i++) {
            listArray.add(new GoInfo(listImageArray[i], listTitleArray[i], listDescArray[i]));
        }
        return listArray;
    }



    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoInfo> getDefaultGrid() {
        ArrayList<GoInfo> gridArray = new ArrayList<GoInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }



    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津"};

    public static ArrayList<GoInfo> getDefaultStag() {
        ArrayList<GoInfo> stagArray = new ArrayList<GoInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }





}
