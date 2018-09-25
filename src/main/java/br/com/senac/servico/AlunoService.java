package br.com.senac.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.dominio.Aluno;
import br.com.senac.repositorio.AlunoRepositorio;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepositorio repoAl;
	
//	public Aluno validar(String nome) {
//		Optional<Aluno> objAluno = repoAl.findByNome(nome);
//		return objAluno.orElseThrow(() -> new ObjectNotFoundException(
//				"Categoria não encontrada! Id: " + nome + ", Tipo: " + Aluno.class.getName()));
//	}
	
	public Aluno inserir(Aluno objAluno) {
		// estou colocando um objeto novo entao o id precisa ser null
		objAluno.setId(null);
		return repoAl.save(objAluno);
	}

	public List<Aluno> listaAlunos() {
		return repoAl.findAll();
	}

}
