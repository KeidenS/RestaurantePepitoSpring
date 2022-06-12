package idat.com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pedido_x_Plato {
	
	@Id
	private Integer idplato;
	@Column
	private Integer cantidad;
	@Column
	private Integer idpedido;
	@Column
	private Double subtotal; 
	
	@Column
	private String nombre;
	@Column
	private Double precio;
	
	
	
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
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getIdpedido() {
		return idpedido;
	}
	public void setIdpedido(Integer idpedido) {
		this.idpedido = idpedido;
	}
	public Integer getIdplato() {
		return idplato;
	}
	public void setIdplato(Integer idplato) {
		this.idplato = idplato;
	}
	public Pedido_x_Plato(Double subtotal, Integer cantidad, Integer idpedido, Integer idplato) {
		super();
		this.subtotal = subtotal;
		this.cantidad = cantidad;
		this.idpedido = idpedido;
		this.idplato = idplato;
	}
	public Pedido_x_Plato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pedido_x_Plato(Integer idplato, Integer cantidad, Integer idpedido, Double subtotal, String nombre,
			Double precio) {
		super();
		this.idplato = idplato;
		this.cantidad = cantidad;
		this.idpedido = idpedido;
		this.subtotal = subtotal;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	
	
}
