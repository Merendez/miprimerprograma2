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
    <title>Crear academia</title>
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
    <h2>Academia</h2>
    <form method="get" action="crearAcademia" name="frmnuevo" id="frm_nuevo">
        <div class="row">
            <div class="col s4">
                <label>Clave academia</label>
                <input type="text" name="clave_academia" placeholder="Clave academia"/>
            </div>
            <div class="col s4">
                <label>Nombre de la academia</label>
                <input type="text" name="nombre_academia" placeholder="Nombre de la academia"/>
            </div>
            <div class="col s4">
                <label>Rfc del docente</label>
                <input type="text" name="Rfc del docente" placeholder="Rfc del docente"/>
            </div>
        </div>
        <input type="submit" value="Enviar" class="btn"/>
    </form>
</div>

</body>
</html>
