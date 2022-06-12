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

import idat.com.service.PedidoServiceImpl;
import idat.com.service.Pedido_x_PlatoServiceImpl;
import idat.com.vo.Pedido;
import idat.com.vo.Pedido_x_Plato;
import idat.com.vo.Plato;
import idat.com.vo.Usuario;
import idat.com.vo.Usuario_Direccion;

@Controller
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoServiceImpl ps;
	@Autowired
	private Pedido_x_PlatoServiceImpl pi;
	
	
	@GetMapping("/listar_pedido/{idusuario}") 
	public ResponseEntity<?> listar_pedido(@PathVariable String idusuario) {
		Collection<Pedido> i = ps.listar_pedido(idusuario);
		return new ResponseEntity<>(i, HttpStatus.OK); 
	}
	
	@GetMapping("/listar_pedido_x_plato/{idplato}") 
	public ResponseEntity<?> listar_pedido_x_plato(@PathVariable Integer idplato) {
		Collection<Pedido_x_Plato> i = pi.listar_pedido_x_plato(idplato);
		return new ResponseEntity<>(i, HttpStatus.OK); 
	}
	
	
	@PostMapping("/registrar_pedido")
	public ResponseEntity<?> registrar(@RequestBody Pedido p) {
		Integer id = ps.registrar(p);
		System.out.println(id+"");
		return new ResponseEntity<>(id, HttpStatus.OK); 
	}
	
	@PutMapping("/actualizar_pedido")
	public ResponseEntity<?> pedido_actualizar(@RequestBody Pedido p) {
		System.out.println("getIdpedido:"+p.getIdpedido());
		System.out.println("getEstado:"+p.getEstado());
		System.out.println("getFecha:"+p.getFecha());
		System.out.println("getHora_final"+p.getHora_final());
		System.out.println("getIdrestaurante:"+p.getIdrestaurante());
		System.out.println("getIddireccion:"+p.getIddireccion());
		
		ps.actualizar(p);
		
		return new ResponseEntity<>(HttpStatus.OK); 
	}
	
	
	@PostMapping("/registrar_pedido_x_plato")
	public void registrar(@RequestBody Pedido_x_Plato p) {
		System.out.println("IDPEDIDO:"+p.getIdpedido());
		System.out.println("CANTIDAD:"+p.getCantidad());
		System.out.println("SUBTOTAL:"+p.getSubtotal());
		System.out.println("PLATO:"+p.getIdplato());
		pi.registrar(p);
	}
	
	
	
	
}