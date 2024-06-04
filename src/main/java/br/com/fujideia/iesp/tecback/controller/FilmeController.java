package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/filme")
public class FilmeController {
    private FilmeService service;

    @Operation (
                    summary = "Salva um novo filme")
    @PostMapping
    public Filme salvar(@Valid @RequestBody Filme filme){
        return service.salvar(filme);
    }
    @Operation (
            summary = "atualizar um filme existente")
    @PutMapping("/{id}")
    public Filme atualizar(@PathVariable Integer id, @RequestBody Filme filme){
        return service.atualizar(id, filme);
    }
    @Operation (
            summary = "Listar todos os filmes disponíveis")
    @GetMapping
    public List<Filme> listarTodos(){
        return service.listarTodos();
    }
    @Operation (
            summary = "Retornar um filme pelo ID")
    @GetMapping("/{id}")
    public Filme buscarPorId(@PathVariable Integer id){
        return service.buscarPorId(id);
    }
    @Operation (
            summary = "Deletar um filme pelo ID")
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluir(id);
    }
}