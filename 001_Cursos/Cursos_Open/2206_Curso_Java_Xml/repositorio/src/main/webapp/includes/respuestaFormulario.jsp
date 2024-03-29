<%@page import="clases.Usuario"%>
<%
if(null != request.getAttribute("mostrarTabla")) {
	Usuario usuario = (Usuario) request.getAttribute("usuario");
	String nombre = usuario.getNombre();
	String email = usuario.getEmail();
	String fechaNacimiento = usuario.getFechaNacimiento();
	String pais = usuario.getPais();
	String notificaciones = usuario.getNotificaciones();
%>
<div id="tabla-datos-personales" class="col-md-6 float-left">
<table class="table table-striped">
	<thead>
		<tr>
			<th>Nombre</th>
			<th>Email</th>
			<th>Fecha de Nacimiento</th>
			<th>País</th>
			<th>Notificaciones</th> 
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><%=nombre %></td>
			<td><%=email %></td>
			<td><%=fechaNacimiento %></td>
			<td><%=pais %></td>
			<td><%=notificaciones %></td>
		</tr>
	</tbody>
</table>
	<div class="col-md-12">
		<button class="btn btn-primary float-right" id="ocultar-tabla" name="ocultar-tabla" onclick="ocultarTabla()">Ocultar tabla</button>
	</div>
</div>
<% } %>