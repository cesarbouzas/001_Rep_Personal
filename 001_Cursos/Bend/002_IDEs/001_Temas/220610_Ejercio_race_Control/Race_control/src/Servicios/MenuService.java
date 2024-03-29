package Servicios;


import java.util.ArrayList;

import clases_Objeto.CarreraEstandar;
import clases_Objeto.Coche;
import clases_Objeto.Garaje;

public abstract class MenuService {
	
	public static void principal(){
	int op=0;
	do {
		String txt="******************Menu Principal****************";
		txt+="\n 1) Menu Garaje.";
		txt+="\n 2) Menu Coche.";
		txt+="\n 3) Carrera.";
		txt+="\n 0) Salir.";
		txt+="\n Introduce una opcion :";
		System.out.println(txt);
		op=TecladoService.leerInt();
	
	switch (op) {
		case 1:
			MenuService.garaje();
			break;
		case 2:
			MenuService.coche();	
			break;
		case 3:
			MenuService.carrera();
		default:
			System.out.println("opcion no válidas");
			break;
	}
	}while(op!=0);
	}

	public static void  garaje()  {
		int op=0;
		int ngaraje;
		do {
			PantallaService.borrar();
			String txt="******************Menu Garaje****************";
			txt+="\n 1) Crear Garaje.";
			txt+="\n 2) Listar Garajes.";
			txt+="\n 3) Ver Coches por garaje .";
			txt+="\n 4) Borrar Garaje.";
			txt+="\n 5) Menu principal.";
			txt+="\n 0) Salir.";
			txt+="\n Introduce una opcion :";
			System.out.println(txt);
			op=TecladoService.leerInt();
		switch (op) {
			case 1:
				Garaje.crear();
			break;
			case 2:
				if(GarajesService.numeroDeGarajes()!=0) {
				System.out.println(GarajesService.getLista());
				break;
				}else {
					System.out.println("Introduce Garajes... ");
					break;
				}
			
			case 3:
				
				System.out.println(GarajesService.getLista());
				System.out.println("Introduce nº garaje para ver los coches :");
				ngaraje=TecladoService.leerInt();
				while(ngaraje+1>GarajesService.numeroDeGarajes()){ 
				System.out.println("Introduce nº garaje para ver los coches :");
				ngaraje=TecladoService.leerInt();
				}
				if(GarajesService.getGaraje(ngaraje).cantidadCoches()!=0) {
				GarajesService.getGaraje(ngaraje).toString();
				}else {
					System.out.println("Garaje Vacio.....Introduce coches");
					break;
				}
			case 4:
				if(GarajesService.numeroDeGarajes()!=0) {
				System.out.println(GarajesService.getLista());
					ngaraje=TecladoService.leerInt();
					while(ngaraje+1>GarajesService.numeroDeGarajes()) {
					System.out.println("Introduce nº garaje para borrar :");
					ngaraje=TecladoService.leerInt();
					}
					System.out.println("Garaje "+GarajesService.getGaraje(ngaraje)+" borrado");
					GarajesService.removeGaraje(ngaraje);
				}else {
					System.out.println("Introduce Garajes... ");
				}
				
			case 5:
				MenuService.principal();
				break;
		}
		}while(op!=0);
		}	
	public static void coche(){
		int op=0;
		do {
			PantallaService.borrar();
			String txt="******************Menu Coche****************";
			txt+="\n 1) Crear coche por garaje.";
			txt+="\n 2) Ver coches por garaje.";
			txt+="\n 3) Borrar coche por garaje.";
			txt+="\n 4) Menu principal.";
			txt+="\n 0) Salir.";
			txt+="\n Introduce una opcion :";
			System.out.println(txt);
			op=TecladoService.leerInt();
		switch (op) {
			case 1:
				Coche.crearCocheTeclado();				
			break;
			
			case 2:	
				Garaje g=GarajesService.elegirGaraje();
				System.out.println(g);
				break;
				
			case 3:
				Garaje g1=GarajesService.elegirGaraje();
				System.out.println(g1);
				Coche c=g1.elegirCoche();
				g1.borrarCoche(c);
				
				break;
			case 4:
			MenuService.principal();
			break;
				
		}
		}while(op!=0);
		}

	
public static void carrera(){
	int op;
	do {
		String txt="******************Carrera****************";
		txt+="\n 1) Estandar";
		txt+="\n 2) Eliminacion.";
		txt+="\n 3) Torneo.";
		txt+="\n 4) Menu principal.";
		txt+="\n Introduce una opcion :";
		System.out.println(txt);
		op=TecladoService.leerInt();
	
	switch (op) {
	
		case 1:

			MenuService.unoOVarios();
			break;
		case 2:
			
			
			break;
		default:
			System.out.println("opcion no válidas");
			break;
	}
	}while(op!=0);
	}
public static void unoOVarios(){
	int op;
	do {
		String txt="***************Competicion entre Garajes o Garaje****************";
		txt+="\n 1) Uno , todos los coches";
		txt+="\n 2) Varios, un coche por cada garaje.";
		txt+="\n 3) Menu principal.";
		txt+="\n Introduce una opcion :";
		System.out.println(txt);
		op=TecladoService.leerInt();
	
	switch (op) {

		case 1:
			CarreraEstandar c1=new CarreraEstandar(GarajesService.unGaraje());
			c1.entreCochesDeUnGaraje();
			
			break;
		case 2:		
			break;
		case 3:
			MenuService.principal();
			break;
		default:
	
			break;
	}
	}while(op!=0);
	}
	
	
	
	
	
	
	
	}
		
	

