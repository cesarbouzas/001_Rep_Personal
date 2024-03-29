
package miscontroles;

import java.awt.Color;
import java.awt.Font;
import java.beans.*;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class ComponenteMiTexto extends JTextField implements Serializable {
    private int ancho;
   private Color color;
   private Font fuente;
    
     public ComponenteMiTexto() {
      
    }
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    
   
    
   
    
}
