package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "cartao")
public class Cartao {
    @Id
    private String numero;
    private String codigoSeguranca;
    private String nomeTitular;
    private LocalDate dataValidade;
}
