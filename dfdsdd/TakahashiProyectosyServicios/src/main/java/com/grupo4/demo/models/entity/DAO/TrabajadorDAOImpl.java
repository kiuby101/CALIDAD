package com.grupo4.demo.models.entity.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.grupo4.demo.models.entity.Trabajador;

@Repository
public class TrabajadorDAOImpl implements ITrabajadorDAO{

	//importante para la persistencia de datos
	@PersistenceContext
	private EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public List<Trabajador> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Trabajador").getResultList();
	}

	@Override
	@Transactional
	public void save(Trabajador trabajador) {
		// TODO Auto-generated method stub
		if(trabajador.getIdTrabajador() != null && trabajador.getIdTrabajador()>0) {
			em.merge(trabajador);
		}else {
			em.persist(trabajador);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Trabajador findOne(Long idTrabajador) {
		// TODO Auto-generated method stub
		return em.find(Trabajador.class, idTrabajador);
	}

	@Override
	@Transactional
	public void delete(Long idTrabajador) {
		// TODO Auto-generated method stub
		Trabajador trabajador = findOne(idTrabajador);
		em.remove(trabajador);
	}

}
