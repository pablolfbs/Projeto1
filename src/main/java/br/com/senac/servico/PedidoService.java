package br.com.senac.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.dominio.Pedido;
import br.com.senac.repositorio.PedidoRepositorio;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepositorio repoPed;
	
	public List<Pedido> listaPedidos() {
		return repoPed.findAll();
	}
	
}
