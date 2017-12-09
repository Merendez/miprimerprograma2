<%--
<%--
  Created by IntelliJ IDEA.
  User: hp lap
  Date: 19/11/17
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear asignatura</title>
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
    <h2>Asignatura</h2>
    <form method="get" action="crearAsignatura" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Clave asignatura</label>
                <input type="text" name="clave_asignatura" placeholder="Clave asignatura"/>
            </div>
            <div class="col s4">
                <label>Nombre de la asignatura</label>
                <input type="text" name="nombre_asignatura" placeholder="Nombre de la asignatura"/>
            </div>
            <div class="col s4">
                <label>Créditos</label>
                <input type="text" name="creditos" placeholder="Créditos"/>
            </div>
        </div>
        <div class="row">
            <div class="col s6">
                <label>Clave carrera</label>
                <input type="text" name="clave_carrera" placeholder="Clave carrera"/>
            </div>
        </div>
        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
