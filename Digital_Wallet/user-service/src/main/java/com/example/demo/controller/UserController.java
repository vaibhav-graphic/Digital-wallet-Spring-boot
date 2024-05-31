package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.UserCreateRequest;
import com.example.demo.models.User;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("")
	public void createUser(@RequestBody UserCreateRequest createRequest) throws JsonProcessingException {
		userService.create(createRequest);
	}
	
	@GetMapping("/details")
	public User getUserDetails(@RequestParam("userId") int userId) {
		return userService.get(userId);
	}
}
