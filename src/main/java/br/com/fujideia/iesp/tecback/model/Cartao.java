package br.com.fujideia.iesp.tecback.model;

import lombok.Data;

@Data
public class Cartao {
    private String numero;
    private String codigoSeguranca;
    private String nomeTitular;
    private String dataValidade;
}
