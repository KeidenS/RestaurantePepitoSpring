package idat.com.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.culqi.Culqi;
import com.culqi.model.Token;

import idat.com.vo.Cargo;
import idat.com.vo.Resultado_Pago;
import okhttp3.Response;
import okhttp3.internal.http2.ErrorCode;



@Controller
@RequestMapping("/cargo")
public class PagoController {
	
	
	public Culqi init() {
        Culqi culqi = new Culqi();
        culqi.secret_key = "sk_test_314857bb4146aacb";
        culqi.public_key = "pk_test_5193484775b5bf46";
        return culqi;
    }
	
	
			
	
	
	
	
	@PostMapping("/registrar_cargo_prueba")
	public ResponseEntity<Resultado_Pago> registrar_cargo_prueba(@RequestBody Cargo c) throws Exception {
		
			Resultado_Pago pago_resul;
	
			System.out.println("========================");
			System.out.println(c.getNumero_tarjeta());
			System.out.println(c.getCvv());
			System.out.println(c.getEmail());
			System.out.println(c.getMes());
			System.out.println(c.getAnio());
			System.out.println(c.getMonto());
			System.out.println(c.getCodigo_moneda());
			System.out.println("========================");
			
			Map<String, Object> token = new HashMap<String, Object>();
			token.put("card_number", c.getNumero_tarjeta());
			token.put("cvv", c.getCvv());
			token.put("email", c.getEmail());
			token.put("expiration_month", c.getMes());
			token.put("expiration_year", c.getAnio());
			Map<String, Object> token_created = init().token.create(token);
			
			
			
			
			if(token_created.size() == 0 || token_created.get("id") == null) {
				pago_resul = new Resultado_Pago(true,"Ha ocurrido un error al intentar realizar su pago. Por favor vuelva a intentarlo");
				
				return new ResponseEntity<Resultado_Pago>(pago_resul, HttpStatus.OK); 
				
			}
			else {
				Map charge = new HashMap();
				charge.put("amount",c.getMonto());
				charge.put("currency_code",c.getCodigo_moneda());
				charge.put("email",c.getEmail());
				charge.put("source_id", token_created.get("id").toString());
				Map cargo = init().charge.create(charge);
				
				if(cargo.get("user_message") == null) {
					pago_resul = new Resultado_Pago(false,"Pago realizado exitosamente");
					return new ResponseEntity<Resultado_Pago>(pago_resul, HttpStatus.OK); 
					
					
				}
				else {
					
					pago_resul = new Resultado_Pago(true,cargo.get("user_message").toString());
					
					return new ResponseEntity<>(pago_resul, HttpStatus.OK); 
				
				}
				
				
			}
			
			
			

			
		
	}
	
	
	
	

}
