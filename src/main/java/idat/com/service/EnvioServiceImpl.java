package idat.com.service;

import java.util.Collection;

import idat.com.vo.Direccion;
import idat.com.vo.Envio;

public interface EnvioServiceImpl {
	
	public abstract Envio listar_envio(Integer id_pedido);

}
