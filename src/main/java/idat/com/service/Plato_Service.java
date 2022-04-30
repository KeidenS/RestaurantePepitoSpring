package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.PlatoRepository;
import idat.com.repository.Usuario_DireccionRepository;
import idat.com.vo.Plato;

@Service
public class Plato_Service implements Plato_ServiceImpl{

	
	@Autowired
	private PlatoRepository repository;
	
	
	@Override
	public Collection<Plato> listar() {
	
		return repository.listar_plato();
	}
	
	

}
