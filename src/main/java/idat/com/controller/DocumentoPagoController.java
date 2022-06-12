package idat.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.com.service.DocumentoPagoServiceImpl;
import idat.com.service.EnvioServiceImpl;
import idat.com.vo.DocumentoPago;
import idat.com.vo.Envio;

@Controller
@RequestMapping("/documento")
public class DocumentoPagoController {
	
	@Autowired
	private DocumentoPagoServiceImpl us;
	
	
	
	
	@GetMapping("/documento_listar/{id_pedido}")
	public ResponseEntity<?> listar_pedido(@PathVariable Integer id_pedido) {
		
		DocumentoPago p = us.listar_documeto(id_pedido);
		
		
		
		
		return new ResponseEntity<>(p,HttpStatus.OK);
	}

}
