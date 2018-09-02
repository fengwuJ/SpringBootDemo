package com.fengwuj.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fengwuj.springboot.entity.User;
import com.fengwuj.springboot.mapper.UserMapper;

@Controller
public class JdbcTestController {
	@Autowired
	UserMapper userMapper;
	@RequestMapping("/jdbctest")
	public String hello(Model model) {
		List<User> list = userMapper.findAll();
		model.addAttribute("userList",list);
		return "index";
	}
}
