package com.example.task_sep_7_2020;

public class Item {
    private String trendName;
    private String trendDesc;
    private int trendImg;

    public Item(String trendName, String trendDesc, int trendImg) {
        this.trendName = trendName;
        this.trendDesc = trendDesc;
        this.trendImg = trendImg;
    }

    public String getTrendName() {
        return trendName;
    }

    public String getTrendDesc() {
        return trendDesc;
    }

    public int getTrendImg() {
        return trendImg;
    }
}
