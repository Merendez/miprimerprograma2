<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 28/11/2017
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear docente</title>
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
    <h2>Docente</h2>
    <form method="get" action="crearDocente" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>RFC del Docente</label>
                <input type="text" name="RFCDoce" placeholder="RFC del Docente"/>
            </div>
            <div class="col s4">
                <label>Nombre del Docente</label>
                <input type="text" name="Nombre" placeholder="Nombre del Docente"/>
            </div>
            <div class="col s4">
                <label>Apellido paterno</label>
                <input type="text" name="Apellido_paterno" placeholder="Apellido paterno"/>
            </div>
        </div>
        <div class="row">
            <div class="col s6">
                <label>Apellido materno</label>
                <input type="text" name="Apellido_materno" placeholder="Apellido materno"/>
            </div>
        </div>
        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
