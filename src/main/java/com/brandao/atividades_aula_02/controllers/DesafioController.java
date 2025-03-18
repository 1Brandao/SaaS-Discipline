package com.brandao.atividades_aula_02.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
class DesafioController {

    @GetMapping()
    public String getHomePage(Model model) {
        model.addAttribute("mensagem", "Hello-World");
        return "index";
    }
}
