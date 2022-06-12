package idat.com.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import idat.com.vo.DocumentoPago;

@Repository
public interface DocumentoPagoRepository extends CrudRepository<DocumentoPago, Integer>{
		
	@Query
	(value = "{call datos_documento(:id_pedidos)}", nativeQuery = true) 
	DocumentoPago listar_documeto(
			@Param("id_pedidos")Integer id_pedido);
			
	
	
}
