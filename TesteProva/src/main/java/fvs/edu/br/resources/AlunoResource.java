package fvs.edu.br.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.Services.AlunoService;
import fvs.edu.br.domain.Aluno;

@RestController
@RequestMapping("/Aluno")
public class AlunoResource {
	
	@Autowired
	private AlunoService service;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		Aluno obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}


}
