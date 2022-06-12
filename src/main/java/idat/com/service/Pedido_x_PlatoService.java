package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.Pedido_x_PlatoRepository;
import idat.com.vo.Pedido_x_Plato;

@Service
public class Pedido_x_PlatoService implements Pedido_x_PlatoServiceImpl{
	
	@Autowired
	private Pedido_x_PlatoRepository repository;
	
	@Override
	public void registrar(Pedido_x_Plato p) {
		System.out.println(p.getIdpedido());
		repository.insertar_pedido_x_plato(p.getSubtotal(),p.getCantidad(),p.getIdpedido(),p.getIdplato());
			
	}

	@Override
	public Collection<Pedido_x_Plato> listar_pedido_x_plato(Integer idpedido_x_plato) {
	
		return repository.listar_pedido_x_plato(idpedido_x_plato);
	}
}
