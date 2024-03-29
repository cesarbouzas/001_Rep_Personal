/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package miscontroles;

import java.awt.Color;
import java.awt.Font;
import java.beans.*;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Cesar
 */
public class ComponenteMiTexto extends JTextField implements Serializable  {
    
    
        private Color color;

    

    private Font fuente;
    private int ancho;

    public ComponenteMiTexto() {

    }

 /**
     * Get the value of color
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(Color color) {
        this.color = color;
        this.setForeground(color);
    }

    /**
     * Get vaule of Fuente
     *
     * @return the fuente
     */
    public Font getFuente() {
        return fuente;
    }

    /**
     * Set value of Fuente
     *
     * @param fuente the fuente to set
     */
    public void setFuente(Font fuente) {
        this.fuente = fuente;
        this.setFont(fuente);
    }

    /**
     * Get value of ancho
     * 
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Set value of ancho
     * 
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
        this.setColumns(ancho);
    }

}
