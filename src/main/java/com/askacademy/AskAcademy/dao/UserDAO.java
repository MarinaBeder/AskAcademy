package com.askacademy.AskAcademy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.askacademy.AskAcademy.DB.Users;



@Repository
public interface UserDAO extends JpaRepository<Users,Long>{
//	List<Users>findByUser_nameContainig(@RequestParam String user_name)
	Users findByName(@RequestParam String name);

}
