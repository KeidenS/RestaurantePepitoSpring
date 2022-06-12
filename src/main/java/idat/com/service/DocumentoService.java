package idat.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.repository.DocumentoPagoRepository;
import idat.com.vo.DocumentoPago;

@Service
public class DocumentoService implements DocumentoPagoServiceImpl {
	
	@Autowired
	private DocumentoPagoRepository repository;
	
	@Override
	public DocumentoPago listar_documeto(Integer id_pedido) {
		return repository.listar_documeto(id_pedido);
	}
	
	
	
	

}
