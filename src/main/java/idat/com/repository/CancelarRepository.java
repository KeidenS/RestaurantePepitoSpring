package idat.com.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import idat.com.vo.Cancelacion;

@Repository
public interface CancelarRepository extends CrudRepository<Cancelacion, Integer>{
	
	@Modifying
	@Transactional
	@Query
	(value = "{call insertar_cancelacion(:estados,:motivos,:idpedidos)}", nativeQuery = true)
	void insertar_cancelacion(
			@Param("estados")String estados,
			@Param("motivos")String motivos,
			@Param("idpedidos")Integer idpedidos);

}
