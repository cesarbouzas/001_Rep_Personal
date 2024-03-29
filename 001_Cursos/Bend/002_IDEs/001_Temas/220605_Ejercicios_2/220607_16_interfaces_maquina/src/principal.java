import java.time.LocalDate;

public class principal {
	
	
	public static void main (String[] args) {
		
		Maquina maquina0=new Avion(LocalDate.of(2020, 5, 21) ,false,false);
		Avion avion1=new Avion(LocalDate.of(2020, 5, 21) ,false,false);
		Maquina maquina1=avion1;//estoy llamando a un puntero de avion1, 
		 
		maquina0.apagar();
		maquina0.encender();
		System.out.println(maquina0);
		//maquina1.despegar();;//no funciona y estoy llmando a un puntero de avion1???Solo funciona si Sobrescribo los métodos.
		((Avion)maquina1).despegar();
		((Avion)maquina1).despegar();
		((Avion)maquina1).aterreizar();
		maquina1=((Avion)maquina1);
		//maquina1.despegar();//No funciona
	
		
	}

}
