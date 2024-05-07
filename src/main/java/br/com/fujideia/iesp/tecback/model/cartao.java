package br.com.fujideia.iesp.tecback.model;

import lombok.Data;

@Data
public class cartao {
    private String numero;
    private String codigoSeguranca;
    private String nomeTitular;
    private String dataValidade;
}
