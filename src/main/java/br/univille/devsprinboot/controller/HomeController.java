package br.univille.devsprinboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping
    public ModelAndView index(){
        var mensagem = "Bem-vindo";
        return new ModelAndView("paciente/index","msg",mensagem);
    }   
}
