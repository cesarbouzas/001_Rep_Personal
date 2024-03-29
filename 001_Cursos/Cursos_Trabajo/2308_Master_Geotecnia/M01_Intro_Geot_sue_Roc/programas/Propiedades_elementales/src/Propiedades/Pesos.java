/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Propiedades;

/**
 *
 * @author Usuario
 */
public class Pesos {
    
    /**
     * Los pesos especificos son la relaciones entre volumenes y pesos 
     * El peso especifico se define como la realcion del peso del maeterial (W) y su volumen V
     * La unidad es N/m3
     * El simbolo es gamma
     * En geotecnia los Pesos suelen expresarse en KN/m3
     * 
     */
    /**
     * No confundir el Peso especifico con la densidad 
     * La densidad "ro" es la relacion entre masa y el volumen
     * La unidad es Kg/m3 
     * Se relaciona con el peso como gamma=ro*g
     */
    /**
     * Peso especifico del agua 10 KN/m3
     * Division entre el peso del agua y el volumen que ocupa (en 1m3 1000kg*10=10000 N=10KN/m3)
     * 
     */
    /**
     * @param Ws peso de las particulas solidas
     * @param Vs volumen que ocupan las particulas solidas
     * @return Relacion entre el peso de las particulas solidas solid Weight y el volumen que ocupan
     */
    public static float calcularPesoEspecificoParticulasSolidas(float Ws,float Vs){
    return Ws/Vs;
    }
    /**
     * El peso relativo de las particulas solidas se refiere a la relacion entre el peso espicfico de los solidos y el peso 
     * especifico del agua
     * Se pude interpretar como para una misma unidad de volumen cuantas veces es mas pesado el suelo que el agua
     */
    public static float calcularPesoEspecificoRelativoParticulasSolidas(float Ws,float Vs ){
    return (Ws/Vs)/10;
    }
    public static float calcularPesoEspecificoRelativoParticulasSolidas(float pesoEspecifico ){
    return pesoEspecifico/10;
    }
    /**
     * 
     * @param Wt peso del suelo total
     * @param Vt voluemn del suelo total
     * @return Peso especifico Aparente es la relacion del peso del suelo respecto al volumen total
     */
    public static float calcularPesoEspecificoAparente(float Wt,float Vt){
    return Wt/Vt;
    }
    /**
     * 
     * @param Ws Peso de los solidos del suelo
     * @param Vt Volumen total del suelo
     * @return la relacion del peso total cuando no presenta agua , Wt/Vt=(Ws+Ww+Wa)/Vt=Ws+0+0=Ws/Vt; 
     */
    public static float calcularPesoEspecificoSeco(float Ws,float Vt){
    return Ws/Vt;
    }
    /**
     * 
     * @param Ws peso de los solidos
     * @param Vs Voluemen de los solidos
     * @param Vw voluemen del agua
     * El peso especifico del agua es 10KN/m3
     * @return el peso especifico saturado peso del suelo con todos sus huecos llenos de agua dividido por su volumen total 
     */
    
    public static float  calcularPesoEspecificoSaturado(float Ws,float Vs,float Vw){
    return (Ws+Vw*10)/(Vs+Vw);
    }
        /**
     * 
     * @param Ws peso de los solidos
     * @param Vs Voluemen de los solidos
     * @param Vw voluemen del agua
     * El peso especifico del agua es 10KN/m3
     * @return el peso especifico saturado peso del suelo con todos sus huecos llenos de agua dividido por su volumen total 
     */
    
    public static float  calcularPesoEspecificoSaturadoSumergido(float Ws,float Vs,float Vw){
    return ((Ws+Vw*10)/(Vs+Vw))-10;
    }
    
    
}
