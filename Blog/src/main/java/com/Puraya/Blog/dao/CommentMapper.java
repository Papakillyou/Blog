package com.Puraya.Blog.dao;

import com.Puraya.Blog.pojo.Comment;

public interface CommentMapper {
    int insert(Comment record);

    int insertSelective(Comment record);
}