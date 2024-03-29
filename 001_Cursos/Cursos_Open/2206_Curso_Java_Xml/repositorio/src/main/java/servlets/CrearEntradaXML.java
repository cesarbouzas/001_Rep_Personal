package servlets;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import clases.UsuarioXML;

/**
 * Servlet implementation class CrearEntradaXML
 */
public class CrearEntradaXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String NOMBRE_FICHERO = "D:\\Proyectos-trigs\\TutorialJavaApp\\src\\main\\webapp\\files\\xml\\archivoXML.xml";
	public static final String URL = "index.jsp";
	public UsuarioXML nuevoUsuario = new UsuarioXML();
	public List<UsuarioXML> usuarios = new ArrayList<UsuarioXML>();
	DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	Date fechaActualDate = new Date();
	String fechaActual = formatoFecha.format(fechaActualDate);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearEntradaXML() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			crearEntradaXML(request,response);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			crearEntradaXML(request,response);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void crearEntradaXML(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SAXException {
		
		String nif = (request.getParameter("nifXML") != null) ? request.getParameter("nifXML") : "";
		String nombre = (request.getParameter("nombreXML") != null) ? request.getParameter("nombreXML") : "";
		String apellidos = (request.getParameter("apellidosXML") != null) ? request.getParameter("apellidosXML") : "";
		String fechaNacimiento = (request.getParameter("fechaXML") != null) ? request.getParameter("fechaXML") : "";
		fechaNacimiento = formatearFecha(fechaNacimiento);
		String asignatura = (request.getParameter("asignaturaXML") != null) ? request.getParameter("asignaturaXML") : "";
		int totalUsuarios = 0;
		
		int contadorUsuarios = 0;
		
		nuevoUsuario.setNif(nif);
		nuevoUsuario.setNombre(nombre);
		nuevoUsuario.setApellidos(apellidos);
		nuevoUsuario.setFechaNacimiento(fechaNacimiento);
		nuevoUsuario.setAsignatura(asignatura);
		
		
		//Una vez obtenidos los datos asociados a un alumno, procedemos a crear el fichero XML con los datos de este
		 try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// Elemento Raiz
			Document documento = docBuilder.newDocument();
			Element elementoRaiz = documento.createElement("DatosPersonales");
			documento.appendChild(elementoRaiz);

				// Elementos primarios del documento
				Element nombreDocumento = documento.createElement("nombreDocumento");
				nombreDocumento.appendChild(documento.createTextNode("Datos Personales Clientes"));
				elementoRaiz.appendChild(nombreDocumento);
				Element fecha = documento.createElement("fecha");
				fecha.appendChild(documento.createTextNode(fechaActual));
				elementoRaiz.appendChild(fecha);
				Element usuarios = documento.createElement("usuarios");
				elementoRaiz.appendChild(usuarios);
				almacenarUsuariosAntiguoFicheroXML();
				totalUsuarios = this.usuarios.size();
					for(int i=1;i<=totalUsuarios;i++) {
						
						Element usuario = documento.createElement("usuario");
						usuarios.appendChild(usuario);
						nif = this.usuarios.get(contadorUsuarios).getNif();
						nombre = this.usuarios.get(contadorUsuarios).getNombre();
						apellidos = this.usuarios.get(contadorUsuarios).getApellidos();
						fechaNacimiento = this.usuarios.get(contadorUsuarios).getFechaNacimiento();
						asignatura = this.usuarios.get(contadorUsuarios).getAsignatura();
						
						// Establecemos el atributo id para cada usuario
						Attr identificador = documento.createAttribute("id");
						identificador.setValue(Integer.toString(i));
						usuario.setAttributeNode(identificador);
						
						// Cargamos el nif asociado a cada usuario
						Element elementoNif = documento.createElement("nif");
						elementoNif.appendChild(documento.createTextNode(nif));
						usuario.appendChild(elementoNif);
			
						// Cargamos el nombre asociado a cada usuario
						Element elementoNombre = documento.createElement("nombre");
						elementoNombre.appendChild(documento.createTextNode(nombre));
						usuario.appendChild(elementoNombre);
			
						// Cargamos los apellidos asociado a cada usuario
						Element elementoApellidos = documento.createElement("apellidos");
						elementoApellidos.appendChild(documento.createTextNode(apellidos));
						usuario.appendChild(elementoApellidos);
						
						// Cargamos la fecha de nacimiento asociado a cada usuario
						Element elementoFechaNacimiento = documento.createElement("fechaNacimiento");
						elementoFechaNacimiento.appendChild(documento.createTextNode(fechaNacimiento));
						usuario.appendChild(elementoFechaNacimiento);
			
						// Cargamos la asignatura asociado a cada usuario
						Element elementoAsignatura = documento.createElement("asignatura");
						elementoAsignatura.appendChild(documento.createTextNode(asignatura));
						usuario.appendChild(elementoAsignatura);
						contadorUsuarios++;
					}

			// Escribimos el contenido generado en un archivo XML
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource fuenteDOM = new DOMSource(documento);
			StreamResult fichero = new StreamResult(new File(NOMBRE_FICHERO));

			// Si queremos testear la aplicación en modo Debug (depurar) 
			//StreamResult result = new StreamResult(System.out);

			transformer.transform(fuenteDOM, fichero);

			System.out.println("Fichero creado correctamente!");
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(URL);
			
			requestDispatcher.forward(request, response);

		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
	}
	
	private String formatearFecha(String fecha) {
		String fechaFormateada = "";
		String dia = fecha.substring(8);
		String mes = fecha.substring(5,7);
		String agno = fecha.substring(0,4);
		fechaFormateada = dia + "/" + mes + "/" + agno; 
		
		return fechaFormateada;
	}
	
	private void almacenarUsuariosAntiguoFicheroXML() throws ParserConfigurationException, SAXException, IOException {
		try {
			File contenidoFicheroXML = new File(NOMBRE_FICHERO);
		    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(contenidoFicheroXML);
			String nif = "";
			String nombre = "";
			String apellidos = "";
			String fechaNacimiento = "";
			String asignatura = "";
			doc.getDocumentElement().normalize();
			
			NodeList nodoUsuario = doc.getElementsByTagName("usuario");
			
			for (int temp = 0; temp < nodoUsuario.getLength(); temp++) {
				
				Node nNode = nodoUsuario.item(temp);
						
				Element eElement = (Element) nNode;
				
				nif = eElement.getElementsByTagName("nif").item(0).getTextContent();
				nombre = eElement.getElementsByTagName("nombre").item(0).getTextContent();
				apellidos = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
				fechaNacimiento = eElement.getElementsByTagName("fechaNacimiento").item(0).getTextContent();
				asignatura = eElement.getElementsByTagName("asignatura").item(0).getTextContent();
				UsuarioXML usuario = new UsuarioXML(nif, nombre, apellidos, fechaNacimiento,asignatura);
				usuarios.add(usuario);
			}
			usuarios.add(nuevoUsuario);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
