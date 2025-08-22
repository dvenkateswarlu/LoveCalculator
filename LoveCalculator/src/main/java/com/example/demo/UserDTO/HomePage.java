package com.example.demo.UserDTO;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;

public class HomePage {

    @NotBlank(message = "Enter your name")
    private String username;

    @NotBlank(message = "Enter your crush's name")
    private String crushname;

    private String result;
    
    @AssertTrue(message = "You must agree that this is for fun")
    private boolean termsandprivacy;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getCrushname() { return crushname; }
    public void setCrushname(String crushname) { this.crushname = crushname; }

    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
    
    public boolean isTermsandprivacy() { return termsandprivacy; }
    public void setTermsandprivacy(boolean termsandprivacy) { this.termsandprivacy = termsandprivacy; }

    @Override
	public String toString() {
		return "HomePage [username=" + username + ", crushname=" + crushname + ", result=" + result
				+ ", termsandprivacy=" + termsandprivacy + "]";
	}
}
