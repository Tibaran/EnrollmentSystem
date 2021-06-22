package com.miempresa.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.miempresa.interfaceService.IUserService;
import com.miempresa.models.User;

@Repository
public class UserService implements IUserService{
	
	@Autowired
	private RedisTemplate<String,User> redisTemplate;
	
	private HashOperations hashOperations;
	

	public UserService(RedisTemplate<String, User> redisTemplate) {
		super();
		this.redisTemplate = redisTemplate;
		this.hashOperations = redisTemplate.opsForHash();
	}

	@Override
	public void save(User user) {
		hashOperations.put("USER", user.getId(), user);
	}

	@Override
	public Map<String, User> findAll() {
		return hashOperations.entries("USER");
	}

	@Override
	public User findById(String id) {
		return (User)hashOperations.get("USER", id);
	}

	@Override
	public void update(User user) {
		save(user);
		
	}

	@Override
	public void delte(String id) {
		hashOperations.delete("USER", id);
		
	}

}
