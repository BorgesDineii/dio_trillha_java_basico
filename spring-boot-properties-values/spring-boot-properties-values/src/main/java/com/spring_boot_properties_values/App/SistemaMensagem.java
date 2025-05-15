package com.spring_boot_properties_values.App;
import java.util.ArrayList;

import org.springframework.*;
import org.springframework.boot.CommandLineRunner;


@Component
public class SistemaMensagem implements CommandLineRunner {
    @Value("${nome}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String...args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome + "\nEmail:" + email + "\nCom telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi aprovado.");
    }
}
