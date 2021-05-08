package com.grupo4.demo.models.entity.DAO;

import java.util.List;

import com.grupo4.demo.models.entity.Trabajador;

public interface ITrabajadorDAO {
	
	public List<Trabajador> findAll();
	public void save(Trabajador trabajador);
	public Trabajador findOne(Long idTrabajador);
	public void delete (Long idTrabajador);
	

}
