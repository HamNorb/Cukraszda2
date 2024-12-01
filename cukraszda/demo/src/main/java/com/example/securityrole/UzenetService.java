package com.example.securityrole;

import org.springframework.stereotype.Service;

@Service
public class UzenetService {
    private final UzenetRepository uzenetRepository;

    public UzenetService(UzenetRepository uzenetRepository) {
        this.uzenetRepository = uzenetRepository;
    }

    public void saveUzenet(UzenetOsztaly uzenet) {
        uzenetRepository.save(uzenet);
    }
}