package Controlador;

import Modelo.ModeloAsignatura;
import include.Asignatura;


public class ControladorAsignatura {
    public boolean crearAsignatura(Asignatura a) {
        ModeloAsignatura modeloAsignatura = new ModeloAsignatura();
        return modeloAsignatura.crear_asignatura(a);
    }

    public String getViewAsignaturas() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Clave</th>\n" +
                "\t\t\t\t            <th>Nombre Asignatura</th>\n" +
                "\t\t\t\t            <th>Creditos</th>\n" +
                "\t\t\t\t            <th>Clave de la carrera</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloAsignatura modeloAsignatura = new ModeloAsignatura();
        int i =0;

        for (Asignatura a : modeloAsignatura.getAllAsignaturas()){
            htmlcode += "<tr>" +
                    "<td>" + a.getClave() + "</td>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "<td>" + a.getCreditos() + "</td>" +
                    "<td>" + a.getClaveCarrera() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewAsignaturasCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloAsignatura modeloAsignatura = new ModeloAsignatura();
        int i =0;

        for (Asignatura a : modeloAsignatura.getAllAsignaturas()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" + a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   Clave Asignatura: " + a.getClave() +
                    "                   <br>Creditos: " + a.getCreditos() +
                    "                   <br>Clave carrera: " + a.getClaveCarrera() +
                    "               </p>"+
                    "           </div>\n" +
                    "       <div class=\"card-action\">\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "       </div>\n" +
                    "       </div>\n" +
                    "   </div>\n";
        }
        htmlcode += "" +
                "      </div>";
        return htmlcode;
    }
}

