package com.docencia.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;  

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "welcome to spring boot World!");
        model.addAttribute("subtitle", "This is a simple example of a web application with Spring Boot EAFIT App");
        return "home/index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us - Online Store");
        model.addAttribute("subtitle", "About Us");
        model.addAttribute("description", "This is an about page ...");
        model.addAttribute("author", "Developed by: Samuel Acosta");
        return "home/about";
}

@GetMapping("/contact")
public String contact(Model model) {
    model.addAttribute("title", "Contact Us");
    model.addAttribute("description", "more information about us...");
    model.addAttribute("email", "samuel@samuel.com");
    model.addAttribute("phone", "+53 968695894");
    model.addAttribute("address", "calle 56#87, Medallo, Colombia");
    return "home/contact";
}


}