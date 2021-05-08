package com.grupo4.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "proveedores")
public class Proveedores implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProveedores;
	private String codigoProveedor;
	private String razonSocial;
	private String direccion;
	private String RUC;
	
	
	
	public Long getIdProveedores() {
		return idProveedores;
	}








	public void setIdProveedores(Long idProveedores) {
		this.idProveedores = idProveedores;
	}








	public String getCodigoProveedor() {
		return codigoProveedor;
	}








	public void setCodigoProveedor(String codigoProveedor) {
		this.codigoProveedor = codigoProveedor;
	}








	public String getRazonSocial() {
		return razonSocial;
	}








	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}








	public String getDireccion() {
		return direccion;
	}








	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}








	public String getRUC() {
		return RUC;
	}








	public void setRUC(String rUC) {
		RUC = rUC;
	}








	private static final long serialVersionUID = 1L;

}
