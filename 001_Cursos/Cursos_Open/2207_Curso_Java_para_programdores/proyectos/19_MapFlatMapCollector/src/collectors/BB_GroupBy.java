package collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BB_GroupBy {

	public static void main(String args[]) {

		List<Employed> empleados = new ArrayList<>();
		Employed e1 = new Employed("cesar", 42000, Departamentos.TOPOGRAFIA.toString());
		Employed e2 = new Employed("Felix", 78000, Departamentos.DIRECCION.toString());
		Employed e3 = new Employed("Natividad", 22000, Departamentos.CONTABILIDAD.toString());
		Employed e4 = new Employed("Silvia", 22000, Departamentos.CONTABILIDAD.toString());
		Employed e5 = new Employed("Pedro", 42000, Departamentos.TOPOGRAFIA.toString());
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		empleados.add(e5);
		Map<String, List<Employed>> porDepartamento = empleados.stream()
				.collect(Collectors.groupingBy(Employed::getDepartamento));

		porDepartamento.forEach((k, v) -> {
			String listado = v.stream().map(Employed::getNombre).collect(Collectors.joining(","));
			System.out.printf("Para el departamento %s tenemos los empleados %s%n", k, listado);
		});

		System.out.println("");

		Map<String, Long> porDepartamentoCantidad = empleados.stream()
				.collect(Collectors.groupingBy(Employed::getDepartamento, Collectors.counting()));

		porDepartamentoCantidad.forEach((k, v) -> System.out.printf("En el departamento %s ( %d trabadores)%n", k, v));

		System.out.println("");

		Map<String, Map<Double, List<Employed>>> porDepartamentoYSalario = empleados.stream()
				.collect(Collectors.groupingBy(Employed::getDepartamento, Collectors.groupingBy(e -> e.getSueldo())));

		porDepartamentoYSalario.forEach((dep, mapa) -> {
			System.out.printf("Para el departamento %s", dep);
			mapa.forEach((sueldo, lista) -> {
				String cumplen = lista.stream().map(Employed::getNombre).collect(Collectors.joining(","));
				System.out.printf(" Sueldo de %.1f tenemos los empleados %s%n", sueldo, cumplen);
			});

		});

	}

}
