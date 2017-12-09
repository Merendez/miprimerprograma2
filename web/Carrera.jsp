<%@ page import="Controlador.ControladorCarrera" %><%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 23/11/2017
  Time: 08:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear carrera</title>
    <link href="css/materialize.min.css" rel="stylesheet">
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
<div class="container">
    <h2>Carrera</h2>
    <%ControladorCarrera cp = new ControladorCarrera();%>
    <%= cp.getViewCarrerasCards()%>
</div>
</body>
</html>

