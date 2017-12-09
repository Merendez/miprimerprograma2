<%--
  Created by IntelliJ IDEA.
  User: Pablo
  Date: 05/12/2017
  Time: 01:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear instituto</title>
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
    <h2>Instituto</h2>
    <form method="get" action="crearInstituto" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Clave Instituto</label>
                <input type="text" name="clave_instituto" placeholder="Clave Instituto"/>
            </div>
            <div class="col s4">
                <label>Nombre del Instituto</label>
                <input type="text" name="nombre_instituto" placeholder="Nombre del Instituto"/>
            </div>
            <div class="col s4">
                <label>Direccion del Instituto</label>
                <input type="text" name="direccion_instituto" placeholder="Direccion del Instituto"/>
            </div>
        </div>
        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>

