package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.Usuario;

/**
 * Servlet implementation class ProcesarFormulario
 */
public class ProcesarFormulario extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1435653001019439787L;

	public static String URL_RESPUESTA = "index.jsp";

	public static Usuario usuario;
	
    /**
     * Default constructor. 
     */
    public ProcesarFormulario() {
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		procesarFormulario(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesarFormulario(request, response);
	}
	
	private void procesarFormulario(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher respuesta = req.getRequestDispatcher(URL_RESPUESTA);
		
		String nombre = req.getParameter("nombre");
		String email = req.getParameter("email");
		String fecha = req.getParameter("fecha");
		String pais = req.getParameter("fecha");
		String notificaciones = req.getParameter("notificaciones");
		
		usuario = new Usuario(nombre,email,fecha,pais,notificaciones);
		req.setAttribute("mostrarTabla", true);
		req.setAttribute("usuario",usuario);
		
		respuesta.forward(req, resp);
	}


}
