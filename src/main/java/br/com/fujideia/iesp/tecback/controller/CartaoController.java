package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.CartaoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cartao")
public class CartaoController {
    private CartaoService service;

    @Operation(
            summary = "Salva um novo cartão")
    @PostMapping
    public Cartao salvar(@Valid @RequestBody Cartao cartao){
        return service.salvar(cartao);
    }
    @Operation (
            summary = "Atualiza um cartão existente pelo número")
    @PutMapping("/{numero}")
    public Cartao atualizar(@PathVariable String numero, @RequestBody Cartao cartao){
        return service.atualizar(numero, cartao);
    }
    @Operation (
            summary = "Lista todos os cartões existentes")
    @GetMapping
    public List<Cartao> listarCartoes(){
        return service.listarCartoes();
    }
    @Operation (
            summary = "Deletar um cartão pelo número")
    @DeleteMapping("/{numero}")
    public void delete(@PathVariable String numero){
        service.deleteCartao(numero);
    }

    @Operation (
            summary = "Retornar um cartao pelo numero")
    @GetMapping("/{numero}")
    public Cartao buscarPorId(@PathVariable String numero){
        return service.buscarPorId(numero);
    }
}
