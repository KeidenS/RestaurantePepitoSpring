package idat.com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Direccion {
	@Id 
	Integer iddireccion;
	
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

	public Integer getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(Integer iddireccion) {
		this.iddireccion = iddireccion;
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

	public Direccion(Integer iddireccion, Double longitud, Double latitud, String distrito, String direccion,
			String localidad, String alias, String lote) {
		super();
		this.iddireccion = iddireccion;
		this.longitud = longitud;
		this.latitud = latitud;
		this.distrito = distrito;
		this.direccion = direccion;
		this.localidad = localidad;
		this.alias = alias;
		this.lote = lote;
	}

	public Direccion() {
		super();
		
	}
	
	

}
