package spring_scopes_singleton_prototype.app;
import org.springframework.stereotype.*;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;
    public void enviarConfirmacapCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }
    public void enviarMensagemBoasVindas() {
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem vindo a Tech Elite");
    }
}
