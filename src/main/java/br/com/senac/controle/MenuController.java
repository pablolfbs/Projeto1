package br.com.senac.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.servico.AlunoService;

@Controller
public class MenuController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping("/menu")
	public ModelAndView menu() {
		ModelAndView mv = new ModelAndView("menu/paginaMenu");
		mv.addObject("alunos", alunoService.listaAlunos());
		return mv;
	}
	
	@GetMapping("/erro")
	public String erro() {
		return "erro/paginaErro.html";
	}
}
