package idat.com.repository;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import idat.com.vo.Direccion;
import idat.com.vo.Restaurante;
import idat.com.vo.Usuario_Direccion;

@Repository
public interface RestauranteRepository extends CrudRepository<Restaurante,Integer>{

	
	
	
	
	@Query
	(value = "{call listar_restaurante()}", nativeQuery = true)
	Collection<Restaurante> listar_restaurante();

			
	
	
}
