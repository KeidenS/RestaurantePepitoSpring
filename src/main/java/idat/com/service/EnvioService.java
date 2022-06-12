package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.DireccionRepository;
import idat.com.repository.EnvioRepository;
import idat.com.vo.Direccion;
import idat.com.vo.Envio;

@Service
public class EnvioService implements EnvioServiceImpl {
	
	@Autowired
	private EnvioRepository repository;

	@Override
	public Envio listar_envio(Integer id_pedido) {
		
		return repository.listar_envios(id_pedido);
	}

	

	

}
