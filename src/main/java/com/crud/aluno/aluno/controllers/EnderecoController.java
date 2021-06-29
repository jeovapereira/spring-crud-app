package com.crud.aluno.aluno.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.aluno.aluno.service.EnderecoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscarTodosEndereco() throws Exception {	
		return ResponseEntity.ok(enderecoService.buscarTodosEndereco());
	}
	
	@GetMapping(value="/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscarEnderecoPorCodigo(@PathVariable("codigo") final Integer codigoEndereco) throws Exception {	
		return ResponseEntity.ok(enderecoService.buscarEnderecoPorCodigo(codigoEndereco));
	}
}