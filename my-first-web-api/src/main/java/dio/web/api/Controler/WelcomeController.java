package dio.web.api.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Bem vindo a minha primeira pagina rest web api com java\nHello world! kk";
    }
}
