package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.Usuario_DireccionRepository;
import idat.com.vo.Usuario_Direccion;



@Service
public class Usuario_DireccionService implements Usuario_DireccionServiceImpl {
	
	@Autowired
	private Usuario_DireccionRepository repository;

	@Override
	public void registrar(Usuario_Direccion u) {
		repository.registrar_usuario_direccion(u.getIdusuario(), u.getNombre(), u.getApellido(), u.getNumero_celular(), 1, u.getLongitud(), u.getLatitud(), u.getDistrito(), u.getDireccion(), u.getLocalidad(), u.getAlias(), u.getLote());
		
	}

	@Override
	public void actualizar_usuario(Usuario_Direccion u) {
		repository.actualizarr_usuario(u.getIdusuario(), u.getNombre(), u.getApellido(), u.getNumero_celular());
		
	}

	@Override
	public void insertar_direccion(Usuario_Direccion u) {
		repository.insertar_direccion(u.getLatitud(),u.getLongitud(), u.getDistrito(),u.getDireccion(),u.getLocalidad(), u.getAlias(), u.getLote(), u.getIdusuario());
		
	}



	
	
	

}


