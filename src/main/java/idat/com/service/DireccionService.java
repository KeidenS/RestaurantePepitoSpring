package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.DireccionRepository;
import idat.com.repository.Usuario_DireccionRepository;
import idat.com.vo.Direccion;
import idat.com.vo.Usuario_Direccion;



@Service
public class DireccionService implements DireccionServiceImpl {
	
	@Autowired
	private DireccionRepository repository;

	

	@Override
	public Collection<Direccion> listar_direccion(String idusuario) {
		
		
		Collection<Direccion> lista = repository.listar_direcciones(idusuario);
		
		
		
		return lista;
	}
	
	

}


