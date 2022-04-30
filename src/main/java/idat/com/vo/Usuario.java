package idat.com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	
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

	public Usuario(String idusuario, String nombre, String apellido, String numero_celular, Integer idtipo_usuario) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero_celular = numero_celular;
		this.idtipo_usuario = idtipo_usuario;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	

}
