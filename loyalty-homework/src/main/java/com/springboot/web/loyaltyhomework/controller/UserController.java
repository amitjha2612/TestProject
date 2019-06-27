package com.springboot.web.loyaltyhomework.controller;

import java.io.Serializable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.loyaltyhomework.DAO.UserInputDaoImpl;
import com.springboot.web.loyaltyhomework.Messageservice.UserMessageService;

import com.springboot.web.loyaltyhomework.models.User;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/save")
public class UserController implements Serializable {

 @Autowired
 private UserMessageService userMessageService;
 
 
 //Method to save the user only
 
 @PostMapping(value="/user",produces = { "application/json" }, consumes = { "application/json"})
 public ResponseEntity<User> userdetails(@RequestBody User user) {
	 
	 if(user.getFname() != null || user.getLname() != null || user.getUsername() !=null)
	 {
		 System.out.println("User details in input request"+ user.getFname() + user.getLname() + user.getUsername());
		 return new ResponseEntity<User>(userMessageService.saveUser(user), HttpStatus.OK);
	 }
	return null;
	 
}
 
 //Method to save the text only
	
	  @PostMapping(value="/text",produces = { "application/json" }, consumes = {"application/json"}) 
	  public ResponseEntity<User> updatetext(@RequestBody User text) {
	  
	  if(text != null) {
	  System.out.println("Text"+ text);
	  return new  ResponseEntity<User>(userMessageService.saveText(text), HttpStatus.OK); 
	  }
	  return null;
	  
	  }
	 
}
