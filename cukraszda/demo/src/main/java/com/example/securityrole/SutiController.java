package com.example.securityrole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SutiController {
    @Autowired private SutiRepo sutiRepo;

    @GetMapping("/suti")
    public Iterable<Suti> sutiAll() {
        return sutiRepo.findAll();
    }

    @GetMapping("/suti/{id}")
    public Optional<Suti> sutiById(@PathVariable int id) {
        return sutiRepo.findById(id);
    }

    @PostMapping("/suti")
    public Suti sutiCreate(@RequestBody Suti suti) {
        return sutiRepo.save(suti);
    }

    @PutMapping("/suti/{id}")
    public Suti sutiUpdate(@RequestBody Suti suti, @PathVariable int id) {
        return sutiRepo.findById(id)
                .map(s -> {
                    s.setNev(suti.getNev());
                    s.setTipus(suti.getTipus());
                    s.setDijazott(suti.isDijazott());
                    return sutiRepo.save(s);
                }).orElseGet(() -> {
                    suti.setId(id);
                    return sutiRepo.save(suti);
                });
    }

    @DeleteMapping("/suti/{id}")
    public void sutiDelete(@PathVariable int id) {
        sutiRepo.deleteById(id);
    }
}
