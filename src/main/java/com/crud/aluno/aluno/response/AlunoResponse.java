package com.crud.aluno.aluno.response;

import com.crud.aluno.aluno.entity.AlunoEntity;

public class AlunoResponse {
	
	private Integer codigo;
	
	private String name;

	public AlunoResponse(AlunoEntity alunoEntity) {
		this.codigo = alunoEntity.getCodigo();
		this.name = alunoEntity.getNome();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
