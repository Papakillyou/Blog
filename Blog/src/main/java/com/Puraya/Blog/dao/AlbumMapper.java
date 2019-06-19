package com.Puraya.Blog.dao;

import com.Puraya.Blog.pojo.Album;

public interface AlbumMapper {
    int insert(Album record);

    int insertSelective(Album record);
}