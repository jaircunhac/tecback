package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.User;
import br.com.fujideia.iesp.tecback.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository repository;

    public User salvar(User user){
        return repository.save(user);
    }

    public List<User> listarUsuarios(User user){
        return repository.findAll();
    }

    public void deleteUser(String CPF){
        repository.deleteById(CPF);
    }

    public User atualizar(User user){
        if (user.getEmail()==null){
            throw new RuntimeException("User sem email");
        }
        return repository.save(user);
    }
}
