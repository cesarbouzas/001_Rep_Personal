<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
    <%@page import="java.util.*,
    		java.text.*,
    	clases.UsuarioXML"%>
<%
	String nombreDocumento = (String) request.getAttribute("nombreDocumento");
	String fechaDocumento = (String) request.getAttribute("fechaDocumento");
	List<UsuarioXML> usuarios = (List<UsuarioXML>) request.getAttribute("usuarios");
	String nifUsuario = "";
	String nombreUsuario = "";
	String apellidosUsuario = "";
	String fechaNacimientoUsuario = "";
	String asignaturaUsuario = "";
	SimpleDateFormat formatoFecha= new SimpleDateFormat("dd/MM/yyyy");  
	Date fechaActual = new Date(System.currentTimeMillis());  
	String fechaActualFormateada = formatoFecha.format(fechaActual);
	if(null != request.getParameter("btnEditar")) {
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link rel="shortcut icon" type="image/ico" href="images/favicon.ico"/>
<title>Lectura XML - Tutorial de Java Server Page</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap-reboot.min.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap-grid.min.css">

</head>
<%@ include file = "includes/header.jsp" %> 
<body>
<div class="wrapper">
	<div class="col-md-12">
		<h2>Procesamiento de archivos XML</h2>
		<div class="col-md-6 float-left">
		<p>Nombre documento: <strong><%=nombreDocumento %></strong></p>
		<p>Fecha documento: <strong><%=fechaDocumento %></strong></p>
		<p>Fecha actual: <strong><%=fechaActualFormateada %></strong></p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Nif</th>
						<th>Nombre</th>
						<th>Apellidos</th>
						<th>Fecha de nacimiento</th>
						<th>Asignatura</th>
						<th>Opción</th>
					</tr>
				</thead>
				<tbody>
					<% 
					for(UsuarioXML usuario: usuarios)
					{
						nifUsuario = usuario.getNif();
						nombreUsuario = usuario.getNombre();
						apellidosUsuario = usuario.getApellidos();
						fechaNacimientoUsuario = usuario.getFechaNacimiento();
						asignaturaUsuario = usuario.getAsignatura();
					%>
					<tr id="<%=nifUsuario %>">
						<td><%=nifUsuario %></td>
						<td><%=nombreUsuario %></td>
						<td><%=apellidosUsuario %></td>
						<td><%=fechaNacimientoUsuario %></td>
						<td><%=asignaturaUsuario %></td>
						<td><a href="#" onclick="editarUsuarioXML('<%=nifUsuario %>');" title="Editar"><i class="fas 2x fa-edit"></i></a> 
						<a href="#" onclick="eliminarUsuarioXML('<%=nifUsuario %>');"><i class="fas 2x fa-trash-alt"></i></a></td>
					</tr>
			 		<% 
			 		} 
			 		%>
			 		<%usuarios.clear(); %>
				</tbody>
		 	</table>
		 	<p><button id="crear_usuario" name="crear_usuario" class="btn btn-primary float-right" onclick="crearUsuario();">Crear usuario</button></p>
	 	</div>
	 	<div id="crear-usuario-XML" class="col-md-6 float-left">
	 		<h2>Crear usuario</h2>
	 			<form id="formulario_crear_usuario_XML" action="crearEntradaXML" method="post" class="col-md-6">
		 			<div class="form-group">
			 			<label for="usuario">Nif (*)</label>
			 			<div id="error_nif_XML" class="error">El campo nif no puede estar vacío</div>
			 			<input type="text" class="form-control" id="nifXML" name="nifXML" placeholder="Introduzca nif, por favor">
			 		</div>
			 		<div class="form-group">
			 			<label for="usuario">Nombre (*)</label>
			 			<div id="error_nombre_XML" class="error">El campo nombre no puede estar vacío</div>
			 			<input type="text" class="form-control" id="nombreXML" name="nombreXML" placeholder="Introduzca nombre, por favor">
			 		</div>
			 		<div class="form-group">
			 			<label for="usuario">Apellidos (*)</label>
			 			<div id="error_apellidos_XML" class="error">El campo apellidos no puede estar vacío</div>
			 			<input type="text" class="form-control" id="apellidosXML" name="apellidosXML" placeholder="Introduzca apellidos, por favor">
			 		</div>
			 		<div class="form-group">
			 			<label for="usuario">Fecha de nacimiento (*)</label>
			 			<div id="error_fecha_XML" class="error">El campo fecha no puede estar vacío</div>
			 			<input type="text" class="form-control" id="fechaXML" name="fechaXML" onfocus="(this.type='date')" placeholder="Introduzca apellidos, por favor">
			 		</div>
			 		<div class="form-group">
			 			<label for="usuario">Asignatura (*)</label>
			 			<div id="error_asignatura_XML" class="error">El campo asignatura no puede estar vacío</div>
			 			<select id="asignaturaXML" name="asignaturaXML" class="form-control">
			 				<option value="0">Seleccione asignatura a cursar, por favor</option>
			 				<option value="Kotlin">Kotlin</option>
			 				<option value="PHP">PHP</option>
			 				<option value="Java">Java</option>
			 			</select>
			 		</div>
			 		<div class="form-group">
			 			
			 			<input type="button" class="btn btn-secondary col-md-5 float-left" value="Cerrar" title="Cerrar" onclick="cerrarVentanaCrearUsuarioXML();">
			 			<input type="submit" class="btn btn-primary col-md-5 float-right" id="btnCrear" name="btnCrear" value="Crear" onclick=" return validarCrearUsuario()" title="Editar">
			 		</div>
	 			</form>
	 	</div>
	 	<div id="editar-usuario-XML" class="col-md-6 float-right">
	 		<h2>Editar usuario</h2>
	 			<form id="formulario_editar_usuario_XML" action="crearEntradaXML" method="post" class="col-md-6">
		 			<div class="form-group">
		 				<div id="error_nif_XML_editar" class="error">El campo nif a editar no puede estar vacío</div>
			 			<label for="usuario">Nif (*)</label>
			 			<input type="text" class="form-control" id="nifXMLAEditar" name="nifXMLAEditar" placeholder="Introduzca nif, por favor">
			 		</div>
			 		<div class="form-group">
			 			<div id="error_nombre_XML_editar" class="error">El campo nombre a editar no puede estar vacío</div>
			 			<label for="usuario">Nombre (*)</label>
			 			<input type="text" class="form-control" id="nombreXMLAEditar" name="nombreXMLAEditar" placeholder="Introduzca nombre, por favor">
			 		</div>
			 		<div class="form-group">
			 			<div id="error_apellidos_XML_editar" class="error">El campo apellidos a editar no puede estar vacío</div>
			 			<label for="usuario">Apellidos (*)</label>
			 			<input type="text" class="form-control" id="apellidosXMLAEditar" name="apellidosXMLAEditar" placeholder="Introduzca apellidos, por favor">
			 		</div>
			 		<div class="form-group">
			 			<div id="error_fecha_XML_editar" class="error">El campo fecha a editar no puede estar vacío</div>
			 			<label for="usuario">Fecha de nacimiento (*)</label>
			 			<input type="text" class="form-control" id="fechaXMLAEditar" name="fechaXMLAEditar" onfocus="(this.type='date')" placeholder="Introduzca fecha, por favor">
			 		</div>
			 		<div class="form-group">
			 			<label for="usuario">Asignatura (*)</label>
			 			<select id="asignaturaXMLEditar" name="asignaturaXMLEditar" class="form-control">
			 				<option value="0">Seleccione asignatura a cursar, por favor</option>
			 				<option value="1">Kotlin</option>
			 				<option value="2">PHP</option>
			 				<option value="3">Java</option>
			 			</select>
			 		</div>
			 		<div class="form-group">
			 			<input type="reset" class="btn btn-secondary col-md-5 float-left" value="Cerrar" title="Cerrar"  onclick="cerrarVentanaEditarUsuarioXML();">
			 			<input type="submit" class="btn btn-primary col-md-5 float-right" id="btnEditar" name="btnEditar" value="Editar" onclick="validarEditarUsuario()" title="Editar usuario">
			 		</div>
	 			</form>
	 	</div>
	</div>
</div>
</body>
<footer class="page-footer font-small blue">
  <div class="footer-copyright text-center py-3">© 2019 Todos los derechos reservados - <a href="https://www.ayesa.com/es/">OpenWebinars</a>
  </div>
</footer>
<script src="js/jquery-3.4.1.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript" ></script>
<script src="js/bootstrap.bundle.min.js" type="text/javascript" ></script>
<script src="js/ready.js" type="text/javascript" ></script>
<script src="js/funciones.js" type="text/javascript" ></script>
<script src="js/validar.js" type="text/javascript" ></script>
<script src="https://kit.fontawesome.com/6f99a42d72.js"></script>
<!-- Footer -->
</html>