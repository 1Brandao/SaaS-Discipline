package com.brandao.atividades_aula_02.Cursos.repository;

import com.brandao.atividades_aula_02.Cursos.model.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CursoRepository extends JpaRepository<CursoModel, Long> {
}
