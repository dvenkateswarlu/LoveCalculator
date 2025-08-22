package com.example.demo.UserDTO;
import com.example.demo.CommunicationDTO.CommunicationDTO;
import com.example.demo.Validator.Age;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class RegisterDTO {

	private String name;
	@NotBlank(message = "Enter your user name")
	private String username;
	 @NotBlank(message = "enter the password")
	    @Pattern(
	        regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
	        message = "Password must be at least 8 chars, have upper, lower, digit and special char"
	    )
	private String password;
	private String country;
	@NotBlank(message = "Enter your gender")
	private String gender;
	
	@Age(lower =18,upper=50)
	private Integer age;
	
	private CommunicationDTO communicationdto;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public CommunicationDTO getCommunicationdto() {
		return communicationdto;
	}
	public void setCommunicationdto(CommunicationDTO communicationdto) {
		this.communicationdto = communicationdto;
	}
	
	@Override
	public String toString() {
		return "RegisterDTO [name=" + name + ", username=" + username + ", password=" + password + ", country="
				+ country + ", gender=" + gender + ", age=" + age + ", communicationdto=" + communicationdto + "]";
	}
	
	
}
