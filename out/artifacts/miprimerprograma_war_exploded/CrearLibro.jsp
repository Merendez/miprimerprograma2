<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 06/12/2017
  Time: 08:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear libro</title>
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
    <h2>Libro</h2>
    <form method="get" action="crearLibro" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Nombre del Libro</label>
                <input type="text" name="nombre_libro" placeholder="Nombre del Libro"/>
            </div>
            <div class="col s4">
                <label>Autor</label>
                <input type="text" name="autor" placeholder="Autor"/>
            </div>
            <div class="col s4">
                <label>Editorial</label>
                <input type="text" name="editorial" placeholder="Editorial"/>
            </div>
        </div>
        <div class="row">
            <div class="col s6">
                <label>Año</label>
                <input type="text" name="año" placeholder="Año"/>
            </div>
            <div class="col s6">
                <label>ISBN</label>
                <input type="text" name="ISBN_del_libro" placeholder="ISBN"/>
            </div>
            <div class="col s6">
                <label>Edicion</label>
                <input type="text" name="edicion" placeholder="Edicion"/>
            </div>
        </div>
        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>

