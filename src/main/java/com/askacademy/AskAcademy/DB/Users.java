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
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "user_id")
	    private long user_id;

	    @Column(name = "user_name")
	    private String name_user;

	    @Column(name = "email_user")
	    private String email_user;
	    @Column(name = "password_user")
	    private String password_user;
		public long getUser_id() {
			return user_id;
		}
		public void setUser_id(long user_id) {
			this.user_id = user_id;
		}
		public String getName_user() {
			return name_user;
		}
		public void setName_user(String name_user) {
			this.name_user = name_user;
		}
		public String getEmail_user() {
			return email_user;
		}
		public void setEmail_user(String email_user) {
			this.email_user = email_user;
		}
		public String getPassword_user() {
			return password_user;
		}
		public void setPassword_user(String password_user) {
			this.password_user = password_user;
		}

}
