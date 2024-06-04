package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.User;
import br.com.fujideia.iesp.tecback.model.dto.UpdateUserDTO;
import br.com.fujideia.iesp.tecback.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private UserService service;

    @Operation(
            summary = "Salva um novo usuário")
    @PostMapping
    public User salvar(@Valid @RequestBody User user){
        return service.salvar(user);
    }

    @Operation (
            summary = "Lista todos os usuários")
    @GetMapping
    public List<User> listarUsuarios(){
        return service.listarUsuarios();
    }
    @Operation (
            summary = "Deletar um usuário pelo cpf")
    @DeleteMapping("/{CPF}")
    public void deleteUser(@PathVariable String CPF){
        service.deleteUser(CPF);
    }
    @Operation (
            summary = "Atualizar um usuário existente pelo cpf")
    @PutMapping("/{CPF}")
    public User atualizar(@PathVariable String CPF, @RequestBody UpdateUserDTO userDTO){
        return service.atualizar(CPF, userDTO);
    }
    @Operation(
            summary = "Listar um usuário existente pelo cpf")
    @GetMapping("/{CPF}")
    public User buscarPorId(@PathVariable String CPF){
        return service.buscarPorId(CPF);
    }
}
