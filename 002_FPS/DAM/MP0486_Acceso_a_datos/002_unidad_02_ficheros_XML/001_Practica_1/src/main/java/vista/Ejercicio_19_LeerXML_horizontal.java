
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
public class Ejercicio_19_LeerXML_horizontal {

    public static void main(String args[]) {
        String numero;
        String nombre;
        String apellidos;
        String apodo;
        String marcas;

        File ficheroXml = new File("./src/main/resources/clase.xml");
        if (ficheroXml.exists()) {
            try {
                DocumentBuilderFactory dBF = DocumentBuilderFactory.newInstance();
                DocumentBuilder dB = dBF.newDocumentBuilder();
                Document document = dB.parse(ficheroXml);
                document.getDocumentElement().normalize();
                NodeList nNodes = document.getElementsByTagName("alumno");

                for (int i = 0; i < nNodes.getLength(); i++) {
                    Node item = nNodes.item(i);

                    if (item.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) item;
                        if (i == 0) {
                            System.out.printf("""
                                        %-10s%-10s%-10s%-10s%-10s
                                        -----------------------------------------------
                                        """,
                                    element.getAttributes().item(0).getNodeName(),
                                    element.getElementsByTagName("nombre").item(i).getNodeName(),
                                    element.getElementsByTagName("apellido").item(i).getNodeName(),
                                    element.getElementsByTagName("apodo").item(i).getNodeName(),
                                    element.getElementsByTagName("marcas").item(i).getNodeName()
                            );
                        }
                        numero = element.getAttribute("numero");
                        nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                        apellidos = element.getElementsByTagName("apellido").item(0).getTextContent();
                        apodo = element.getElementsByTagName("apodo").item(0).getTextContent();
                        marcas = element.getElementsByTagName("marcas").item(0).getTextContent();
                        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", numero + " --->", nombre, apellidos, apodo, marcas);
                    } else {
                        System.out.println("Error de formato");
                    }
                }
            } catch (ParserConfigurationException ex) {
                System.out.println("Error de Parser XML :" + ex.getMessage());
            } catch (SAXException ex) {
                System.out.println("Error SAX :" + ex.getMessage());
            } catch (IOException ex) {
                System.err.println("Error IOE :" + ex.getMessage());
            }

        } else {
            System.out.println("Fichero no existe");
        }
    }

}
