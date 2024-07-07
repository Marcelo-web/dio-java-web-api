package dio.web_api.controller;

import dio.web_api.model.Usuario;
import dio.web_api.repository.UsuarioRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = {"application/json"})
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @Operation(summary = "Busca todos os usuários.", method = "GET")
    @GetMapping()
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @Operation(summary = "Busca um usuário pelo seu username.", method = "GET")
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @Operation(summary = "Apaga um usuário pelo seu id.", method = "DELETE")
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @Operation(summary = "Salva um usuário.", method = "POST")
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @Operation(summary = "Atualiza um usuário.", method = "PUT")
    @PutMapping()
    public void putUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}
