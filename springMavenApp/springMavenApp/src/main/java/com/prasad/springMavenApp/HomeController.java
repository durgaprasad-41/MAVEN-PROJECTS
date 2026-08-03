package com.prasad.springMavenApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("name", "Durga Prasad");

        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {

        model.addAttribute("message", "Welcome to About Page");

        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {

        model.addAttribute("email", "durgaprasad@gmail.com");

        return "contact";
    }

    @GetMapping("/academics")
    public String academics(Model model) {

        model.addAttribute("cgpa", "8.5");

        return "academics";
    }
}