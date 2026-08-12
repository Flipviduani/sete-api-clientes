package br.com.viduink.sete_api_clientes.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    /*
     * Método para configurar a documentação do Swagger
     * Título: API Clientes - Treinamento Vidu Ink
     * Autor: Vidu Ink
     * Versão: 1.0
     */

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Clientes - Treinamento Vidu Ink")
                        .version("1.0")
                        .description("API para gerenciamento de clientes.")
                        .contact(new Contact()
                                .name("Vidu Ink")));
    }
}