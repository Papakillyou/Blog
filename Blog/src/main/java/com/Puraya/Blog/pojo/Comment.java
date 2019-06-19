package com.Puraya.Blog.pojo;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private Date time;

    private Integer userId;

    private String content;

    private Integer blogId;

    public Comment(Integer commentId, Date time, Integer userId, String content, Integer blogId) {
        this.commentId = commentId;
        this.time = time;
        this.userId = userId;
        this.content = content;
        this.blogId = blogId;
    }

    public Comment() {
        super();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }
}