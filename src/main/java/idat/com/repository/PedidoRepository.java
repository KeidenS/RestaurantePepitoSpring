package idat.com.repository;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import idat.com.vo.Direccion;
import idat.com.vo.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido,Integer>{

	
	
	
	
	@Query
	(value = "{call insertar_pedido(:hora_inicios,:hora_finals, :fechas, :totals ,:estados, :precio_entregas ,:idtipo_pedidos ,:idrestaurantes ,:iddireccions)}", nativeQuery = true) 
	Integer registrar_pedido(
			@Param("hora_inicios")String hora_inicio,
			@Param("hora_finals")String hora_final,
			@Param("fechas")String fecha,
			@Param("totals")Double total,
			@Param("estados")String estado,
			@Param("precio_entregas")Double precio_entrega,
			@Param("idtipo_pedidos")Integer idtipo_pedido,
			@Param("idrestaurantes")Integer idrestaurante,
			@Param("iddireccions")Integer iddireccion);
	
	
	@Query
	(value = "{call listar_pedido(:id_usuarios)}", nativeQuery = true) 
	Collection<Pedido> listar_pedido(
			@Param("id_usuarios")String id_usuarios);
	
	@Transactional
	@Modifying
	@Query
	(value = "{call actualizar_pedido(:idpedidos,:hora_inicios,:hora_finals, :fechas, :totals ,:estados, :precio_entregas ,:idtipo_pedidos ,:idrestaurantes ,:iddireccions)}", nativeQuery = true) 
	void actualizar_pedido(
			@Param("idpedidos")Integer idpedidos,
			@Param("hora_inicios")String hora_inicio,
			@Param("hora_finals")String hora_final,
			@Param("fechas")String fecha,
			@Param("totals")Double total,
			@Param("estados")String estado,
			@Param("precio_entregas")Double precio_entrega,
			@Param("idtipo_pedidos")Integer idtipo_pedido,
			@Param("idrestaurantes")Integer idrestaurante,
			@Param("iddireccions")Integer iddireccion);
	
	
}
