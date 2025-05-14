package dio.springboot;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;;

@Component
public class ConversonJson {
    @Autowired
    private Gson gson;
    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
