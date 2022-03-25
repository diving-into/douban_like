package com.fancy.douban_like.model;

import java.util.List;


public class Movie {

    private String MovieId; //电影编号
    private String MChineseName; //电影中文名
    private String MOriginalName; //电影原名
    private float MRating; //电影评分
    private String MType; //电影类型
    private String MReleaseDate; //电影上映日期
    private String MLanguage; //电影语言
    private String MCountry; //电影制作国家
    private int MLength; //电影时长
    private String MDigest; //电影剧情介绍
    private String MCover; //电影封面图片
    private List<Worker> workerList; //电影工作人员列表-包括导演和演员

    public Movie() {
    }

    public Movie(String movieId, String MChineseName, float MRating, String MCover) {
        MovieId = movieId;
        this.MChineseName = MChineseName;
        this.MRating = MRating;
        this.MCover = MCover;
    }

    public Movie(String movieId, String mchineseName, float MRating, String MDigest, String MCover) {
        MovieId = movieId;
        MChineseName = mchineseName;
        this.MRating = MRating;
        this.MDigest = MDigest;
        this.MCover = MCover;
    }

    public Movie(String movieId, String mchineseName, String MOriginalName, float MRating, String MType, String MReleaseDate, String MLanguage, String MCountry, int MLength, String MDigest, String MCover, List<Worker> workerList) {
        MovieId = movieId;
        MChineseName = mchineseName;
        this.MOriginalName = MOriginalName;
        this.MRating = MRating;
        this.MType = MType;
        this.MReleaseDate = MReleaseDate;
        this.MLanguage = MLanguage;
        this.MCountry = MCountry;
        this.MLength = MLength;
        this.MDigest = MDigest;
        this.MCover = MCover;
        this.workerList = workerList;
    }

    public String getMovieId() {
        return MovieId;
    }

    public void setMovieId(String movieId) {
        MovieId = movieId;
    }

    public String getMChineseName() {
        return MChineseName;
    }

    public void setMChineseName(String MChineseName) {
        this.MChineseName = MChineseName;
    }

    public String getMOriginalName() {
        return MOriginalName;
    }

    public void setMOriginalName(String MOriginalName) {
        this.MOriginalName = MOriginalName;
    }

    public float getMRating() {
        return MRating;
    }

    public void setMRating(float MRating) {
        this.MRating = MRating;
    }

    public String getMType() {
        return MType;
    }

    public void setMType(String MType) {
        this.MType = MType;
    }

    public String getMReleaseDate() {
        return MReleaseDate;
    }

    public void setMReleaseDate(String MReleaseDate) {
        this.MReleaseDate = MReleaseDate;
    }

    public String getMLanguage() {
        return MLanguage;
    }

    public void setMLanguage(String MLanguage) {
        this.MLanguage = MLanguage;
    }

    public String getMCountry() {
        return MCountry;
    }

    public void setMCountry(String MCountry) {
        this.MCountry = MCountry;
    }

    public int getMLength() {
        return MLength;
    }

    public void setMLength(int MLength) {
        this.MLength = MLength;
    }

    public String getMDigest() {
        return MDigest;
    }

    public void setMDigest(String MDigest) {
        this.MDigest = MDigest;
    }

    public String getMCover() {
        return MCover;
    }

    public void setMCover(String MCover) {
        this.MCover = MCover;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }
}
