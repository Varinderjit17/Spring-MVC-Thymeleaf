package com.rupicodes.thymeleaf.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "hello-world-form";
    }

    //pass form data to HTML
    @RequestMapping("/process-form")
    public String processForm() {
        return "hello-world-results";
    }

    //read form data
    @RequestMapping("/read-form")
    public String readForm(HttpServletRequest request, Model model) {
        String name = request.getParameter("myName");
        model.addAttribute("myName", name);
        return "read-form";
    }
}
