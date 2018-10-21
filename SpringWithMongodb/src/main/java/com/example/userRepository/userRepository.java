package com.example.userRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.userModel.User;

@Repository
public interface userRepository extends MongoRepository<User, String>{

	public User findByEmail(String email);
}
