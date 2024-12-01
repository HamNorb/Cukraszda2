package com.example.securityrole;

import com.example.securityrole.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages")
    public String showMessages(Model model) {
        model.addAttribute("messages", messageService.getAllMessages());
        return "messages";
    }
}