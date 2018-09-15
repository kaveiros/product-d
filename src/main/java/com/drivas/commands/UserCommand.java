package com.drivas.commands;

import org.hibernate.validator.constraints.NotEmpty;

public class UserCommand {
	
	@NotEmpty
	private String userEmail;
	
	@NotEmpty
	private String userPass;

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	

}
