package fvs.edu.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
	
}
