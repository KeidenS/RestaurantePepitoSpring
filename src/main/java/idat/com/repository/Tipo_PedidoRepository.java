package idat.com.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import idat.com.vo.Direccion;
import idat.com.vo.Tipo_Pedido;
@Repository
public interface Tipo_PedidoRepository extends CrudRepository<Tipo_Pedido,Integer>{
	
	
	@Query
	(value = "{call buscar_titpo_pedido(:idtipo_pedidos)}", nativeQuery = true)
	Tipo_Pedido buscar_tipo_pedido(
			@Param("idtipo_pedidos")Integer idtipo_pedidos);
	
}



