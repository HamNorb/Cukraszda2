package com.example.securityrole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Vezerlo {
    @Autowired
    private SutiRepo sutiRepo; // Dependency injection

    // Főoldal - A főoldal kiszolgálása a "/fooldal" útvonalon
    @GetMapping("/fooldal")
    public String Fooldal(Model model, String uzenet) {
        model.addAttribute("dolgozok", sutiRepo.findAll());
        return "user2"; // index.html
    }
}