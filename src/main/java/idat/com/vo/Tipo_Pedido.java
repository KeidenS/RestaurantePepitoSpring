package idat.com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tipo_Pedido {
		
	
	@Id
	private Integer idtipo_pedido;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
	
	@Column
	private String plazo;

	public Integer getIdtipo_pedido() {
		return idtipo_pedido;
	}

	public void setIdtipo_pedido(Integer idtipo_pedido) {
		this.idtipo_pedido = idtipo_pedido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPlazo() {
		return plazo;
	}

	public void setPlazo(String plazo) {
		this.plazo = plazo;
	}

	public Tipo_Pedido(Integer idtipo_pedido, String nombre, String descripcion, String plazo) {
		super();
		this.idtipo_pedido = idtipo_pedido;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.plazo = plazo;
	}

	public Tipo_Pedido() {
		super();
		
	}
	
	
	
	
	
}
