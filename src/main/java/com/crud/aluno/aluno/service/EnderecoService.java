package com.crud.aluno.aluno.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.aluno.aluno.entity.EnderecoEntity;
import com.crud.aluno.aluno.repository.EnderecoRepository;
import com.crud.aluno.aluno.response.EnderecoResponse;

@Service
public class EnderecoService {

	@Autowired
	public EnderecoRepository enderecoRepository;
	
	public List<EnderecoResponse> buscarTodosEndereco() throws Exception {
		List<EnderecoEntity> entities = enderecoRepository.buscarTodosEndereco();
		return entities.stream().map(EnderecoResponse::new).collect(Collectors.toList());
	}

	public EnderecoResponse buscarEnderecoPorCodigo(Integer codigoEndereco) throws Exception {
		Optional<EnderecoEntity> entityOp = enderecoRepository.buscarEnderecoPorCodigo(codigoEndereco);
		if (entityOp.isPresent()) {
			EnderecoEntity entity = entityOp.get();
			return new EnderecoResponse(entity);
		}
		
		return null;
	}
	
}
