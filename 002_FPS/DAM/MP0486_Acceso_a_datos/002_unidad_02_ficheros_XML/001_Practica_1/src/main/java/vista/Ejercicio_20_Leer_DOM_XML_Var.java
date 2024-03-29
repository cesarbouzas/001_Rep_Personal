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

public class Ejercicio_20_Leer_DOM_XML_Var {

    public static void main(String args[]) {
        File ficheroXML = new File("./src/main/resources/clase2.xml");
        if (ficheroXML.exists()) {
            String nombreAtributo, valorAtributo;
            String nombreElemento, valorElemento;
            try {
                DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
                DocumentBuilder dB = dBF.newDocumentBuilder();
                Document documento = dB.parse(ficheroXML);
                documento.getDocumentElement().normalize();

                NodeList nNode = documento.getElementsByTagName("alumno");
                for (int i = 0; i < nNode.getLength(); i++) {
                    System.out.println("Alumno :" + i);
                    if(nNode.item(i).getAttributes().getLength()>0){
                    imprimirAtributos(nNode.item(i));
                    }
                    if (nNode.item(i).getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) nNode.item(i);
                        System.out.println("");
                        for (int k = 0; k < elemento.getChildNodes().getLength(); k++) {
                            Node nodoHijo = elemento.getChildNodes().item(k);
                            if (nodoHijo.getNodeType() == Node.ELEMENT_NODE) {
                               
                                nombreElemento = nodoHijo.getNodeName();
                                valorElemento = elemento.getChildNodes().item(k).getTextContent();
                                System.out.print(nombreElemento+" ");
                                imprimirAtributos(nodoHijo);
                                System.out.println(":"+valorElemento);
                            }
                        }
                    }
                        System.out.println("-------------------------------------");
                }

            } catch (ParserConfigurationException ex) {
                System.out.println("Error de parser " + ex.getMessage());
            } catch (SAXException ex) {
                System.out.println("Erros SAX " + ex.getMessage());
            } catch (IOException ex) {
                System.err.println("Error IOE " + ex.getMessage());
            }
        } else {
            System.out.println("Error de ruta de fichero");
        }

    }
    
    
    static void imprimirAtributos(Node nodo){
        String nombreAtributo,valorAtributo;
        for (int j = 0; j < nodo.getAttributes().getLength(); j++) {
                        nombreAtributo = nodo.getAttributes().item(j).getNodeName();
                        valorAtributo = nodo.getAttributes().item(j).getTextContent();
                        System.out.print(nombreAtributo + "=" + valorAtributo + " ");
                    }
    }
    
    
    
}
