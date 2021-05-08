package com.grupo4.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grupo4.demo.models.entity.Trabajador;
import com.grupo4.demo.models.entity.DAO.ITrabajadorDAO;

@Controller
@RequestMapping("/trabajadores")
public class TrabajadorController {

	//contiene los metodos crud∟
	@Autowired
	private ITrabajadorDAO trabajadordao;
	
	@RequestMapping(value="/listado")
	public String listar(Model model) {
		model.addAttribute("titulo", "trabajadores registrados");
		model.addAttribute("trabajadores", trabajadordao.findAll());
		return "trabajadores/listado";
	}
	
	@RequestMapping(value="/form", method = RequestMethod.GET)
	public String crear(Model model) {
		Trabajador trabajador = new Trabajador();
		model.addAttribute("titulo", "formulario trabajadores");
		model.addAttribute("trabajador", trabajador);
		return "trabajadores/formulario";
	}
	
	@RequestMapping(value="/form",method = RequestMethod.POST)
	public String guardar(@Valid Trabajador trabajador, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "formulario trabajadores");
			return "trabajadores/formulario";
		}
		
		trabajadordao.save(trabajador);
		return "redirect:/trabajadores/listado";
	}
	
	@RequestMapping(value="/form/{idTrabajador}")
	public String editar(@PathVariable(value="idTrabajador") Long idTrabajador, Model model){
		Trabajador trabajador = null;
		if(idTrabajador > 0) {
			trabajador = trabajadordao.findOne(idTrabajador);
		}else {
			return "redirect:/trabajadores/listado";
		}
		model.addAttribute("titulo", "Editar trabajador");
		model.addAttribute("trabajador", trabajador);
		return "trabajadores/formulario";
	}
	
	@RequestMapping("/eliminar/{idTrabajador}")
	public String eliminar(@PathVariable(value="idTrabajador") Long idTrabajador) {
		if(idTrabajador > 0) {
			trabajadordao.delete(idTrabajador);
		}
		return "redirect:/trabajadores/listado";
	}
	
	
	
	
}
