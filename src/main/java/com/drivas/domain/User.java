package com.drivas.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	
	private int userID;
	
	private String email;
	
	private String passwordLogin;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordLogin() {
		return passwordLogin;
	}

	public void setPasswordLogin(String passwordLogin) {
		this.passwordLogin = passwordLogin;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	

}
