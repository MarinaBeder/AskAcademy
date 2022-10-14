package com.askacademy.AskAcademy.controller;

import com.askacademy.AskAcademy.DB.Users;
import com.askacademy.AskAcademy.service.UserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	 @Autowired
	private UserService userService;
	
   
    public UserController(UserService userService) {
 		
 		this.userService = userService;
 	}

	// http://localhost:8080/players
    @GetMapping("/users")
    public List<Users> getAllUsers(){
      
        return userService.allUsers();
    }
    @PostMapping("/SignUp")
   public String signupUser(@RequestBody Users user){
    	userService.saveUser(user);
        return "You have been submitted";
    }
    
  
}
