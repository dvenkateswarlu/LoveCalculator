package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.demo.EmailService.LcAppEntityService;
import com.example.demo.EntityClass.UserEntity;
import com.example.demo.UserDTO.HomePage;
import com.example.demo.UserDTO.LoginPage;

import jakarta.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private LcAppEntityService entityService;

    @RequestMapping("/")
    public String loginPage(Model model) {
        model.addAttribute("loginfo", new LoginPage());
        return "Login";
    }

    @PostMapping("/login-process")
    public String login(@Valid @ModelAttribute("loginfo") LoginPage loginpage,
                        BindingResult bindingResult,
                        Model model) {

        if (bindingResult.hasErrors()) {
            return "Login";
        }

        Optional<UserEntity> userOpt = entityService.authenticate(loginpage.getEmail(), loginpage.getPassword());
        if (userOpt.isPresent()) {
            
            HomePage hp = new HomePage();
            model.addAttribute("userinfo", hp);
            return "home";
        } else {
            model.addAttribute("error", "Invalid username or password!");
            return "Login";
        }
    }
}
