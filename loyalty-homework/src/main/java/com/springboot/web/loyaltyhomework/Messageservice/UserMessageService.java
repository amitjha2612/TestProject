package com.springboot.web.loyaltyhomework.Messageservice;

import java.util.List;


import com.springboot.web.loyaltyhomework.models.User;

public interface UserMessageService {

	  
	 //public List<User> saveOrUpdate(User user);
	public User saveUser(User user);
	public User saveText(User text);
	
	}

