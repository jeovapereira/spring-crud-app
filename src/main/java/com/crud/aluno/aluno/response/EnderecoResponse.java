package com.crud.aluno.aluno.response;

import com.crud.aluno.aluno.entity.EnderecoEntity;

public class EnderecoResponse {
	
	private Integer codigo;
	
	private String logradouro;

	public EnderecoResponse(EnderecoEntity enderecoEntity) {
		this.codigo = enderecoEntity.getCodigo();
		this.logradouro = enderecoEntity.getLogradouro();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
