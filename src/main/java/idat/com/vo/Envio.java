package idat.com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Envio {
	
	@Id
	private Integer identrega;
	@Column
	private String estado;
	@Column
	private String nombre;
	@Column
	private String apellido;
	public Integer getIdentrega() {
		return identrega;
	}
	public void setIdentrega(Integer identrega) {
		this.identrega = identrega;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public Envio(Integer identrega, String estado, String nombre, String apellido) {
		super();
		this.identrega = identrega;
		this.estado = estado;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Envio() {
		super();
	} 
	
	
	
	
	
}
