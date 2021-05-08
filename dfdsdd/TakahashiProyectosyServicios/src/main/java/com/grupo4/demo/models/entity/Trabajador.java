package com.grupo4.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//mapeando a la base de datos
@Entity
@Table(name="trabajador")
public class Trabajador implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTrabajador;
	
	@NotEmpty
	@Size(min = 1,max = 6,message = "el código debe estar entre 1 y 6 caracteres")
	private String codigoTrabajador;
	
	@NotEmpty
	@Size(min = 1,max = 25,message = "el nombre debe contener no mas de 25 caracteres")	
	private String nombre;
	
	@NotEmpty
	@Size(min = 1,max = 25,message = "el apellido debe contener no mas de 25 caracteres")
	private String apellido;
	
	@NotEmpty
	@Size(min = 1, max = 8,message = "el dni debe tener 8 dígitos")
	private String dni;
	
	@NotNull
	@Min(value = 18,message = "la edad mínima debe ser 18 años")
	@Max(value = 65,message = "la edad máxima deve ser 65 años")
	private int edad;
	
	@NotEmpty
	private String sexo;
	
	@NotEmpty
	@Size(min = 1,max =45, message = "no se pemiten mas de 45 caracteres")
	private String direccion;
	
	@NotEmpty
	private String cargo;
	
	@NotEmpty
	@Size(min = 1,max = 8,message = "el usuario no debe pasar los 8 caracteres")
	private String usuario;
	
	@NotEmpty
	@Size(min = 1, max = 8, message = "la contraseña no debe pasar los 8 caracteres")
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
