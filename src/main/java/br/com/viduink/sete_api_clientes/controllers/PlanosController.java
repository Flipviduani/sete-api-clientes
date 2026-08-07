package br.com.viduink.sete_api_clientes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/planos")
public class PlanosController {

    @GetMapping
    public String get(){
        return "Consulta realizada com sucesso!";
    }
}
