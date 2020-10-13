package com.vezbanje.jokesapp.controler;

import com.vezbanje.jokesapp.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
 private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

@RequestMapping("/")
    String sayJokes(Model model){
        model.addAttribute("joke",jokesService.getJokes());

        return "jokes";

    }

}



