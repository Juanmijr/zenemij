package com.juanmi.zenemij.modelo;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	public Usuario( String usuario, String apellidos, String nombre, String contrasena) {
		super();
	
		this.usuario =usuario ;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.contrasena = contrasena;
	}
	
public Usuario(int id, String usuario, String apellidos, String nombre, String contrasena) {
		super();
		this.id = id;
		this.usuario =usuario ;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.contrasena = contrasena;
	}


public Usuario() {
	super();
}


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;
@Column(name = "usuario")
private String usuario;
@Column(name = "apellidos")
private String apellidos;
@Column(name = "nombre")
private String nombre; 
@Column(name = "contrasena")
private String contrasena;


@ManyToMany
@JoinTable(name ="compras"
		,joinColumns=@JoinColumn(name="usuario_id", nullable= false)
,inverseJoinColumns=@JoinColumn(name="producto_id", nullable = false)
)

private List<Producto> productos ;


  

public void setId(int id) {
	this.id = id;
}


public String getUsuario() {
	return usuario;
}


public void setUsuario(String usuario) {
	this.usuario = usuario;
}


public String getApellidos() {
	return apellidos;
}


public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getContrasena() {
	return contrasena;
}


public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}


public int getId() {
	return id;
}


}
