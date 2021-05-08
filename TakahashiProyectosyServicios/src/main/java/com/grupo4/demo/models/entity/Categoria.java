package com.grupo4.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	private String codigo;
	private String nombre;
	private String tipoArticulo;
	

	public Long getIdCategoria() {
		return idCategoria;
	}







	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}







	public String getCodigo() {
		return codigo;
	}







	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}







	public String getNombre() {
		return nombre;
	}







	public void setNombre(String nombre) {
		this.nombre = nombre;
	}







	public String getTipoArticulo() {
		return tipoArticulo;
	}







	public void setTipoArticulo(String tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}







	private static final long serialVersionUID = 1L;
	
	
}
