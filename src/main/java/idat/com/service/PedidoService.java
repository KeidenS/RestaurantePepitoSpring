package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.PedidoRepository;
import idat.com.vo.Pedido;

@Service
public class PedidoService implements PedidoServiceImpl{
	
	@Autowired
	private PedidoRepository repository;
	
	@Override
	public Integer registrar(Pedido p) {
		Integer id = repository.registrar_pedido(p.getHora_inicio(),p.getHora_final(),p.getFecha(),p.getTotal(),p.getEstado(),p.getPrecio_entrega(),p.getIdtipo_pedido(),p.getIdrestaurante(),p.getIddireccion());
		return id;
	}

	@Override
	public Collection<Pedido> listar_pedido(String idusuario) {
		
		return repository.listar_pedido(idusuario);
	}

	@Override
	public void actualizar(Pedido p) {
		
		
		
		repository.actualizar_pedido(p.getIdpedido(),p.getHora_inicio(),p.getHora_final(),p.getFecha(),p.getTotal(),p.getEstado(),p.getPrecio_entrega(),p.getIdtipo_pedido(),p.getIdrestaurante(),p.getIddireccion());
		
	}

}