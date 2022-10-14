package com.askacademy.AskAcademy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.askacademy.AskAcademy.DB.QuesAnswUser;


public interface QuestionDAO extends JpaRepository<QuesAnswUser,Long> {

}
