package br.gov.sp.fatec.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.gov.sp.fatec.model.Aluno;


public interface AlunoRepository extends CrudRepository<Aluno,Long>{
	
	public Aluno findByNomeAluno(String nomeAluno);
	
	/*@Query("select s from Aluno s where s.nome like ?1")
	public Aluno findByNomeAluno1(@Param(":nomeAluno") String nomeAluno);
	
	@Query("select count(*) from Aluno s where s.nome like ?1")
	public String findByQntnomeAluno(@Param(":nome") String nomeAluno);*/


}
