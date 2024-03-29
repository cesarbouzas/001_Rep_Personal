
package propiedades_elementales;

import Propiedades.RelacionesFundamentales;

/**
 *
 * @author Usuario
 */
public class Propiedades_elementales {
   
    public static float redondear(double number,int decimalPlaces){ 
        
         return Math.round(number * (float) Math.pow(10, decimalPlaces)) / (float) Math.pow(10, decimalPlaces);
    }
    static double indicePoros=0.572;
    static int pesoEspecificoParticulas=26;
    static float porosidad;
    static float Vt=1;
    static float Ws;
    static float PesoEspeSeco;
    static double PesoEspeSaturado;
    static double PesoEspeSumergido;
    public static void main(String[] args) {
      
        String cuestion_1 = """
                              De una arena, se conocen los siguientes datos:
                                      Índice de poros e = 0,572 y Peso específico de las partículas γs = 26 kN/m3 
                                      A partir de dichos datos, se pide obtener:
                                      - La porosidad (n), el peso específico seco (γd)
                                      - El peso específico saturado (γsat) y el peso específico sumergido (γ’)
                                      considerando γW = 10 kN/m3""";
        System.out.println(cuestion_1); 
    
        System.out.println("********************************************************************************");
        porosidad=redondear(RelacionesFundamentales.calcularPorosidad(indicePoros),3);
        System.out.println("La porosidad es :"+ porosidad);
        Ws=pesoEspecificoParticulas*(1-porosidad);
        System.out.println("La porosidad es el Vv/Vs=0.364 y el peso especifico es Ws/Vt=26 en un m3 0.364 m3 estan vacios y 0.637m pesan :"+pesoEspecificoParticulas*(1-porosidad)+"KN " );
        PesoEspeSeco=Ws/Vt;
        System.out.println("Peso especifico seco =Ws/Vt="+redondear(PesoEspeSeco,3));
        PesoEspeSaturado=redondear(((Ws+(0.364*10))/Vt),2);
        System.out.println("Peso especifico saturado="+redondear(PesoEspeSaturado,3));
        PesoEspeSumergido=PesoEspeSaturado-10;
        System.out.println("Peso especifico sumergido="+redondear(PesoEspeSumergido,3));
    }}