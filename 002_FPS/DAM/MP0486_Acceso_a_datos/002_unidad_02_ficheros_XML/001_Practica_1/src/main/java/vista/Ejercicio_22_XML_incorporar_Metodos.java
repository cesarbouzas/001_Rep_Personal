
package vista;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import modelo.Atributo;
import org.w3c.dom.*;


/**
 *
 * @author Usuario
 */
public class Ejercicio_22_XML_incorporar_Metodos {


public static void main(String arg[]){
    File fileXml=new File("./src/main/resources/ficheroXML2.xml");
    ArrayList<Atributo> listaAtributos=new ArrayList<>();
    
    if(!fileXml.exists()){
        try{
        fileXml.createNewFile();
        }catch(IOException ex){
            System.out.println("Error al crear el fichero"+ex.getMessage());
        }
    }
    try{
    DocumentBuilderFactory dBF=DocumentBuilderFactory.newInstance();
    DocumentBuilder dB=dBF.newDocumentBuilder();
    Document document=dB.newDocument();
    Element raiz=document.createElement("Escritoras");
    document.appendChild(raiz);
    
    NodeList nodeListEscritora= raiz.getElementsByTagName("Escritora");
    
    crearElemento("Escritora",null, raiz, document, listaAtributos);
    Atributo a1=new Atributo("fechaNac","1861");
    listaAtributos.add(a1);
    crearElemento("nombre", "Sofia casanova", (Element)nodeListEscritora.item(0), document, listaAtributos);
    crearElemento("LugarNacimiento", "Almeiras",(Element)nodeListEscritora.item(0), document, new ArrayList<>());
    
    
        //TransformerFactory es una clase que crea instancias de Transformer.
        //newDefaultInstance() devuelve una fábrica de transformadores con las configuraciones predeterminadas. 
        //newTransformer() crea una nueva instancia de Transformer a partir de esa fábrica.
        Transformer transformer=TransformerFactory.newInstance().newTransformer();
        //se crea una instancia de la interfaz Source utilizando DOMSource.
        // DOMSource es una implementación de Source que toma un objeto DOM (Document Object Model) como fuente de datos para la transformación.
        Source source=new DOMSource(document);
        //Se crea una instancia de la interfaz Result utilizando StreamResult. 
        //StreamResult es una implementación de Result que especifica un flujo de salida donde se escribirá el resultado de la transformación.
        //En este caso, el resultado se escribirá en el archivo especificado por fileXml.
        Result result=new StreamResult(fileXml);
        //Finalmente, se utiliza el método transform de la instancia de Transformer para realizar la transformación. 
        //Toma la fuente (en este caso, un objeto DOM) y el resultado (en este caso, un archivo XML), 
        // realiza la transformación, escribiendo el resultado en el archivo XML especificado.
        transformer.transform(source, result);
        
        
        Result console= new StreamResult(System.out);
        transformer.transform(source, console); 
        
    }catch (ParserConfigurationException | TransformerException | DOMException ex){
        System.out.println("Error general :"+ex.getMessage());
        ex.printStackTrace();
    }
    
    
    
    
}    
static void crearElemento(String dato,String valor,Element raiz,Document document,ArrayList<Atributo> listaAtributo)
{
    Element elemento=document.createElement(dato);
    elemento.setTextContent(valor);
    raiz.appendChild(elemento);
    for(Atributo atributo:listaAtributo){
        elemento.setAttribute(atributo.getName(),atributo.getValue() );
    }
}

}
