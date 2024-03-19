package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Genero;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fujideia.iesp.tecback.service.GeneroService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/genero")

public class GeneroController {
    @Autowired
    private GeneroService generoservice;

    @PostMapping
    public Genero salvar(@RequestBody Genero genero){
        return generoservice.salvar(genero);
    }



}
