package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class GeneroService {
        @Service
        @Autowired
        private GeneroRepository generoRepository;

    public Genero salvar(Genero genero){
        return generoRepository.save(genero);
    }

    public List<Genero> listarTodos(){
        return generoRepository.findAll();
    }

    public Genero atualizar(Genero genero){
        if (genero.getId()==null){
            throw new RuntimeException("Genero sem ID");
        }
        return generoRepository.save(genero);
    }

    public Genero buscarPorId(Integer id){
        return generoRepository.findById(id).get();
    }

    public void excluir(Integer id){
        generoRepository.deleteById(id);
    }
    }

}
