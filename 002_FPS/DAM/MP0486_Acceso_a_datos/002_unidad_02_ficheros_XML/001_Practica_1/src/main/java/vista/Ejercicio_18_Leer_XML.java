
package vista;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Usuario
 */
public class Ejercicio_18_Leer_XML {

    public static void main(String args[]) throws ParserConfigurationException{
 
        try {
            File archivoXML=new File("./src/main/resources/clase.xml");
            DocumentBuilderFactory dBF=DocumentBuilderFactory.newInstance();
            DocumentBuilder dB=dBF.newDocumentBuilder();
            if(archivoXML.exists()){
            System.out.println("El archivo existe");
            Document doc=dB.parse(archivoXML);
            doc.getDocumentElement().normalize();
            System.out.println("El root del documento :"+doc.getDocumentElement().getNodeName());
            NodeList nList=doc.getElementsByTagName("alumno");
            System.out.println("---------------------------------------");
            for(int i=0;i<nList.getLength();i++){
            Node nodo=nList.item(i);
                System.out.println("Elemento actual "+nodo.getNodeName()+" "+(i+1));
                if(nodo.getNodeType()==Node.ELEMENT_NODE){
                    Element elemento=(Element)nodo;
                    System.out.println("Numero alumno:"+elemento.getAttribute("numero"));
                    System.out.println("Nombre:"+elemento.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.println("Apellido:"+elemento.getElementsByTagName("apellido").item(0).getTextContent());
                    System.out.println("Apodo:"+elemento.getElementsByTagName("apodo").item(0).getTextContent());
                    System.out.println("Marca:"+elemento.getElementsByTagName("marcas").item(0).getTextContent());
                }
            }
            }else{
                System.out.println("ruta incorrecta de archivo XML");
            }
        } catch (SAXException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }
    
    }

}




    

