package com.example.demo.EmailDTO;

import jakarta.validation.constraints.Email;

public class EmailDTO {

	@Email
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmailDTO [email=" + email + "]";
	}
	
	
}
