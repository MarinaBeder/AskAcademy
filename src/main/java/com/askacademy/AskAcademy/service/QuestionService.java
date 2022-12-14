package com.askacademy.AskAcademy.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.askacademy.AskAcademy.DB.QuesAnswUser;
import com.askacademy.AskAcademy.dao.QuestionDAO;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionDAO questionDAO ;
  

    public List<QuesAnswUser> allQestions() {
        // begain
        return this.questionDAO .findAll();
        // commit
    }
    public void saveQestion(QuesAnswUser quesAnswUser) {
    	questionDAO.save(quesAnswUser);
    }
    
    public QuesAnswUser getQuestionById(long id){
        return questionDAO.findById(id).get();
        
    }
    public void update(QuesAnswUser quesAnswUser,long id) {
    	questionDAO.save(quesAnswUser);
    }
    public QuesAnswUser get( long id) {
        return questionDAO.findById(id).get();
    }
    
}
