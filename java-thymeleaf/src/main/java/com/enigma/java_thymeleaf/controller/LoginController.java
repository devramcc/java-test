package com.enigma.java_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.enigma.java_thymeleaf.repository.StudentRepository;

@Controller
public class LoginController {

    private StudentRepository studentRepository;

    public LoginController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "loginPage";
    }

    @PostMapping("/login")
    public String WelcomePage(@RequestParam String userid,
                              @RequestParam String password,
                              Model model) {
        if (userid.equals("admin") && password.equals("password")) {
            model.addAttribute("userid", userid);
            model.addAttribute("students", studentRepository.getAllStudents());
            return "welcomePage";
        } else {
            model.addAttribute("error", "Invalid credential.");
            return "loginPage";
        }
    }
}
