package com.brandao.atividades_aula_02.Cursos.controller;

import com.brandao.atividades_aula_02.Cursos.model.CursoModel;
import com.brandao.atividades_aula_02.Cursos.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<CursoModel> getAll() {return cursoService.getAll();}

    @PostMapping
    public CursoModel create(@RequestBody CursoModel curso) {return cursoService.save(curso);}
}
