package com.Puraya.Blog.dao;

import com.Puraya.Blog.pojo.Picture;

public interface PictureMapper {
    int insert(Picture record);

    int insertSelective(Picture record);
}