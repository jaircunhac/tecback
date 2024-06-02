package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name= "usuario")
public class User {
    @Id
    private String CPF;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;
    private String email;
    private String senha;
}
