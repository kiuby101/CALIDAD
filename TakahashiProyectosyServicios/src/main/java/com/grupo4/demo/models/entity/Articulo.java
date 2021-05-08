package com.grupo4.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticulo;
	
	
	private String codigoArticulo;
	private String nombre;
	private String descripcion;
	private int cantidad;
	private String estado;
	
	

	public Long getIdArticulo() {
		return idArticulo;
	}



	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}



	public String getCodigoArticulo() {
		return codigoArticulo;
	}



	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
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



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	private static final long serialVersionUID = 1L;

}
