package idat.com.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import idat.com.vo.Plato;

@Repository
public interface PlatoRepository extends CrudRepository<Plato,Integer>{
	
	
	@Query
	(value = "{call listar_platos()}", nativeQuery = true)
	Collection<Plato> listar_plato();
	
}
