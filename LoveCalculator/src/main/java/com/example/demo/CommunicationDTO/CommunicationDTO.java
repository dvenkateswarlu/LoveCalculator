package com.example.demo.CommunicationDTO;

import jakarta.validation.constraints.Email;

public class CommunicationDTO {

	@Email
	private String email;
	private Phone phone;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "CommunicationDTO [email=" + email + ", phone=" + phone + "]";
	}	
}
