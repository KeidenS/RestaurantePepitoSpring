package idat.com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.com.service.CancelacionServiceImpl;
import idat.com.service.PedidoServiceImpl;
import idat.com.service.Pedido_x_PlatoServiceImpl;
import idat.com.vo.Cancelacion;
import idat.com.vo.Pedido;
import idat.com.vo.Pedido_x_Plato;
@Controller
@RequestMapping("/cancelar")
public class CancelarController {
	
	@Autowired
	private CancelacionServiceImpl ps;
	
	
	@PostMapping("/registrar_cancelacion")
	public ResponseEntity<?> registrar(@RequestBody Cancelacion cancelacion) {
		ps.insertar_cancelacion(cancelacion);
		
		return new ResponseEntity<>(cancelacion, HttpStatus.OK); 
	}

}




	
	