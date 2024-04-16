package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.clients.ViaCepClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CepController {

    private ViaCepClient viaCepClient;

    @GetMapping("/{cep}")
    public String consultaCep(@PathVariable String cep){
        return viaCepClient.consultaEndereco(cep);
    }
}
