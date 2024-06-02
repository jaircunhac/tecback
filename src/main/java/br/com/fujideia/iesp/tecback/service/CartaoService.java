package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.repository.CartaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CartaoService {
    private CartaoRepository repository;

    public Cartao salvar(Cartao cartao){
        return repository.save(cartao);
    }

    public void deleteCartao(String numero){
        repository.deleteById(numero);
    }

    public Cartao atualizar(String numero, Cartao cartao){
        if (cartao.getDataValidade()==null){
            throw new RuntimeException("Cartao sem data de validade");
        }
        return repository.save(cartao);
    }

    public List<Cartao> listarCartoes(){
        return repository.findAll();
    }
}
