package com.fancy.douban_like.model;

public class Worker {

    private String WorkerId; //编号
    private String WName; //姓名
    private String WAnotherName; //其他名
    private String WGender; //性别
    private String WHoroscope; //星座
    private String WDescription; //介绍
    private String WImage; //头像图片

    public Worker() {
    }

    public Worker(String workerId, String WName, String WImage) {
        WorkerId = workerId;
        this.WName = WName;
        this.WImage = WImage;
    }

    public Worker(String workerId, String WName, String WAnotherName, String WGender, String WHoroscope, String WDescription, String WImage) {
        WorkerId = workerId;
        this.WName = WName;
        this.WAnotherName = WAnotherName;
        this.WGender = WGender;
        this.WHoroscope = WHoroscope;
        this.WDescription = WDescription;
        this.WImage = WImage;
    }

    public String getWorkerId() {
        return WorkerId;
    }

    public void setWorkerId(String workerId) {
        WorkerId = workerId;
    }

    public String getWName() {
        return WName;
    }

    public void setWName(String WName) {
        this.WName = WName;
    }

    public String getWAnotherName() {
        return WAnotherName;
    }

    public void setWAnotherName(String WAnotherName) {
        this.WAnotherName = WAnotherName;
    }

    public String getWGender() {
        return WGender;
    }

    public void setWGender(String WGender) {
        this.WGender = WGender;
    }

    public String getWHoroscope() {
        return WHoroscope;
    }

    public void setWHoroscope(String WHoroscope) {
        this.WHoroscope = WHoroscope;
    }

    public String getWDescription() {
        return WDescription;
    }

    public void setWDescription(String WDescription) {
        this.WDescription = WDescription;
    }

    public String getWImage() {
        return WImage;
    }

    public void setWImage(String WImage) {
        this.WImage = WImage;
    }
}
