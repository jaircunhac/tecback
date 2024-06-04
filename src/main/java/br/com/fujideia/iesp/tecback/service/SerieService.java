package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Serie;
import br.com.fujideia.iesp.tecback.repository.SerieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SerieService {
    private SerieRepository repository;

    public Serie salvar(Serie serie){
        return repository.save(serie);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Serie atualizar(Integer id, Serie serie){
        if (serie.getId()==null){
            throw new RuntimeException("Serie sem Id");
        }
        return repository.save(serie);
    }

    public List<Serie> listarTodos(){
        return repository.findAll();
    }

    public Serie buscarPorId(Integer id){
        return repository.findById(id).get();
    }
}
