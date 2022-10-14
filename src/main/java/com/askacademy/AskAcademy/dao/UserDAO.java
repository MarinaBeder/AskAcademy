package com.askacademy.AskAcademy.dao;

import org.springframework.data.jpa.repository.JpaRepository;




import com.askacademy.AskAcademy.DB.Users;




public interface UserDAO extends JpaRepository<Users,Long>{


}
