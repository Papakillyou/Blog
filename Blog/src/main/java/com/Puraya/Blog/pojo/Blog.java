package com.Puraya.Blog.pojo;

import java.util.Date;

public class Blog {
    private Integer blogId;

    private String title;

    private Date blogTime;

    private String content;

    private Integer point;

    private Integer typeId;

    public Blog(Integer blogId, String title, Date blogTime, String content, Integer point, Integer typeId) {
        this.blogId = blogId;
        this.title = title;
        this.blogTime = blogTime;
        this.content = content;
        this.point = point;
        this.typeId = typeId;
    }

    public Blog() {
        super();
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getBlogTime() {
        return blogTime;
    }

    public void setBlogTime(Date blogTime) {
        this.blogTime = blogTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}