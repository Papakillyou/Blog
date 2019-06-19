package com.Puraya.Blog.dao;

import com.Puraya.Blog.pojo.Blogtype;

public interface BlogtypeMapper {
    int insert(Blogtype record);

    int insertSelective(Blogtype record);
}