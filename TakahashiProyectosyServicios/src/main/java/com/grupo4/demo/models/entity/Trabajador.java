package com.grupo4.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

//mapeando a la base de datos
@Entity
@Table(name="trabajador")
public class Trabajador implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTrabajador;
	
	@NotEmpty
	private String codigoTrabajador;
	
	private String nombre;
	
	private String apellido;
	
	private String dni;
	
	private int edad;
	
	private String sexo;
	
	private String direccion;
	
	private String cargo;
	
	private String usuario;
	
	@Column(name="contraseña")
	private String contrasena;
	
	
	private static final long serialVersionUID = 1L;

	public Long getIdTrabajador() {
		return idTrabajador;
	}


	public void setIdTrabajador(Long idTrabajador) {
		this.idTrabajador = idTrabajador;
	}


	public String getCodigoTrabajador() {
		return codigoTrabajador;
	}


	public void setCodigoTrabajador(String codigoTrabajador) {
		this.codigoTrabajador = codigoTrabajador;
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


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	
	
	
	
	
}
