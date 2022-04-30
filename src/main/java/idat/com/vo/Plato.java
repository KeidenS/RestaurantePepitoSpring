package idat.com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plato {

	@Id
	private Integer idplato;
	
	@Column
	private String nombre;
	
	@Column
	private Double precio;
	
	@Column
	private String descripcion;
	
	@Column
	private String imagen;
	
	@Column
	private String tipo_plato;

	public Integer getIdplato() {
		return idplato;
	}

	public void setIdplato(Integer idplato) {
		this.idplato = idplato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTipo_plato() {
		return tipo_plato;
	}

	public void setTipo_plato(String tipo_plato) {
		this.tipo_plato = tipo_plato;
	}

	public Plato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plato(Integer idplato, String nombre, Double precio, String descripcion, String imagen, String tipo_plato) {
		super();
		this.idplato = idplato;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.tipo_plato = tipo_plato;
	}
	
	
	
	
}
