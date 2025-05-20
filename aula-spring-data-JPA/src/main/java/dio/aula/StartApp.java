package dio.aula;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import dio.aula.model.Users;
import dio.aula.repository.*;

public class StartApp  implements CommandLineRunner{
    @Autowired
    private UsersRepository repository;
    @Override
    public void run(String... args) throws Exception{}
        Users user = new Users();
        user.setName("Borges");
        user.setUsername("bg");
        user.setPassword("123456");

        repository.save(user);

        for(Users u: repository.findAll()) {
            System.out.println(u);
        }
}
