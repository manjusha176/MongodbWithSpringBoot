package com.example.userService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Service;

import com.example.userModel.User;
import com.example.userRepository.userRepository;

@Service
public class userService {

	@Autowired
	private userRepository userRepo;
	
	//create (insertion to db)
	public void addUser(User user)
	{
		userRepo.save(user);
	}
	
	//get all records
	public List<User> getAllRecords()
	{
		return userRepo.findAll();
	}
}
