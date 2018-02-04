package br.com.estudo.api.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pessoas")
public class Pessoa {
	
	@Id
	private String id;
	private Long rg;
	private String nome;
	private int idade;
	
	public Pessoa() {}
	
	public Pessoa(Long rg, String nome, int idade) {
		super();
		this.rg = rg;
		this.nome = nome;
		this.idade = idade;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Long getRg() {
		return rg;
	}
	
	public void setRg(Long rg) {
		this.rg = rg;
	}
	
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
		return "Pessoa [id=" + id + ", rg=" + rg + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
}
