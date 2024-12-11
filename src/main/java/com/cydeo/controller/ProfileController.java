package com.cydeo.controller;

import com.cydeo.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String getProfile(Model model){

        Profile person = new Profile();

        person.setName("John");
        person.setSurname("Doe");
        person.setUserName("johndoe");
        person.setEmail("johndoe@cydeo.com");
        person.setPhoneNumber("0123456789");
        person.setCreatedDate(LocalDateTime.now());

        model.addAttribute("profile", person);

        return "profile/profile-info";
    }
}
