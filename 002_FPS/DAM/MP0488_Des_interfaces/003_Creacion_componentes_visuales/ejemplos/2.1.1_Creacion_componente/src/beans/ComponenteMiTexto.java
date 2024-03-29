package beans;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 * 
 * @author Cesar
 */



public class ComponenteMiTexto extends JTextField implements Serializable{

private Color color;
private int ancho;
private Font fuente;

//Constructor

public ComponenteMiTexto(){};

/**
 * Get value of color
 * 
 * @return the value of color
 */
public Color getColor(){
    return this.color;
};
/**
 * Set value of color
 * 
 * @param color new value of color
 */
public void setColor(Color color){
    this.color=color;
    this.setForeground(color);
}
/**
 * Get value of ancho
 * 
 * @return the value of ancho
 */
public int getAncho(){
return this.ancho;
}
/**
 * Set value of ancho
 * 
 * @param ancho new value of ancho
 */

public void setAncho(int ancho){
    this.ancho=ancho;
    this.setColumns(ancho);
}
/**
 * Get value of fuente
 * 
 * @return value of Fuente
 */
public Font getFuente(){
    return this.fuente;
}
/**
 * Set value of fuente
 * 
 * @paraman fuente new value of fuente
 */

public void getFuente(Font fuente){
this.fuente=fuente;
this.setFont(fuente);
        
}

}

