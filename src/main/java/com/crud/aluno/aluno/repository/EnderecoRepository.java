package com.crud.aluno.aluno.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crud.aluno.aluno.entity.EnderecoEntity;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity,Integer> {
	
	@Query(value="SELECT * FROM \"GERENCIAMENTO_ALUNO\".\"ENDERECO\"",nativeQuery = true)
	List<EnderecoEntity> buscarTodosEndereco();
	
	@Query(value="SELECT * FROM \"GERENCIAMENTO_ALUNO\".\"ENDERECO\" WHERE \"GERENCIAMENTO_ENDERECO\".\"ENDERECO\".\"CODIGO\" = ?1",nativeQuery = true)
	Optional<EnderecoEntity> buscarEnderecoPorCodigo(Integer codigoEndereco);

}
