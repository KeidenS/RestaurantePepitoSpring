package idat.com.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import idat.com.vo.Envio;
import idat.com.vo.Pedido_x_Plato;

@Repository
public interface EnvioRepository extends CrudRepository<Envio, Integer>{
	
	@Query
	(value = "{call listar_envios(:id_pedidos)}", nativeQuery = true) 
	Envio listar_envios(
			@Param("id_pedidos")Integer id_pedidos);

}
