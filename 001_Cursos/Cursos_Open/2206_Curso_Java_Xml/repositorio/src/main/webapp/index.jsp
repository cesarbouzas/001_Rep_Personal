<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<link rel="shortcut icon" type="image/ico" href="images/favicon.ico"/>
<title>Inicio - Tutorial Java Server Page (JSP)</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap-reboot.min.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap-grid.min.css">
</head>
<%@ include file = "includes/header.jsp" %> 
<body>
<div class="wrapper">
	<section class="col-md-12">
		<h1 class="text-center">Tutorial Java XML</h1>
		<div class="col-md-12">
		<h3>¿Qué es XML?</h3>
			<p class="text-justify"> es un lenguaje de marcado similar a HTML. Significa eXtensible Markup Language (Lenguaje de Marcado Extensible) 
			y es una especificación de W3C como lenguaje de marcado de propósito general. </p>
		</div>
		<div class="col-md-6 float-right" >
			<h3>Esquema XML</h3>
			<p class=""></p>
		</div>
		<div class="col-md-6 float-left">
			
		</div>
		<%@ include file = "includes/respuestaFormulario.jsp" %> 
		<div class="col-md-6 float-left">
			<h3>Lectura de ficheros XML</h3>
			<p>[TEXTO EXPLICATIVO XML]</p>
			<div id="error_archivoXML" class="error">Inserta un archivo a procesar, por favor</div>
			<form id="lectura-xml" action="procesarXML" method="post" enctype="multipart/form-data">
				<input type="file" id="archivoXML" name="archivoXML" required="required">
				<input type="button" class="btn btn-primary" value="Enviar" onclick="validarEnvioXML()">
			</form>
		</div>
	</section>
</div>
</body>
<footer class="page-footer font-small blue">
	<div class="footer-copyright text-center py-3">
		2019 Todos los derechos reservados - <a href="https://www.ayesa.com/es/">&reg;OpenWebinars S.A.</a>
	</div>
</footer>
<script src="js/jquery-3.4.1.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript" ></script>
<script src="js/bootstrap.bundle.min.js" type="text/javascript" ></script>
<script src="js/ready.js" type="text/javascript" ></script>
<script src="js/funciones.js" type="text/javascript" ></script>
<script src="js/validar.js" type="text/javascript" ></script>
</html>