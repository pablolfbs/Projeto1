package br.com.senac.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.dominio.Aluno;
import br.com.senac.dominio.Categoria;
import br.com.senac.servico.AlunoService;

@Controller
public class MenuController {
	
	@Autowired
	private AlunoService alunoService;
	
//	@PostMapping("/login")
//	public ModelAndView validar(Aluno aluno) {
//		ModelAndView mv = new ModelAndView("menu/paginaLogin");
//		mv.addObject("aluno", aluno);
//		return mv;
//	}
	
	@GetMapping("/menu")
	public ModelAndView menu() {
		ModelAndView mv = new ModelAndView("menu/paginaMenu");
		mv.addObject("alunos", alunoService.listaAlunos());
		return mv;
	}
	
//	@GetMapping("/listarAlunos")
//	public ModelAndView listaAlunos() {
//		ModelAndView mv = new ModelAndView("aluno/paginaAlunos");
//		mv.addObject("alunos", alunoService.listaAlunos());
//		return mv;
//	}
//	
//	@GetMapping("/adicionarAluno")
//	public ModelAndView add(Aluno aluno) {
//		ModelAndView mv = new ModelAndView("aluno/paginaAdicionarAluno");
//		mv.addObject("aluno", aluno);
//		return mv;
//	}
	
}
