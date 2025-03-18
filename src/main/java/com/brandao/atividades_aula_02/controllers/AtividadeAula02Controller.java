package com.brandao.atividades_aula_02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AtividadeAula02Controller {

    @GetMapping("/cursos")
    public Map<String, Object> infoCurso() {
        Map<String, Object> cursos = new HashMap<>();
        cursos.put("ID", "001");
        cursos.put("nome", "Engenharia de Software");
        cursos.put("descricao", "Melhor Curso");
        cursos.put("instituicao", "Faculdade Biopark Educacao");
        return cursos;
    }

    @GetMapping("/local")
    public Map<String, String> getLocalizacao() {
        Map<String, String> localizacao = new HashMap<>();
        try {
            InetAddress ip = InetAddress.getLocalHost();
            localizacao.put("ip", ip.getHostAddress());
            localizacao.put("hostname", ip.getHostName());
        } catch (UnknownHostException e) {
            localizacao.put("error", "Não foi possível obter a localização do servidor");
        }
        return localizacao;
    }

    @GetMapping("/data")
    public Map<String, String> getDataHora() {
        Map<String, String> dataHora = new HashMap<>();
        dataHora.put("data-hora", LocalDateTime.now().toString());
        return dataHora;

    }

}
