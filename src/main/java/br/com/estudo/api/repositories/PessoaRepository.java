package br.com.estudo.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.estudo.api.documents.Pessoa;

public interface PessoaRepository extends MongoRepository<Pessoa, String>{

	Pessoa findByNome(String nome);
	
	@Query("{ 'idade' : { $gt: ?0, $lte: ?1 } }")
	List<Pessoa> findByIdadeBetween(int idadeInicial, int idadeFinal);
	
}
