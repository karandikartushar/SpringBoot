package com.maxima.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxima.model.User;

@RestController 
@RequestMapping("user/")
public class UserController {

	@GetMapping(value="getAllUsers")
	public List<User> getAllUsers(){
		List userList = new ArrayList();
		userList.add(new User(1,"Tushar","Karandikar"));
		userList.add(new User(1,"Bakul","Karandikar"));
		userList.add(new User(1,"Aayushi","Karandikar"));
		userList.add(new User(1,"Arya","Karandikar"));
		return userList;
	}
}
