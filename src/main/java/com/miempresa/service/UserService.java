package com.miempresa.service;

import java.util.Map;
import java.util.concurrent.TimeUnit;

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
		hashOperations.put("USER"+user.getId(), user.getId(), user);
		redisTemplate.expire("USER"+user.getId(),5000,TimeUnit.MILLISECONDS);
	}

	@Override
	public Map<String, User> findAll(String key) {
		return hashOperations.entries(key);
	}

	@Override
	public User findById(String id) {
		return (User)hashOperations.get("USER"+id, id);
	}

	@Override
	public void update(User user) {
		save(user);
		
	}

	@Override
	public void delete(String id) {
		hashOperations.delete("USER", id);
		
	}

}
