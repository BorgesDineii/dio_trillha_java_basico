package com.spring_boot_properties_values.App;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

import org.springframework.*;
import org.springframework.boot.CommandLineRunner;


@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    private Remetente remetente;
    @Override
    public void run(String...args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente.getNome() + "\nEmail:" + remetente.getEmail() + "\nCom telefones para contato: " + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado.");
    }
}
