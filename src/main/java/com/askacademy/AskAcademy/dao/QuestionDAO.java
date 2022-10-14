package com.askacademy.AskAcademy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.askacademy.AskAcademy.DB.QuesAnswUser;
import com.askacademy.AskAcademy.DB.Users;

@Repository
public interface QuestionDAO extends JpaRepository<QuesAnswUser,Long> {
	QuesAnswUser findByQuestion(@RequestParam String qustion);

}
