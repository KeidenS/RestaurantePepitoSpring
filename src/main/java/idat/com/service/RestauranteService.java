package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.DireccionRepository;
import idat.com.repository.RestauranteRepository;
import idat.com.repository.Usuario_DireccionRepository;
import idat.com.vo.Direccion;
import idat.com.vo.Restaurante;
import idat.com.vo.Usuario_Direccion;



@Service
public class RestauranteService implements RestauranteServiceImpl {
	
	@Autowired
	private RestauranteRepository repository;

	

	@Override
	public Restaurante listar_restaurante() {
		
		
		Restaurante lista = repository.listar_restaurante();
		
		
		
		return lista;
	}
	
	

}


