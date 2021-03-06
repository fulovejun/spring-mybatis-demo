package com.faunjoe.springmybatis.mapper;

import java.util.List;

import com.faunjoe.springmybatis.domain.User;

public interface UserMapper {
	void save(User user);
	void update(User user);
	void delete(int id);
	User findById(int id);
	List<User> findAll();
}
