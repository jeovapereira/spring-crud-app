package com.crud.aluno.aluno.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.aluno.aluno.service.AlunoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/aluno")
public class EndecoController {

	@Autowired
	private EndecoService alunoService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscarTodosAlunos() throws Exception {	
		return ResponseEntity.ok(alunoService.buscarTodosAlunos());
	}
	
	@GetMapping(value="/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscarAlunoPorCodigo(@PathVariable("codigo") final Integer codigoAluno) throws Exception {	
		return ResponseEntity.ok(alunoService.buscarAlunoPorCodigo(codigoAluno));
	}
}