/**
 * 
 */
package com.springboot.web.loyaltyhomework.Messageservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.web.loyaltyhomework.DAO.UserInputDaoImpl;

import com.springboot.web.loyaltyhomework.models.User;

/**
 * @author AMIT
 *
 */
@Service
@Transactional
public class UserMessageServiceImpl implements UserMessageService {
 
 @Autowired
 private UserInputDaoImpl userInputDaoimpl;


 @Override
	public User saveText(User text) {
	 System.out.println("Inside Service Impl --- Only text in input request");
	 return userInputDaoimpl.save(text);
	 }
	 

 @Override
 	 public User saveUser(User user) {
	 System.out.println("Inside Service Impl --- User details in input request");
	 return userInputDaoimpl.save(user);
	}
 }

