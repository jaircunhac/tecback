package br.com.fujideia.iesp.tecback.model.dto;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UpdateUserDTO {
    private String nomeCompleto;
    private LocalDate dataDeNascimento;
    private String email;
    private String senha;
}