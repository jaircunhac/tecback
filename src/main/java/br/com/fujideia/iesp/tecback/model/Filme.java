package br.com.fujideia.iesp.tecback.model;

import br.com.fujideia.iesp.tecback.validator.IdadeRange;
import br.com.fujideia.iesp.tecback.validator.NotaRange;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

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
    @NotaRange
    private Integer relevancia;
    private LocalTime duracao;

//    @ManyToOne
//    @JoinColumn(name = "genero_id", nullable = false)
//    private Genero genero;
}