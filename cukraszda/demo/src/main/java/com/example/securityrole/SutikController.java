package com.example.securityrole;

import com.example.securityrole.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SutikController {
    @Autowired
    private ArRepository arRepo;
    @Autowired private SutiRepo sutiRepo;
    @Autowired private TartalomRepository tartalomRepo;

    @GetMapping("/sutik")
    public String sutik(Model model) {
        List<Ar> arak = arRepo.findAll();
        List<Tartalom> tartalom = tartalomRepo.findAll();
        List<SutiTartalomAr> sutiTartalomArak = new ArrayList<SutiTartalomAr>();

        for (Ar ar : arak) {
            SutiTartalomAr sutiTartalomAr = new SutiTartalomAr(
                    ar.getSuti().getNev(),
                    ar.getSuti().getTipus(),
                    "",
                    ar.getErtek(),
                    ar.getEgyseg(),
                    ar.getSuti().isDijazott());

            StringBuilder mentes = new StringBuilder();
            for (Tartalom t : tartalom) {
                if (t.getSuti().getId() == ar.getSuti().getId()) {
                    mentes.append(t.getMentes()).append(", ");
                }
            }

            if (mentes.length() > 2) {
                mentes.delete(mentes.length() - 2, mentes.length());
                sutiTartalomAr.setMentes(mentes.toString());
            }

            sutiTartalomArak.add(sutiTartalomAr);
        }

        model.addAttribute("sutiTartalomArak", sutiTartalomArak);
        return "sutik"; // Thymeleaf template name
    }
}