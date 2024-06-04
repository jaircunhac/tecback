package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Genero;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.fujideia.iesp.tecback.service.GeneroService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/genero")

public class GeneroController {
    @Autowired
    private GeneroService generoservice;

    @Operation(
            summary = "Salvar um novo genero")
    @PostMapping
    public Genero salvar(@RequestBody Genero genero) {
        return generoservice.salvar(genero);
    }

    @Operation(
            summary = "Listar todos os generos")
    @GetMapping
    public List<Genero> listarTodos() {
        return generoservice.listarTodos();
    }

    @Operation(
            summary = "Deletar um genero por ID")
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        generoservice.excluir(id);

    }
}