package es.cesar.list;

import java.util.ArrayList;
import java.util.List;

import es.cesar.Dao.Persona;
import es.cesar.utils.LectorArchivos;

public class ArrayListDemo {
	
	public static void main(String args[]) {
		
		List<Persona> clase=new ArrayList<>();
		clase=LectorArchivos.leerArchivoNombres();
		
	}

}