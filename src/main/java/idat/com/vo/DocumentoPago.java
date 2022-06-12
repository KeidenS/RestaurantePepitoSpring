package idat.com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DocumentoPago {
	
	@Id
	private Integer idpedido;
	@Column
	private String distrito_restaurante;
	@Column
	private String restaurante_localidad;
	@Column
	private String restaurante_direccion;
	@Column 
	private String correo;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String distrito;
	@Column 
	private String localidad;
	@Column 
	private String direccion;
	@Column
	private String numero_celular;
	@Column
	private String hora_inicio;
	@Column
	private String hora_final;
	@Column
	private String fecha;
	@Column
	private Double total;
	@Column 
	private Double precio_entrega;
	@Column
	private String fecha_pedido;
	@Column
	private String tipo;
	
	public Integer getIdpedido() {
		return idpedido;
	}
	public void setIdpedido(Integer idpedido) {
		this.idpedido = idpedido;
	}
	public String getDistrito_restaurante() {
		return distrito_restaurante;
	}
	public void setDistrito_restaurante(String distrito_restaurante) {
		this.distrito_restaurante = distrito_restaurante;
	}
	public String getRestaurante_localidad() {
		return restaurante_localidad;
	}
	public void setRestaurante_localidad(String restaurante_localidad) {
		this.restaurante_localidad = restaurante_localidad;
	}
	public String getRestaurante_direccion() {
		return restaurante_direccion;
	}
	public void setRestaurante_direccion(String restaurante_direccion) {
		this.restaurante_direccion = restaurante_direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
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
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumero_celular() {
		return numero_celular;
	}
	public void setNumero_celular(String numero_celular) {
		this.numero_celular = numero_celular;
	}
	public String getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public String getHora_final() {
		return hora_final;
	}
	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getPrecio_entrega() {
		return precio_entrega;
	}
	public void setPrecio_entrega(Double precio_entrega) {
		this.precio_entrega = precio_entrega;
	}
	public String getFecha_pedido() {
		return fecha_pedido;
	}
	public void setFecha_pedido(String fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public DocumentoPago(Integer idpedido, String distrito_restaurante, String restaurante_localidad,
			String restaurante_direccion, String correo, String nombre, String apellido, String distrito,
			String localidad, String direccion, String numero_celular, String hora_inicio, String hora_final,
			String fecha, Double total, Double precio_entrega, String fecha_pedido, String tipo) {
		super();
		this.idpedido = idpedido;
		this.distrito_restaurante = distrito_restaurante;
		this.restaurante_localidad = restaurante_localidad;
		this.restaurante_direccion = restaurante_direccion;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.distrito = distrito;
		this.localidad = localidad;
		this.direccion = direccion;
		this.numero_celular = numero_celular;
		this.hora_inicio = hora_inicio;
		this.hora_final = hora_final;
		this.fecha = fecha;
		this.total = total;
		this.precio_entrega = precio_entrega;
		this.fecha_pedido = fecha_pedido;
		this.tipo = tipo;
	}
	public DocumentoPago() {
		super();
		
	}
	
	
	
	

}
