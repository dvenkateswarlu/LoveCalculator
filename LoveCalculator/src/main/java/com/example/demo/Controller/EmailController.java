package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.example.demo.EmailDTO.EmailDTO;
import com.example.demo.EmailService.LcAppEmailServiceImp;
import com.example.demo.UserDTO.HomePage;

@Controller
public class EmailController {

	@Autowired
	private LcAppEmailServiceImp lcAppEmailService;
	
	@RequestMapping("/email")
	public String emailController(@ModelAttribute("emailinfo") EmailDTO emaildto)
	{
		return "email";
	}
	
	@RequestMapping("/email-process")
	public String emailProcess(@ModelAttribute("emailinfo") EmailDTO emaildto,@SessionAttribute("userinfo") HomePage homepage,  Model model)
	{
		lcAppEmailService.sendMail(homepage.getUsername(), emaildto.getEmail(), homepage.getResult());
		return "email-process";
	}
	
}
