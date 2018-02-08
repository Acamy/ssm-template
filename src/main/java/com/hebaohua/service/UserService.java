package com.hebaohua.service;


import com.hebaohua.entity.User;

public interface UserService {
	//根据id查询用户信息
	public User getUserById(Integer id) throws Exception;

}
