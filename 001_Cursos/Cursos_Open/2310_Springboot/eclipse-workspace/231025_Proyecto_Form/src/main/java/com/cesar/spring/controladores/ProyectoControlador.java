package com.cesar.spring.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cesar.spring.modelo.Proyecto;
import com.cesar.spring.services.ProyectoService;


@Controller
public class ProyectoControlador {
	
	@Autowired
	private ProyectoService service;

	@RequestMapping({"/" , "proyecto/list"})
	public String listado(Model modelo){
		modelo.addAttribute("listaProyectos",service.devuelveListadoProyectos());
		return ("list");
	}
	
	@RequestMapping("/proyecto/new")
	public String nuevoProyecto(Model modelo) {
		modelo.addAttribute("proyectoForm",new Proyecto());
		return "form";
	}
	@RequestMapping("/proyecto/new/submit")
	public String nuevoProyectoSubmit(@ModelAttribute("proyectoForm") Proyecto proyecto) {
		
		service.addProyecto(proyecto);
		return "redirect:/proyecto/list";
	}
}
