package com.example.userController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.userModel.*;
import com.example.userService.userService;

@RestController
public class userController {
	
	@Autowired
	private userService userservice;

	@RequestMapping("/hello")
	public String checkConnection()
	{
		return "hello";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/AddUser")
	public String addNewUser(@RequestBody User user)
	{
		userservice.addUser(user);
		return "added successfully";
	}
	
	@RequestMapping("/AllUsers")
	public List<User> getAllUsers()
	{
		return userservice.getAllRecords();
	}
}
