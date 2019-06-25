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
 private UserInputDaoImpl userdaoimpl;

 
 @Override
 //public List<User> saveOrUpdate(User user) {
	 public User saveOrUpdate(User user) {
	 return userdaoimpl.save(user);
	//return (List<User>) userdaoimpl.findAll();
 }

 }

