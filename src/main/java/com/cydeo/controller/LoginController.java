package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login/{email}/{phone}")
    public String login(Model model, @PathVariable String email, @PathVariable String phone){

        model.addAttribute("email", email);
        model.addAttribute("phoneNumber", phone);
        model.addAttribute("loginMessage", "Login successful");

        return "login/login-info";
    }
}
