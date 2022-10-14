package com.askacademy.AskAcademy.DB;

import lombok.AllArgsConstructor;


import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "quesanswuser")
public class QuesAnswUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qusetion_id")
    private long qusetion_id;

    @Column(name = "question")
    private String question;

    @OneToOne
    @JoinColumn(name="user_id")
    private Users user;
    
    @Column(name = "answer")
    private String answer;

	public long getQusetion_id() {
		return qusetion_id;
	}

	public void setQusetion_id(long qusetion_id) {
		this.qusetion_id = qusetion_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
    
   
}
