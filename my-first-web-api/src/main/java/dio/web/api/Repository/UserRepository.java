package dio.web.api.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.Model.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("Save - Recebendo o usuario na camada de repositorio");
        else
            System.out.println("Update - Recebendo o usario na camada de repositorio");

        System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("Delete/id - Recebendo o id: %d para excluir um usuario"));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("List - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Borges","password"));
        usuarios.add(new Usuario("cr7","masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("Find/id - Recebendo o id: %d para ler o ID do usuario"));
        return new Usuario("borges","password");
    }
    public Usuario findByUsername(String username) {
        System.out.println(String.format("Find/username - recebendo o username: %d para ler o username do usuario"));
        return new Usuario("borges","password");
    }
}
