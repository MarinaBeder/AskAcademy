package com.askacademy.AskAcademy.controller;

import org.springframework.web.bind.annotation.RestController;

import com.askacademy.AskAcademy.DB.Users;
import com.askacademy.AskAcademy.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // http://localhost:8080/players
    @GetMapping("/users")
    public List<Users> getAllPlayers(){
      
        return userService.allUsers();
    }
    
   @PostMapping("/SignUp")
   public String savePlayer(@RequestBody Users user){
    	userService.saveUser(user);
        return "You have been submitted";
    }
    /*// http://localhost:8080/player-form
    @GetMapping("player-form")
    public String playerForm(Model model){
        model.addAttribute("player", new Users());
        return "playerform";
    }

    // http://localhost:8080/savePlayer
    @PostMapping("/savePlayer")
    public String savePlayer(@ModelAttribute("user") Users user){
    	userService.saveUser(user);
        return "redirect:/players";
    }

    // http://localhost:8080/getPlayer
    @GetMapping("/getPlayer")
    public String getPlayer(@RequestParam("playerId") int id, Model model){
        model.addAttribute("player",userService.showUser(id));
        return "playerform";
    }

    @GetMapping("/removePlayer")
    public String removePlayer(@RequestParam("playerId") int id){
        userService.deleteUser(id);
        return "redirect:/players";
    }*/
}
