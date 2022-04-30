package idat.com.service;

import java.util.Collection;

import idat.com.vo.Direccion;
import idat.com.vo.Usuario_Direccion;

public interface DireccionServiceImpl {
	
	public abstract Collection<Direccion> listar_direccion(String idusuario);

}
