package br.com.senac.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.dominio.Categoria;
import br.com.senac.dominio.Curso;
import br.com.senac.servico.CursoService;

@Controller
public class CursoController {
	
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/listarCursos")
	public ModelAndView listaCursos() {
		ModelAndView mv = new ModelAndView("curso/paginaCursos");
		mv.addObject("cursos", cursoService.listaCursos());
		return mv;
	}
	
	@GetMapping("/adicionarCurso")
	public ModelAndView add(Curso curso) {
		ModelAndView mv = new ModelAndView("curso/paginaAdicionarCurso");
		mv.addObject("curso", curso);
		return mv;
	}
	
	@PostMapping("/salvarCurso")
	public ModelAndView inserir(Curso curso) {
		cursoService.inserir(curso);
		return listaCursos();
	}

}
