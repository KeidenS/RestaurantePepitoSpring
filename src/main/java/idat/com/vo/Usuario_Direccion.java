package idat.com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario_Direccion {
	
	@Id
	private String idusuario;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String numero_celular;
	
	@Column
	private Integer idtipo_usuario;
	
	@Column Integer iddireccion;
	
	@Column
	private Double longitud;
	
	@Column
	private Double latitud;
	
	@Column
	private String distrito;
	
	@Column
	private String direccion;
	
	@Column
	private String localidad;
	
	@Column
	private String alias;
	
	@Column
	private String lote;

	public String getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumero_celular() {
		return numero_celular;
	}

	public void setNumero_celular(String numero_celular) {
		this.numero_celular = numero_celular;
	}

	public Integer getIdtipo_usuario() {
		return idtipo_usuario;
	}

	public void setIdtipo_usuario(Integer idtipo_usuario) {
		this.idtipo_usuario = idtipo_usuario;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}
	
	

	public Integer getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(Integer iddireccion) {
		this.iddireccion = iddireccion;
	}

	public Usuario_Direccion(String idusuario, String nombre, String apellido, String numero_celular,
			Integer idtipo_usuario, Double longitud, Double latitud, String distrito, String direccion,
			String localidad, String alias, String lote) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero_celular = numero_celular;
		this.idtipo_usuario = idtipo_usuario;
		this.longitud = longitud;
		this.latitud = latitud;
		this.distrito = distrito;
		this.direccion = direccion;
		this.localidad = localidad;
		this.alias = alias;
		this.lote = lote;
	}

	public Usuario_Direccion() {
		super();
	}

	public Usuario_Direccion(String idusuario, String nombre, String apellido, String numero_celular) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero_celular = numero_celular;
	}
	
	

	

	public Usuario_Direccion(String idusuario, String nombre, String apellido, String numero_celular,
			Integer idtipo_usuario) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero_celular = numero_celular;
		this.idtipo_usuario = idtipo_usuario;
	}

	public Usuario_Direccion(String idusuario, Double longitud, Double latitud, String distrito, String direccion,
			String localidad, String alias, String lote) {
		super();
		this.idusuario = idusuario;
		this.longitud = longitud;
		this.latitud = latitud;
		this.distrito = distrito;
		this.direccion = direccion;
		this.localidad = localidad;
		this.alias = alias;
		this.lote = lote;
	}

	
	
	

	
	
	
	
	
	
	

}
