package com.example.securityrole.service;

import com.example.securityrole.UzenetOsztaly;
import com.example.securityrole.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<UzenetOsztaly> getAllMessages() {
        return messageRepository.findAll();
    }
}