package com.miempresa.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miempresa.models.User;
import com.miempresa.service.UserService;

@RestController
@RequestMapping("/rest/user")
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/add/{id}/{username}")
	public User add(@PathVariable("id") final String id,
			@PathVariable("username") final String username) {
		userService.save(new User(id, username, "12345"));
		return userService.findById(id);
	}
	
	@GetMapping("/update/{id}/{username}")
	public User update(@PathVariable("id") final String id,
			@PathVariable("username") final String username) {
		userService.save(new User(id, username, "12345"));
		return userService.findById(id);
	}
	
	@GetMapping("/all/{key}")
	public Map<String, User> all(@PathVariable("key") final String key) {
		return userService.findAll(key);
	}
	
	@GetMapping("/delete/{id}")
	public Map<String, User> delete(@PathVariable("id") final String id) {
		userService.delete(id);
		return userService.findAll("USER");
	}
}
