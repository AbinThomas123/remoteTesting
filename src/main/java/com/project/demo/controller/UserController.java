package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.DTO.UserDTO;
import com.project.demo.service.UserService;
@RestController

@RequestMapping("/user/")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	//@RequestMapping(value="{userId}",method= RequestMethod.GET)
	
	@GetMapping("{userId}")
	public UserDTO getUserDetails(@PathVariable  Integer userId)
	{
		return userService.getUserDetails(userId);
		
	}

}