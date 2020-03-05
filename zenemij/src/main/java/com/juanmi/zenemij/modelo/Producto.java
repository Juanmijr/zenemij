package com.juanmi.zenemij.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



	@Entity
	@Table(name = "producto")
	public class Producto {
		
		
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
	
	
}
