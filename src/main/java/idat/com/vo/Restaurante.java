package idat.com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Restaurante {
	
	@Id 
	private Integer idrestaurante;
	
	@Column
	private String nombre;
	
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
	private String celular;
	
	@Column
	private String correo;

	public Integer getIdrestaurante() {
		return idrestaurante;
	}

	public void setIdrestaurante(Integer idrestaurante) {
		this.idrestaurante = idrestaurante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Restaurante() {
		super();
	}
	
	
	
}
