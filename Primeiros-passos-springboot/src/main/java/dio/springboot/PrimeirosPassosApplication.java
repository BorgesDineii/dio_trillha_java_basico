package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args); {
	
	@Bean
	public CommmandLineRunner run(ConversonJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\":\"01001-000\",\"logadouro\":\"Praça da Sé\",\"localidade\":\"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}
	@Bean
	public Gson gson() {
		return new Gson();
	}
}

