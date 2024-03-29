package map;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExampleMap {

	public static void main(String[] args) {
		List<Persona> lista=Arrays.asList (
		new Persona("Pepe", "Pérez", LocalDate.of(1990, 1, 2)),
		new Persona("Juan", "Andévalo", LocalDate.of(1991, 2, 3)),
		new Persona("Miguel", "Ramos", LocalDate.of(1992, 3, 4)),
		new Persona("Carlos", "Jiménez", LocalDate.of(1993, 4, 5))	
		);
		
		Function<Persona,String> nombre=p->p.getNombre();
		Function<String,String> ponerMayusculas=s->s.toUpperCase();
		Function<Persona,LocalDate>fechaNac=p->p.getFechaNacimiento();
		Function<LocalDate,String> formatearFechaMesDia=f->f.format(DateTimeFormatter.ofPattern("LL/dd"));
		System.out.println("Nombres en mayusculas");
		lista
		.stream()
		.map(nombre)
		.map(ponerMayusculas)
		.forEach(System.out::println);
		
		System.out.println("Mes y dia cumple");
		lista
		.stream()
		.map(fechaNac)
		.map(formatearFechaMesDia)
		.forEach(System.out::println);
		

	}

}
