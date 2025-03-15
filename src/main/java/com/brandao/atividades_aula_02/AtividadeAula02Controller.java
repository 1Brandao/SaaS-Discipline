package com.brandao.atividades_aula_02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AtividadeAula02Controller {

    @GetMapping("/cursos")
    public String infoCurso() {
        return "[" +
                "{" +
                "\"Id\": 1," +
                "\"Name\":\"Engenharia de Software\"," +
                "\"Description\":\"Melhor Curso\"" + // Removi a vírgula extra aqui
                "}" +
                "]";
    }


}
