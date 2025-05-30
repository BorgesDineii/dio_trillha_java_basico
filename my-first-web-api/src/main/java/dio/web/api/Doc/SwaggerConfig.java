package dio.web.api.Doc;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.*;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato() {
        return new Contact(
            name:"Seu nome",
            url:"http://www.seusite.com.br",
            email:"voce@seusite.com.br");
    };
    private ApiInfoBuilder informacoesApi () {
        ApiInfoBuilder apiInforBuilder = new ApiInforBuilder();

        apiInforBuilder.title("Title - Rest API");
        apiInforBuilder.description("API exemplo de uso de Springboot REST API");
        apiInforBuilder.version("1.0");
        apiInforBuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiInforBuilder.license("Licença - Sua Empresa");
        apiInforBuilder.LicenseUrl("http://www.seusite.com.br");
        apiInforBuilder.contact(this.contato());

        return apiInforBuilder;
    }
    @Bean 
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
            .select()apiSelectorBuilder
            .apis(RequestHandlerSelectors.basePackage("pacote.com.seus.controllers"))
            .paths(PathSelectors.any())
            .build()DockingListener.apiInfo(this.informacoesApi().build())
            .consumes(new HashSet<String>(Arrays.asList("application/json")))
            .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }
} 
