package com.brandao.atividades_aula_02.Cursos.service;

import com.brandao.atividades_aula_02.Cursos.model.CursoModel;
import com.brandao.atividades_aula_02.Cursos.repository.CursoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<CursoModel> getAll() {return cursoRepository.findAll();}
    public CursoModel save(CursoModel curso) {return cursoRepository.save(curso);}
    public void delete(Long id) {cursoRepository.deleteById(id);}
}
