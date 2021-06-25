package com.crud.aluno.aluno.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.aluno.aluno.entity.AlunoEntity;
import com.crud.aluno.aluno.repository.AlunoRepository;
import com.crud.aluno.aluno.response.AlunoResponse;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<AlunoResponse> buscarTodosAlunos() throws Exception {
		List<AlunoEntity> entities = alunoRepository.buscarTodosAlunos();
		
		return entities.stream().map(AlunoResponse::new).collect(Collectors.toList());
	}

	public AlunoResponse buscarAlunoPorCodigo(Integer codigoAluno) throws Exception {
		Optional<AlunoEntity> entityOp = alunoRepository.buscarAlunoPorCodigo(codigoAluno);
		if (entityOp.isPresent()) {
			AlunoEntity entity = entityOp.get();
			return new AlunoResponse(entity);
		} 
		
		return null;
	}

}
