package com.example.securityrole;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UrlapController {
    private final UzenetService uzenetService;

    public UrlapController(UzenetService uzenetService) {
        this.uzenetService = uzenetService;
    }

    @GetMapping("/feladat")
    public String urlapForm(Model model) {
        model.addAttribute("attr1", new UzenetOsztaly());
        return "urlap";
    }

    @PostMapping("/feladat2")
    public String urlapSubmit(@ModelAttribute UzenetOsztaly uzenetOsztaly, Model model) {
        uzenetService.saveUzenet(uzenetOsztaly);
        model.addAttribute("attr2", uzenetOsztaly);
        return "eredmeny";
    }
}
