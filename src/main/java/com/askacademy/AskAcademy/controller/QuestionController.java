package com.askacademy.AskAcademy.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	  @PostMapping("/SendQuestion")
	   public String saveQuestionToDB(@RequestBody QuesAnswUser quesAnswUser){
		   questionService.saveQestion(quesAnswUser);
	        return "Your Question is sent";
	    }
	 /* @GetMapping("/getQuestion")
	    public QuesAnswUser getQuestion(@RequestParam String question){
		  
	         return questionService.getQuestionByName(question);
	     }*/

	 
}
