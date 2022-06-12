package idat.com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.com.service.DireccionServiceImpl;
import idat.com.service.EnvioServiceImpl;
import idat.com.vo.Direccion;
import idat.com.vo.Envio;

@Controller
@RequestMapping("/envio")
public class EnvioController {
	
	@Autowired
	private EnvioServiceImpl us;
	
	
	
	
	@GetMapping("/listar_envio/{id_pedido}")
	public ResponseEntity<?> listar_envio(@PathVariable Integer id_pedido) {
		
		Envio p = us.listar_envio(id_pedido);
		
		
		
		
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	
	
	
}
