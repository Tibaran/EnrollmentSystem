package com.miempresa.interfaceService;

import java.util.List;
import java.util.Map;

import com.miempresa.models.User;

public interface IUserService {
	
	public void save(User user);
	public Map<String, User> findAll();
	public User findById(String id);
	public void update(User user);
	public void delte(String id);
}
