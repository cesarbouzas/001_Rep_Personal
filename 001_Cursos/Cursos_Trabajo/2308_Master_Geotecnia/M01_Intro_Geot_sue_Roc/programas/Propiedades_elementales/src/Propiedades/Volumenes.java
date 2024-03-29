/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Propiedades;

/**
 *
 * @author Usuario
 */
public class Volumenes {
   
    
   /**
    * @param Vs el volumen de solidos
    * @param Vv el volumen de la parte de huecos o vacias.
    * @return el volumen total del suelo incluye el volumen de solidos Vs y vloumen de huecos Vv 
    */
    public static float calculoVolumenTotal(float Vs,float Vv){
    return Vs+Vv ;
    }
    
    
    /**
     *@param Va se corresponde con el voluemn de aire
     *@param Vw se corresponde con el volumen de agua
     *@return Vv se corresponde con el volumen de poros , suma de los dos parametros 
     */
    public static float calculoVolumenHuecosMojado(float Va,float Vw){
    return Vw+Va;
    }
    /**
     * @param Va se corresponde con el volumen de aire
     * @return devuelve el valor del volumen de aire pues se corresponde con un volumen de agua 0
     */
    public static float calculovolumenHuecosSeco(float Va){
    return calculoVolumenHuecosMojado(Va, 0);
    }
    /**
     * @param Vw se corresponde con el volumen de agua el volumen de aire es 0
     * @return devuelve el valor del volumen de aire pues se corresponde con un volumen de agua 0
     */
     public static float calculovolumenHuecosSaturado(float Vw){
    return calculoVolumenHuecosMojado(0, Vw);
    }
     /**
      * @param Vv volumen vacio (agua Vw + aire Va)
      * @param  Vt (Volumen total)= Vs (voluemen solidos) +Vv (voluemne vacio)
      * @return Devuelve el valor de la Porosidad n relacion entre el volumen Vacio y el volumen total
      * 
      */
     public static float calculoPorosidad_Vt_Vv(float Vv,float Vt){
     return Vv/Vt;
     }
          /**
      * @param Vw volumen water (agua)
      * @param Vs voluemn de solios (solid)
      * @param  Vt (Volumen total)= Vs (voluemen solidos) +Vv (voluemne vacio)
      * @return Devuelve el valor de la Porosidad n relacion entre el volumen Vacio y el volumen total
      * 
      */
     public static float calculoPorosidad_Vt_Vs_Vw(float Vw,float Vt,float Vs){
      return (Vt-Vs)/Vt;
     }
        /**
      * @param Vw volumen water (agua)
      * @param Vs voluemn de solios (solid)
      * @param Va Volumen de aire (air)
      * @return Devuelve el valor de la Porosidad n relacion entre el volumen Vacio y el volumen total
      * 
      */
     
     public static float calculoPorosidad_Vs_Vw_Va(float Vs,float Vw,float Va){
     return calculoVolumenHuecosMojado(Va, Vw)/calculoVolumenTotal(Vs,Va+Vw );
     }
     
      /**
      * @param Vv volumen vacio
      * @param Vs voluemn de solios (solid)
      * @return void ratio en ingles e=Vv/Vs relacion entre Volumen vacio y Volumen de Solidos 
      * 
      */
     public static float calculoIndicePoros(float Vv,float Vs){
         return Vv/Vs;
     }
    /**
     * @param Vv volumen vacio(void) es el volumen total vacio disponible para oucpar por agua o aire
     * @param Vw volumen agua (water) es el volumen de agua de la muestra
     * @return indica el porcentaje de agua con respecto al volumen total vacio o lo que es lo mismo sobre el total que entra de agua
     * el nivel de ocupacion
     */

     public static float calculoGradoDeSaturacion (float Vw,float Vv){
     return Vw/Vv;
     } 

}
