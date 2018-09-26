package br.com.senac.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.dominio.Curso;
import br.com.senac.repositorio.CursoRepositorio;

@Service
public class CursoService {
	
	@Autowired
	CursoRepositorio repoCurso;

	public List<Curso> listaCursos() {
		return repoCurso.findAll();
	}
	
	public Curso inserir(Curso objCurso) {
		objCurso.setId(null);
		return repoCurso.save(objCurso);
	}

}
