package idat.com.repository;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import idat.com.vo.Usuario_Direccion;

@Repository
public interface Usuario_DireccionRepository extends CrudRepository<Usuario_Direccion,String>{

	
	@Modifying
	@Transactional
	@Query
	(value = "{call insertar_usuario_direccion(:idusuario_s,:nombre_s,:apellido_s,:numero_celular_s,:idtipo_usuario_s,:longitud_s,:latitud_s,:distrito_s,:direccion_s,:localidad_s,:alias_s,:lote_s)}", nativeQuery = true)
	void registrar_usuario_direccion(
			@Param("idusuario_s")String idusuario_s,
			@Param("nombre_s")String nombre_s,
			@Param("apellido_s")String apellido_s,
			@Param("numero_celular_s")String numero_celular_s,
			@Param("idtipo_usuario_s")Integer idtipo_usuario_s,
			@Param("longitud_s")Double longitud_s,
			@Param("latitud_s")Double latitud_s,
			@Param("distrito_s")String distrito_s,
			@Param("direccion_s")String direccion_s,
			@Param("localidad_s")String localidad_s,
			@Param("alias_s")String alias_s,
			@Param("lote_s")String lote_s);
	
	
	
	@Modifying
	@Transactional
	@Query
	(value = "{call actualizar_usuario(:idusuarios,:nombres,:apellidos,:numero_celulars)}", nativeQuery = true)
	void actualizarr_usuario(
			@Param("idusuarios")String idusuario_s,
			@Param("nombres")String nombre_s,
			@Param("apellidos")String apellido_s,
			@Param("numero_celulars")String numero_celular_s);
	
	

	
	@Modifying
	@Transactional
	@Query
	(value = "{call insertar_direcion_usuario(:longitud,:latitud,:distrito,:direccion,:localidad,:alias,:lote,:idusuario)}", nativeQuery = true)
	void insertar_direccion(
			@Param("longitud")Double longitud,
			@Param("latitud")Double latitud,
			@Param("distrito")String distrito,
			@Param("direccion")String direccion,
			@Param("localidad")String localidad,
			@Param("alias")String alias,
			@Param("lote")String lote,
			@Param("idusuario")String idusuario);
			
	
	
}
