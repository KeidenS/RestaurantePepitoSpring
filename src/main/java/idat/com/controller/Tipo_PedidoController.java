package idat.com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.com.service.DireccionServiceImpl;
import idat.com.service.Tipo_PedidoServiceImpl;
import idat.com.service.Usuario_DireccionServiceImpl;
import idat.com.vo.Direccion;
import idat.com.vo.Plato;
import idat.com.vo.Tipo_Pedido;
import idat.com.vo.Usuario_Direccion;

@Controller
@RequestMapping("/tipo_pedido")
public class Tipo_PedidoController {
	
	@Autowired
	private Tipo_PedidoServiceImpl us;
	
	
	
	
	@GetMapping("/buscar_tipo_pedido/{idtipo}")
	public ResponseEntity<?> buscar_tipo_pedido(@PathVariable Integer idtipo) {
		
		Tipo_Pedido p= us.buscar_tipo_pedido(idtipo);
		
		
		
		
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	
	
	
}


