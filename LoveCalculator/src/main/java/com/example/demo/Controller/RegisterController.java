package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.EntityClass.UserEntity;
import com.example.demo.EntityClass.Repo.UserRepo;
import com.example.demo.UserDTO.RegisterDTO;

import jakarta.validation.Valid;

@Controller
public class RegisterController {

	@Autowired
	UserRepo repo;

	@RequestMapping("/register")
	public String Registration(@ModelAttribute("reginfo") RegisterDTO registerdto) {
		return "registration";
	}

	@RequestMapping("/register-process")
	public String RegistrationProcess(@Valid @ModelAttribute("reginfo") RegisterDTO registerdto, BindingResult result) {
		UserEntity et = new UserEntity();

		if (result.hasErrors()) {
			System.out.println("Form has errors....");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "registration";
		}

		et.setPassword(registerdto.getPassword());
		et.setEmail(registerdto.getCommunicationdto().getEmail());
		et.setUsername(registerdto.getUsername());
		repo.save(et);
		return "register-process";
	}
}
