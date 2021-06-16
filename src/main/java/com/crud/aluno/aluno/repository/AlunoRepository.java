package com.crud.aluno.aluno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crud.aluno.aluno.entity.AlunoEntity;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity,Integer> {
	@Query(value="SELECT * FROM \"GERENCIAMENTO_ALUNO\".\"ALUNO\"",nativeQuery = true)
	List<AlunoEntity> buscarTodosAlunos();

}
