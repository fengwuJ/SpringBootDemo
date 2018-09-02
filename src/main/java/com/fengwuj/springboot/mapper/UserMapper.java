package com.fengwuj.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fengwuj.springboot.entity.User;

@Mapper
public interface UserMapper {
	List<User> findAll();
}
