package idat.com.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.CancelarRepository;
import idat.com.repository.DireccionRepository;
import idat.com.vo.Cancelacion;
import idat.com.vo.Direccion;
@Service
public class CancelacionService implements CancelacionServiceImpl {
	
	@Autowired
	private CancelarRepository repository;
	
	@Override
	public void insertar_cancelacion(Cancelacion cancelacion) {
	
		repository.insertar_cancelacion(cancelacion.getEstado(), cancelacion.getMotivo(), cancelacion.getIdpedido());
	}

}




