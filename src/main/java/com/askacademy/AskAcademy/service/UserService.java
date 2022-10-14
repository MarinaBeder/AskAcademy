package com.askacademy.AskAcademy.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.askacademy.AskAcademy.DB.Users;
import com.askacademy.AskAcademy.dao.UserDAO;

import java.util.List;

@Service
public class UserService {
    

    @Autowired
    private UserDAO userDao;
    /*public UserService(UserDAO userDao) {
        this.userDao = userDao;
    }*/

    public List<Users> allUsers() {
        // begain
        return this.userDao.findAll();
        // commit
    }
    public void saveUser(Users user) {
    	userDao.save(user);
    }
   // public Users showUser(long id) {
     //   return userDao.getById(id);
    //}

   /* 

    public void updateUser(Users user,int id) {
    	userDao.save(user);
    }
    

    public void deleteUser(int id) {
    	userDao.deleteById(id);
    }*/


    
}
