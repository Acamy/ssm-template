package com.hebaohua.service.impl;

import com.hebaohua.mapper.UserMapper;
import com.hebaohua.entity.User;
import com.hebaohua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(Integer id) throws Exception {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}
}
