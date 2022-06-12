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
import idat.com.vo.Pedido_x_Plato;

@Repository
public interface Pedido_x_PlatoRepository extends CrudRepository<Pedido_x_Plato,Integer>{
	
	
	@Modifying
	@Transactional
	@Query
	(value = "{call insertar_pedido_x_plato(:subtotals,:cantidads,:id_platos,:id_pedidos)}", nativeQuery = true)
	void insertar_pedido_x_plato(
			@Param("subtotals")Double subtotals,
			@Param("cantidads")Integer cantidads,
			@Param("id_platos")Integer id_platos,
			@Param("id_pedidos")Integer id_pedidos);
	
	
	@Query
	(value = "{call listar_pedido_x_plato(:id_pedido)}", nativeQuery = true) 
	Collection<Pedido_x_Plato> listar_pedido_x_plato(
			@Param("id_pedido")Integer id_pedido);
	
	

}
