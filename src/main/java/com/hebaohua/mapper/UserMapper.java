package com.hebaohua.mapper;


import com.hebaohua.entity.User;

public interface UserMapper {
    User selectByPrimaryKey(Integer userId);
}