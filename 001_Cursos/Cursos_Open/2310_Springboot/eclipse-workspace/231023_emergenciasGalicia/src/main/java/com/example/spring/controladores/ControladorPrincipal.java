package com.example.spring.controladores;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorPrincipal {
	
	private ArrayList<String> apartadosList=new ArrayList<String>();
	
	private void crearApartados() {	
		apartadosList.add("Inicio");
		apartadosList.add("Lote 1");
		apartadosList.add("Lote 2");
		apartadosList.add("Lote 3");
		apartadosList.add("About us");	
	}

	
	@RequestMapping("/")
	public String paginaInicial(Model modelo) {	
		crearApartados();
		modelo.addAttribute("titulo","Emergencias Galicia");
		modelo.addAttribute("apartados",apartadosList);
		return ("index");
	}
	
	@RequestMapping("/Lote 1")
	public String paginaLote_1(Model modelo) {
		return ("lote_1");
		
	}
	@RequestMapping("/Lote 2")
	public String paginaLote_2(Model modelo) {
		return ("lote_2");
		
	}
	@RequestMapping("/Lote 3")
	public String paginaLote_3(Model modelo) {
		return ("lote_3");
		
	}
	@RequestMapping("/Inicio")
	public String paginaInicio(Model modelo) {
		modelo.addAttribute("titulo","Emergencias Galicia");
		modelo.addAttribute("apartados",apartadosList);
		return ("index");
	}
	
//	@GetMapping("/About")
//	public String consultaGet(@RequestParam(name="name",required = false,defaultValue = "Desconocido") String nombre,@RequestParam(name="lastName",required = false,defaultValue = "desconocido") String apellido ,Model modelo) {
//		modelo.addAttribute("name",nombre);
//		modelo.addAttribute("lastName",apellido);
//		return ("about_us");
//	}
	@GetMapping("/About")
	public String paginaAbout(@RequestParam("nombre") Optional <String> nombre ,@RequestParam("apellido") Optional <String> apellido,Model modelo) {
		modelo.addAttribute("name",nombre.orElse("Desconocido").toUpperCase());
		modelo.addAttribute("lastName",apellido.orElse("Desconcodio").toUpperCase());
		return ("about_us");
	}
}