package idat.com.service;

import java.util.Collection;

import idat.com.vo.Pedido;
import idat.com.vo.Plato;

public interface PedidoServiceImpl {
	public abstract Integer registrar(Pedido p);
	public abstract Collection<Pedido> listar_pedido(String idusuario);
	public abstract void actualizar(Pedido p);
}
