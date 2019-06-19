package com.Puraya.Blog.pojo;

import java.util.Date;

public class Album {
    private Integer albumId;

    private String albumName;

    private String introduction;

    private Date creatTime;

    public Album(Integer albumId, String albumName, String introduction, Date creatTime) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.introduction = introduction;
        this.creatTime = creatTime;
    }

    public Album() {
        super();
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName == null ? null : albumName.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}