package com.askacademy.AskAcademy.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.askacademy.AskAcademy.DB.QuesAnswUser;
import com.askacademy.AskAcademy.service.QuestionService;


@RestController
public class QuestionController {
	@Autowired
	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {
		this.questionService = questionService;}
	@GetMapping("/Questions")
    public List<QuesAnswUser> getAllUQuestions(){
      
        return questionService.allQestions();
    }
	  @RequestMapping("/Question/{id}")
	   public QuesAnswUser getQuestion(@PathVariable(name="id")long id){
		   
	        return questionService.getQuestionById(id);
	    }
	  
	  @PutMapping("/edit/{id}")
	   public QuesAnswUser updateQuestion(@RequestBody QuesAnswUser quesAnswUser,@PathVariable int id  ){
		  quesAnswUser.setId(id);
		  questionService.update(quesAnswUser, id);
	        return quesAnswUser;
	    }
	 /* @GetMapping("/getQuestion")
	    public QuesAnswUser getQuestion(@RequestParam String question){
		  
	         return questionService.getQuestionByName(question);
	     }*/

	 
}
