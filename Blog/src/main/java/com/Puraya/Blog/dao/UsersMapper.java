package com.Puraya.Blog.dao;

import com.Puraya.Blog.pojo.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
}