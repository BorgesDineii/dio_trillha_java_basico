package spring_scopes_singleton_prototype.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.*;
import org.springframework.context.annotation.Bean; 

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("Criando um objeto remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }
}
