package com.cesar.spring.services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cesar.spring.modelo.Contratante;
import com.cesar.spring.modelo.Proyecto;

import jakarta.annotation.PostConstruct;

@Service
public class ProyectoService {

	private List<Proyecto> repositorio=new ArrayList<Proyecto>();
	
	public String addProyecto(Proyecto proyecto) {
		repositorio.add(proyecto);
		return "Proyecto Añadido";
	}
	public List<Proyecto> devuelveListadoProyectos(){
		return repositorio;
	}
	
	
	@PostConstruct
	
	public void init() {
		repositorio.addAll(
				Arrays.asList(
						new Proyecto(1,"Emergencias",Contratante.Adif.toString(),
								"Emergencias 2023","Lote 1","1561789.89","01/01/2023","Civis Global"),
						new Proyecto(2,"Emergencias",Contratante.Adif.toString(),
								"Emergencias 2023","Lote 2","2256789.89","01/01/2023","Cosfesa"),
						new Proyecto(3,"Emergencias",Contratante.Adif.toString(),
								"Emergencias 2023","Lote 3","3356789.89","01/01/2023","Comsa"),
						new Proyecto(4,"Guillarei-Tuy",Contratante.Adif.toString(),
								"Reposicion de vias","Renovacion de estacion y vias de Guillarei-Tuy",
								"9756789.89","01/01/2023","UTE Dargados-Tecsa")
						)
				);
		
	}
	
}
