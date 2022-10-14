package com.askacademy.AskAcademy.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.askacademy.AskAcademy.DB.Users;



@Repository
public interface UserDAO extends JpaRepository<Users,Long>{
	
}
