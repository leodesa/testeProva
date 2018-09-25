package fvs.edu.br.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.domain.Aluno;
import fvs.edu.br.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repo;
	
	public Aluno buscar(Integer id) {
		Optional<Aluno> objeto = repo.findById(id);
		
		return objeto.orElse(null);
	}

}
