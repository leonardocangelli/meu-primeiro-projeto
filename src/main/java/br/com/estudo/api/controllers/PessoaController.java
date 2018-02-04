package br.com.estudo.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.api.documents.Pessoa;
import br.com.estudo.api.dtos.PessoaDto;
import br.com.estudo.api.repositories.PessoaRepository;
import br.com.estudo.api.responses.Response;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;
	
	@GetMapping
	public List<Pessoa> buscarTodos() {
		return repository.findAll();
	}
	
	@GetMapping(value = "/{nome}")
	public Pessoa buscarPorNome(@PathVariable("nome") String nome) {
		return repository.findByNome(nome);
	}
	
	/*
	@GetMapping(value = "/{nome}", headers = "X-API-Version=v1")
	public String exemplov1(@PathVariable("nome") String nome) {
		return "Olá v1 " + nome; 
	} 
	*/
	
	@PostMapping(value = "/cadastro")
	public ResponseEntity <Response<PessoaDto>> cadastrar(@Valid @RequestBody PessoaDto pessoaDto, BindingResult result) {
		Response<PessoaDto> response = new Response<PessoaDto>();
		
		if (result.hasErrors()) {
			result.getAllErrors().forEach( error -> response.getErrors().add(error.getDefaultMessage()) );
			return ResponseEntity.badRequest().body(response);
		}
		
		response.setData(pessoaDto);
		
		Pessoa pessoa = new Pessoa(pessoaDto.getRg(), pessoaDto.getNome(), pessoaDto.getIdade());
		repository.save(pessoa);
		
		return ResponseEntity.ok(response);
	}
	
}
