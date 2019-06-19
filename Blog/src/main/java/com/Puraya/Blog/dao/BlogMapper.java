package com.Puraya.Blog.dao;

import com.Puraya.Blog.pojo.Blog;

public interface BlogMapper {
    int insert(Blog record);

    int insertSelective(Blog record);
}