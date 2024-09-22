package com.cidadaniaItaliana.castellani.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String index() {
        return "index"; // Retorna o arquivo index.html
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; // Retorna o arquivo cadastro.html
    }
}
