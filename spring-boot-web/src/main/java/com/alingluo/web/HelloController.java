package com.alingluo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alingluo.domain.User;

@RestController
public class HelloController {

	@RequestMapping("/getUser")
	public User getUser(){
		User user = new User();
		user.setUserName("猪小妹");
		user.setPassWord("123");
		return user;
	}
}
