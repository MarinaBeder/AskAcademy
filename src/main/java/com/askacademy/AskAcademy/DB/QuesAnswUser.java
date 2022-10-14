package com.askacademy.AskAcademy.DB;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "quesanswuser")
public class QuesAnswUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qusetion_id")
    private int id;

    @Column(name = "question")
    private String name;

    @OneToOne
    @JoinColumn(name="user_id")
    private Users user;
    @Column(name = "answer")
    private String answer;

   
}
