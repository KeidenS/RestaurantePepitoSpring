package idat.com.service;

import java.util.Collection;

import idat.com.vo.Pedido;
import idat.com.vo.Pedido_x_Plato;

public interface Pedido_x_PlatoServiceImpl {
	public abstract void registrar(Pedido_x_Plato p);
	public abstract Collection<Pedido_x_Plato> listar_pedido_x_plato(Integer idpedido_x_plato);
}
