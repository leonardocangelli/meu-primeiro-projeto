package br.com.estudo.api.dtos;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class PessoaDto {

	private Long rg;
	private String nome;
	private int idade;
	
	public PessoaDto() {}
	
	public Long getRg() {
		return rg;
	}
	
	public void setRg(Long rg) {
		this.rg = rg;
	}
	
	@NotEmpty(message = "O Nome deve ser preenchido.")
	@Length(min = 3, max = 30, message = "O Nome deve ter entre 2 e 100 dígitos.")
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "PessoaDto [rg=" + rg + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
}
