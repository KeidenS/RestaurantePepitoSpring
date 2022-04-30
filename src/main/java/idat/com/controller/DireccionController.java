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
import idat.com.service.Usuario_DireccionServiceImpl;
import idat.com.vo.Direccion;
import idat.com.vo.Plato;
import idat.com.vo.Usuario_Direccion;

@Controller
@RequestMapping("/direcccion")
public class DireccionController {
	
	@Autowired
	private DireccionServiceImpl us;
	
	
	
	
	@GetMapping("/listar_direcciones/{idusuario}")
	public ResponseEntity<?> listar_direccion(@PathVariable String idusuario) {
		
		Collection<Direccion> p = us.listar_direccion(idusuario);
		
		
		
		
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	
	
	
}


