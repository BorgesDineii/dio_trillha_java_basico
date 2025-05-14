package dio.springboot;

import org.springframework.context.annotation.Bean;

@Configuration
public class Beans {
    	@Bean
	public Gson gson() {
		return new Gson();
	}
}

