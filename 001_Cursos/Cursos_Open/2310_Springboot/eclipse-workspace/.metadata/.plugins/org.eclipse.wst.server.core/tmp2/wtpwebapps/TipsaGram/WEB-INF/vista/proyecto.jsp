
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/typsa.css">
</head>
<body>
    <div class="container">
        <h1>Proyecto Guardado</h1>
        <p>Nombre del Proyecto: ${proyecto.nombre}</p>
        <p>Organismo: ${proyecto.organismo}</p>
        <p>Descripción del Proyecto: ${proyecto.descripcion}</p>
    </div>
</body>
</html>