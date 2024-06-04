package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Serie;
import br.com.fujideia.iesp.tecback.service.SerieService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/serie")
public class SerieController {

    private SerieService service;

    @Operation(summary = "Salva uma serie nova")
    @PostMapping
    public Serie salvar(@Valid@RequestBody Serie serie){
        return service.salvar(serie);
    }

    @Operation(summary = "Atualiza uma serie existente")
    @PutMapping("/{id}")
    public Serie atualizar(@PathVariable Integer id, @RequestBody Serie serie){
        return service.atualizar(id, serie);
    }

    @Operation(summary = "Lista todas as series existentes")
    @GetMapping
    public List<Serie> listarTodos(){
        return service.listarTodos();
    }
    @Operation(summary = "Listar Serie por ID")
    @GetMapping("/{id}")
    public Serie buscarPorId(@PathVariable Integer id){
        return service.buscarPorId(id);
    }

    @Operation(summary = "Deleta uma serie existente pelo id")
    @DeleteMapping("/{id}")
    public void delete(Integer id){
        service.delete(id);
    }
}
