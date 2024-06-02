package br.com.fujideia.iesp.tecback.model;

import br.com.fujideia.iesp.tecback.validator.IdadeRange;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    @IdadeRange(min = 7, max = 23)
    private Integer idade;
    @Transient
    private Integer anoLancamento;
    private String trailer;
//    @NotaRange(min = 0, max = 5)
//    private int relevancia;
    private LocalTime duracao;

//    @ManyToOne
//    @JoinColumn(name = "genero_id", nullable = false)
//    private Genero genero;
}