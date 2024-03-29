package vista;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import modelo.Atributo;
import org.w3c.dom.*;

/**
 *
 * @author Accesoadatos
 */
public class Ejercicio22_clase {
    
    static void crearElemento(String dato, String valor, Element raiz, Document document, ArrayList<Atributo> listaAtrib) {
        Element elem = document.createElement(dato);
        elem.setTextContent(valor);
        raiz.appendChild(elem);
        for (Atributo atributo : listaAtrib) {
            elem.setAttribute(atributo.getName(), atributo.getValue());
        }
    }
    public static void main(String[] args) {
        ArrayList<Atributo> listaatributos = new ArrayList<>();
        
        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbuilder = factory.newDocumentBuilder();

            //Crearemos el elemento raiz
            //Como norma indicamos en el raiz el plural de los elementos del xml
            Document document = dbuilder.newDocument();
            Element raiz = document.createElement("Escritoras");
            document.appendChild(raiz);

            //Es importante esta lista para saber donde añadir cada escritora.
            NodeList nodosescritoras = raiz.getElementsByTagName("Escritora");
              
            crearElemento("Escritora", null, raiz, document, listaatributos);
            listaatributos.add(new Atributo("fechanac","1861"));
            crearElemento("nombre", "Sofia casanova", (Element) nodosescritoras.item(0), document, listaatributos);
            crearElemento("lugarnacimiento", "Almeiras", (Element) nodosescritoras.item(0), document, new ArrayList<>());
            
            listaatributos.clear();//Inicializamos la lista de atributos para la segunda escritora
            crearElemento("Escritora", null, raiz, document, listaatributos);
            listaatributos.add(new Atributo("fechanac","1837"));
            crearElemento("nombre", "Rosalia de castro", (Element) nodosescritoras.item(1), document, listaatributos);
            crearElemento("lugarnacimiento", "Padron", (Element) nodosescritoras.item(1), document, new ArrayList<>());
            
                       
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            Source source = new DOMSource(document);
            Result result = new StreamResult(new File("./src/main/resources/salidacrearXML22.xml")); //nombre del archivo
            
            transformer.transform(source, result); 

            //Para ver la salida por pantalla (opcional)
            Result console= new StreamResult(System.out);
            transformer.transform(source, console); 
            

        } catch (Exception e) {
            System.err.println("Error: ");
            e.getMessage();
        }
    }
}