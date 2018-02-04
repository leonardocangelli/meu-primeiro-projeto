package br.com.estudo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.estudo.api.documents.Pessoa;
import br.com.estudo.api.repositories.PessoaRepository;
import br.com.estudo.api.services.ExemploService;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication {
	
	@Value("${nome}")
	private String test;
	
	/*
	@Autowired
	private PessoaRepository repository;
	*/

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			
			/*
			repository.deleteAll();
			
			repository.save(new Pessoa(12345678L, "Leonardo Rocha", 20));
			repository.save(new Pessoa(87654321L, "Vitória Leao", 20));
			
			System.out.println("Lista todos com o findAll():");
			System.out.println("-----------------------------");
			repository.findAll().forEach(System.out::println);
			System.out.println();
			
			System.out.println("Busca com o findByNome('Leonardo'):");
			System.out.println("-----------------------------");
			System.out.println(repository.findByNome("Leonardo Rocha"));
			System.out.println();
			
			System.out.println("Pessoas com idade entre 20 e 21 anos");
			System.out.println("-----------------------------");
			repository.findByIdadeBetween(19, 21).forEach(System.out::println);
			*/
			
			
		};
	}
}
