function validarFormulario() {
	
	var nombre = $("#nombre").val();
	var email = $("#email").val();
	var fechaNacimiento = $("#fechaNacimiento").val();
	var pais = $("#pais").val();
	var notificaciones = $("input[name='notificaciones']:radio").is(':checked');
	var formularioCorrecto = true;
	var textoNotificaciones = "";
	
	if(!validarCampo(nombre)){
		$("#error_nombre").show();
		formularioCorrecto = false;
	}
	if(!validarCampo(email)){
		$("#error_email").show();
		formularioCorrecto = false;
	}
	if(!validarCampo(pais)){
		$("#error_pais").show();
		formularioCorrecto = false;
	}
	if(!notificaciones) {  
		$("#error_notificaciones").show();
		formularioCorrecto = false;
	}
	
	if(formularioCorrecto) {
		$("#formulario_prueba").submit();
	}
}

function validar_dni_nif_nie(value){
	 
	  var caracteresValidos = 'TRWAGMYFPDXBNJZSQVHLCKET';
	  var nifRexp = /^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKET]{1}$/i;
	  var nieRexp = /^[XYZ]{1}[0-9]{7}[TRWAGMYFPDXBNJZSQVHLCKET]{1}$/i;
	  var nif = value.toString().toUpperCase();

	  if (!nifRexp.test(nif) && !nieRexp.test(nif)) return false;

	  var nie = nif
		  .replace(/^[X]/, '0')
		  .replace(/^[Y]/, '1')
		  .replace(/^[Z]/, '2');

	  var letra = str.substr(-1);
	  var indiceCaracteres = parseInt(nie.substr(0, 8)) % 23;

	  if (caracteresValidos.charAt(indiceCaracteres) === letra) return true;

	  return false;
}

function validarCampo(campo){
	switch(campo) {
		case "":
			return false;
		case '0':
			return false;
		default:
			return true;
	}
}

function validarEnvioXML() {
	var archivoXML = $('#lectura-xml input[type=file]').get(0).files.length;
	
	if(archivoXML == 0) {
		$("#error_archivoXML").show();
	} else {
		$("#lectura-xml").submit();
	}
}

function validarCrearUsuario() {
	var nif = $("#nifXML").val();
	var nombre = $("#nombreXML").val();
	var apellidos = $("#apellidosXML").val();
	var fechaNacimiento = $("#fechaXML").val();
	var asignatura = $("#asignaturaXML").val();
	
	if(!validarCampo(nif)){
		$("#error_nif_XML").show();
		formularioCorrecto = false;
	}
	if(!validarCampo(nombre)){
		$("#error_nombre_XML").show();
		formularioCorrecto = false;
	}
	if(!validarCampo(apellidos)){
		$("#error_apellidos_XML").show();
		formularioCorrecto = false;
	}
	if(!validarCampo(fechaNacimiento)){
		$("#error_fecha_XML").show();
		formularioCorrecto = false;
	}
	if(!validarCampo(asignatura)){
		$("#error_asignatura_XML").show();
		formularioCorrecto = false;
	}
	
	if(formularioCorrecto) {
		$("#formulario_crear_usuario_XML").submit();
	} else {
		return false;
	}
}

function validarEditarUsuario() {
	var nif = $("#nifXMLAEditar").val();
	var nombre = $("#nombreXMLAEditar").val();
	var apellidos = $("#apellidosXMLAEditar").val();
	var fechaNacimiento = $("#fechaXMLAEditar").val();
	
	if(!validarCampo(nif)){
		$("#error_nif_XML_editar").show();
		formularioCorrecto = false;
	}
	if(!validarCampo(nombre)){
		$("#error_nombre_XML_editar").show();
		formularioCorrecto = false;
	}
	if(!validarCampo(apellidos)){
		$("#error_apellidos_XML_editar").show();
		formularioCorrecto = false;
	}
	if(!validarCampo(fechaNacimiento)){
		$("#error_fecha_XML_editar").show();
		formularioCorrecto = false;
	}
	
	if(formularioCorrecto) {
		$("#formulario_editar_usuario_XML").submit();
	}
}