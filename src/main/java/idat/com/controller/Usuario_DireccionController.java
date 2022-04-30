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

import idat.com.service.UsuarioServiceImpl;
import idat.com.service.Usuario_DireccionServiceImpl;
import idat.com.vo.Usuario;
import idat.com.vo.Usuario_Direccion;

@Controller
@RequestMapping("/usuario")
public class Usuario_DireccionController {
	
	@Autowired
	private Usuario_DireccionServiceImpl us;
	
	@Autowired
	private UsuarioServiceImpl u;
	
	@PostMapping("/registrar_usuario")
	public ResponseEntity<?> registrar(@RequestBody Usuario_Direccion u) {
		
		us.registrar(u);
		
		return new ResponseEntity<>(HttpStatus.OK); 
	}
	
	
	@PostMapping("/registrar_direccion")
	public ResponseEntity<?> registrar_direccion(@RequestBody Usuario_Direccion u) {
		
		us.insertar_direccion(u);
		
		return new ResponseEntity<>(HttpStatus.OK); 
	}
	
	@GetMapping("/buscar_usuario/{idusuario}")
	public ResponseEntity<?> buscar_usuario(@PathVariable String idusuario) {
		
		Usuario p = u.buscar_usuario(idusuario);
		
		
		
		
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	
	
	
	@PutMapping("/actualizar_usuario")
	public ResponseEntity<?> actualizar_usuario(@RequestBody Usuario_Direccion u) {
		
		us.actualizar_usuario(u);
		
		return new ResponseEntity<>(HttpStatus.OK); 
	}
	
}


