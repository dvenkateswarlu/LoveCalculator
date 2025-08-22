package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import com.example.demo.EmailService.LcAppLogic;
import com.example.demo.UserDTO.HomePage;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("userinfo")
public class HomeController {
	
	@Autowired
	private LcAppLogic logic;
	
    @ModelAttribute("userinfo")
    public HomePage userinfo() {
        return new HomePage();
    }

    @GetMapping("/home")
    public String home(Model model) {
       
        return "home";
    }

    @PostMapping("/home-process")
    public String homeProcess(@Valid @ModelAttribute("userinfo") HomePage homepage,
                              BindingResult result,
                              Model model) {
        if (result.hasErrors()) {
            System.out.println("Form has errors....");
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError temp : allErrors) {
                System.out.println(temp);
            }
            return "home";
        }
        
        String appResult = logic.calculateLove(homepage.getUsername(), homepage.getCrushname());
        homepage.setResult(appResult);
        model.addAttribute("scoreMessage",
            "Hi " + homepage.getUsername() + ", your love score with " + homepage.getCrushname() + " is 92% ❤️");
        return "home-process";
    }
}
