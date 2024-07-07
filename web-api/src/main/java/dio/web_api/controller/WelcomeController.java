package dio.web_api.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Operation(summary = "Retorna uma saudação ao usuário", method = "GET")
    @GetMapping("/")
    public String welcome() {
        return "Welcome to my Spring Boot Web API";
    }
}
