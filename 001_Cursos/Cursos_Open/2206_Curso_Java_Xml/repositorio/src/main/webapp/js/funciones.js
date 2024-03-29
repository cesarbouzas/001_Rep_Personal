function ocultarTabla() {
	$("#tabla-datos-personales").hide();
}

function editarUsuarioXML(usuario) {
	var filaActual = $("#"+usuario).closest("tr"); 
	var nif=filaActual.find("td:eq(0)").text();
    var nombre=filaActual.find("td:eq(1)").text(); 
    var apellidos=filaActual.find("td:eq(2)").text();
    var fechaNacimiento = filaActual.find("td:eq(3)").text();
    var asignatura = filaActual.find("td:eq(4)").text();
    
    $("#editar-usuario-XML").show();
    
    $("#nifXMLAEditar").val(nif);
    $("#nombreXMLAEditar").val(nombre);
    $("#apellidosXMLAEditar").val(apellidos);
    $("#fechaXMLAEditar").val(fechaNacimiento);
    $("#asignaturaXMLEditar > option").text(asignatura);
    
    cerrarVentanaCrearUsuarioXML();
}
function crearUsuario() {
	$("#crear-usuario-XML").show();
	cerrarVentanaEditarUsuarioXML(); 
}

function eliminarUsuarioXML() {
	
}

function cerrarVentanaCrearUsuarioXML() {
	$("#crear-usuario-XML").hide();
}
function cerrarVentanaEditarUsuarioXML() {
	$("#editar-usuario-XML").hide();
}
