package br.edu.ifsp.spring_exemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifsp.spring_exemplo.model.Usuario;

@RestController
public class UsuarioController {
    @GetMapping("/usuario")
    public Usuario recuperaUsuario(){
        Usuario usuario = new Usuario();
        usuario.setLogin("ifsp");
        usuario.setSenha("1234");
        return usuario;
    }
}
