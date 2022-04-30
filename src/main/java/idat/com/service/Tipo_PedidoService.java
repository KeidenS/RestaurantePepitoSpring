package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.DireccionRepository;
import idat.com.repository.Tipo_PedidoRepository;
import idat.com.repository.Usuario_DireccionRepository;
import idat.com.vo.Direccion;
import idat.com.vo.Tipo_Pedido;
import idat.com.vo.Usuario_Direccion;



@Service
public class Tipo_PedidoService implements Tipo_PedidoServiceImpl {
	
	@Autowired
	private Tipo_PedidoRepository repository;

	@Override
	public Tipo_Pedido buscar_tipo_pedido(Integer idtipo) {
		
		return repository.buscar_tipo_pedido(idtipo);
	}

	

	
	

}


