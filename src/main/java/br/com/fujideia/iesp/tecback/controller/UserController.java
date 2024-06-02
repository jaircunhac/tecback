package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.User;
import br.com.fujideia.iesp.tecback.model.dto.UpdateUserDTO;
import br.com.fujideia.iesp.tecback.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private UserService service;

    @PostMapping
    public User salvar(@Valid @RequestBody User user){
        return service.salvar(user);
    }
    @GetMapping
    public List<User> listarUsuarios(){
        return service.listarUsuarios();
    }
    @DeleteMapping("/{CPF}")
    public void deleteUser(@PathVariable String CPF){
        service.deleteUser(CPF);
    }
    @PutMapping("/{CPF}")
    public User atualizar(@PathVariable String CPF, @RequestBody UpdateUserDTO userDTO){
        return service.atualizar(CPF, userDTO);
    }
}
