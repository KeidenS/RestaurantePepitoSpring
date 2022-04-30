package idat.com.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.com.service.Plato_ServiceImpl;
import idat.com.service.Usuario_DireccionServiceImpl;

import idat.com.vo.Plato;
import idat.com.vo.Usuario_Direccion;

@Controller
@RequestMapping("/plato")
public class PlatoController {
	
	@Autowired
	private Plato_ServiceImpl ps;
	
	@GetMapping("/listar_plato")
	public ResponseEntity<?> plato_listar() {
		
		Collection<Plato> p = ps.listar();
		
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	
	
	
}


