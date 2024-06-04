package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.User;
import br.com.fujideia.iesp.tecback.model.dto.UpdateUserDTO;
import br.com.fujideia.iesp.tecback.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository repository;

    public User salvar(User user){
        return repository.save(user);
    }

    public List<User> listarUsuarios(){
        return repository.findAll();
    }

    public void deleteUser(String CPF){
        repository.deleteById(CPF);
    }

    public User atualizar(String CPF, UpdateUserDTO userDto){
        Optional<User> optionalUser = repository.findById(CPF);
        if (!optionalUser.isPresent()) {
            throw new RuntimeException("User not found with CPF: " + CPF);
        }

        User user = optionalUser.get();

        user.setNomeCompleto(userDto.getNomeCompleto());
        user.setEmail(userDto.getEmail());
        user.setDataDeNascimento(userDto.getDataDeNascimento());
        user.setSenha(userDto.getSenha());

        return repository.save(user);
    }

    public User buscarPorId(String CPF){
        return repository.findById(CPF).get();
    }
}
