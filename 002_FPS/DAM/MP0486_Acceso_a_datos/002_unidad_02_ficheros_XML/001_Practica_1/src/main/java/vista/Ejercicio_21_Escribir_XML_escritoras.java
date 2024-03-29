 package vista;
 
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import modelo.Escritora;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Ejercicio_21_Escribir_XML_escritoras {
    
private static void guardarArchivoXML(Document document,File file){
try{
    DOMSource domSource=new DOMSource(document);
    StreamResult streamResult=new StreamResult(file);
    Transformer trasformer=TransformerFactory.newInstance().newTransformer();
    trasformer.transform(domSource, streamResult);
            
    

}catch(Exception ex){
    System.out.println("error de guardado "+ex.getMessage());
}

}
    
public static void main(String args[]){
    ArrayList<Escritora> escritoras=new ArrayList<Escritora>();
    Escritora e1=new Escritora("Sofia Casanova", 1861);
    Escritora e2=new Escritora("Rosalia de Castro", 1837);
    escritoras.add(e1);
    escritoras.add(e2);
    File ficheroXML =new File ("./src/main/resources/escritoras.xml");
    //String data="version=\"1.0\" encoding=\"UTF-8\" standalones=\"no\"?";
    if(!ficheroXML.exists()){
        try{
            ficheroXML.createNewFile();
        }catch(IOException ex){
            System.out.println("Error de fichero "+ex.getMessage());
        }
    }else{
        try {
           
            DocumentBuilderFactory dBF=DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder dB=dBF.newDocumentBuilder();
            Document document=dB.newDocument();
            //document.appendChild(document.createProcessingInstruction("xml", data));
            Element rootElement=document.createElement("Escritoras");
            document.appendChild(rootElement);
           
            for(Escritora e:escritoras){
                Element escritoraElement=document.createElement("Escritora");
                System.out.println(e.getName()+"----> registrada");
                rootElement.appendChild(escritoraElement);
                escritoraElement.setAttribute("fechanac", String.valueOf(e.getFechNac()));
                escritoraElement.setTextContent(e.getName());
            }
            guardarArchivoXML(document, ficheroXML);
        
        } catch (ParserConfigurationException ex) {
            System.out.println("Error de Parser "+ex.getMessage());
        }
        
    }
    }
    
    
    

}    





