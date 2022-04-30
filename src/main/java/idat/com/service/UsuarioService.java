package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.UsuarioRepository;
import idat.com.repository.Usuario_DireccionRepository;
import idat.com.vo.Usuario;
import idat.com.vo.Usuario_Direccion;



@Service
public class UsuarioService implements UsuarioServiceImpl {
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public Usuario buscar_usuario(String idusuario) {
		
		return repository.buscar_usuario(idusuario);
	}

	



	
	
	

}


