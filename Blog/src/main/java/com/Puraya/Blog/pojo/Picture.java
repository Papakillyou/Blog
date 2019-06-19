package com.Puraya.Blog.pojo;

import java.util.Date;

public class Picture {
    private Integer pictureId;

    private String introduction;

    private Integer albumId;

    private Date upTime;

    private String path;

    public Picture(Integer pictureId, String introduction, Integer albumId, Date upTime, String path) {
        this.pictureId = pictureId;
        this.introduction = introduction;
        this.albumId = albumId;
        this.upTime = upTime;
        this.path = path;
    }

    public Picture() {
        super();
    }

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}