package com.springboot.web.loyaltyhomework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.loyaltyhomework.Messageservice.UserMessageService;
import com.springboot.web.loyaltyhomework.models.User;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

 @Autowired
 private UserMessageService userMessageService;
 
 
 @RequestMapping(value="/savedetails", method=RequestMethod.POST, produces = { "application/json" })
 public User savetext(@RequestBody User text) {
	 return userMessageService.saveOrUpdate(text);
	  
	 }
}
