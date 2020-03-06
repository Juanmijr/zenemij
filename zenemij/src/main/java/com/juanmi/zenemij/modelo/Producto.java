package com.juanmi.zenemij.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


	@Entity
	@Table(name = "producto")
	public class Producto {
		
		
	public Producto( String modelo, String descripcion, int precio, int numExistencias, String imagen) {
			super();
			
			this.modelo = modelo;
			this.descripcion = descripcion;
			this.precio = precio;
			this.numExistencias = numExistencias;
			this.imagen = imagen;
		}
		
		
	public Producto(int id, String modelo, String descripcion, int precio, int numExistencias, String imagen) {
			super();
			this.id = id;
			this.modelo = modelo;
			this.descripcion = descripcion;
			this.precio = precio;
			this.numExistencias = numExistencias;
			this.imagen = imagen;
		}
	
	
	public Producto() {
		super();
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "modelo")
	private String modelo;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "precio")
	private int precio; 
	@Column(name = "numExistencias")
	private int numExistencias;
	@Column(name = "imagen")
	private String imagen;
	
	
	@ManyToMany(mappedBy = "productos")
    private List<Usuario> usuarios;
	
	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getNumExistencias() {
		return numExistencias;
	}
	public void setNumExistencias(int numExistencias) {
		this.numExistencias = numExistencias;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	public int getId() {
		return id;
	}

	
	public void addUsuario(Usuario usuario){
        if(this.usuarios == null){
            this.usuarios = new ArrayList<>();
        }
        
        this.usuarios.add(usuario);
    }

	
	
	
}
