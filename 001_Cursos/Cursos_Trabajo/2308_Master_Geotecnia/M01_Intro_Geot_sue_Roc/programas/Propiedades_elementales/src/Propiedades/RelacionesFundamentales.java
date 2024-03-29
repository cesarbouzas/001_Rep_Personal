/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Propiedades;

/**
 *
 * @author Usuario
 */
public class RelacionesFundamentales {
    
    /**
     * Para determinar una propiedad indice es necesario el conocimineto de al menos otras tres
     * En el laboratorio puede medirse algunos valores indice como la humedad W
     * El peso especifico de las particulas G
     * El peso especifico aparente
     * El peso especifico seco
     * el grado de saturacion no se puede medir
     * Por ello utilizamos relaciones
     */
    /**
     * 
     * @param e indice de poros
     * @return porosid
     */    
    public static double calcularPorosidad(double e){
    return e/(1+e);
    }
    /**
     * 
     * @param n porosidad
     * @return Indice de poros relacion Vv/Vs
     */
    public static float calcularIndicePoros(float n){
    return n/(1+n);
    }
      public static float calcularIndicePoros(float G,float W,float Vs,float Sr){
    return (G*W)/Sr;
    }
    
}
