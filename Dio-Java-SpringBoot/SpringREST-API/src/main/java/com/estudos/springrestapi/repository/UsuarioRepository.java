package com.estudos.springrestapi.repository;

import com.estudos.springrestapi.model.Usuario;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import tools.jackson.databind.ser.jdk.JDKKeySerializers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Como não fui aviso na aula que ele ia querer um banco, só emulei os dados aqui com I.A mesmo
@Repository
public class UsuarioRepository {

    private List<Usuario> usuarios = new ArrayList<>();

    // Dados Mockados pra teste, sim, sem mockito e cru no código mesmo
    public UsuarioRepository() {
        usuarios.add(new Usuario(1, "carlos", "123456"));
        usuarios.add(new Usuario(2, "gleyson", "password"));
        usuarios.add(new Usuario(3, "frank", "masterpass"));
        usuarios.add(new Usuario(4, "admin", "admin123"));
        usuarios.add(new Usuario(5, "maria", "maria@2026"));
    }

    public void save(Usuario usuario) {
        usuarios.add(usuario);

        System.out.println("SAVE - Usuário salvo");
        System.out.println(usuario);
    }

    public List<Usuario> listAll() {
        return usuarios;
    }

    public Usuario findById(Integer id) {

        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }

        return null;
    }

    public Usuario findByLogin(String login) {

        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login)) {
                return usuario;
            }
        }

        return null;
    }

    public void update(Usuario usuario) {

        Usuario usuarioEncontrado = findById(usuario.getId());

        if (usuarioEncontrado != null) {
            usuarioEncontrado.setLogin(usuario.getLogin());
            usuarioEncontrado.setPassword(usuario.getPassword());

            System.out.println("Usuário atualizado");
        }
    }

    public void remove(Integer id) {

        Usuario usuarioRemover = findById(id);

        if (usuarioRemover != null) {
            usuarios.remove(usuarioRemover);

            System.out.println("Usuário removido");
        }
    }

//    public void save(Usuario usuario){
//        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
//        System.out.println(usuario);
//    }
//    public void update(Usuario usuario){
//        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
//        System.out.println(usuario);
//    }
//    public void remove(Integer id){
//        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
//        System.out.println(id);
//    }
//    public List<Usuario> listAll(){
//        List<Usuario> usuarios = new ArrayList<>();
//        usuarios.add(new Usuario("gleyson","password"));
//        usuarios.add(new Usuario("frank","masterpass"));
//        return usuarios;
//    }
//    public Usuario finById(Integer id){
//        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
//        return new Usuario("gleyson","password");
//    }
}

