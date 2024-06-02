package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.service.CartaoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cartao")
public class CartaoController {
    private CartaoService service;

    @PostMapping
    public Cartao salvar(@Valid @RequestBody Cartao cartao){
        return service.salvar(cartao);
    }
    @PutMapping("/{numero}")
    public Cartao atualizar(@PathVariable String numero, @RequestBody Cartao cartao){
        return service.atualizar(numero, cartao);
    }
    @GetMapping
    public List<Cartao> listarCartoes(){
        return service.listarCartoes();
    }
    @DeleteMapping("/{numero}")
    public void delete(@PathVariable String numero){
        service.deleteCartao(numero);
    }
}
