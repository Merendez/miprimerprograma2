package Controlador;

import Modelo.ModeloDocente;
import include.Docente;

public class ControladorDocente {
    public boolean crearDocente(Docente a) {
        ModeloDocente modeloDocente = new ModeloDocente();
        return modeloDocente.crear_docente(a);
    }

    public String getViewDocente() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>RFC Docente</th>\n" +
                "\t\t\t\t            <th>Nombre Docente</th>\n" +
                "\t\t\t\t            <th>Apellido paterno</th>\n" +
                "\t\t\t\t            <th>Apellido materno</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloDocente modeloDocente = new ModeloDocente();
        int i =0;

        for (Docente a : modeloDocente.getAllDocente()){
            htmlcode += "<tr>" +
                    "<td>" + a.getRFCDoce() + "</td>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "<td>" + a.getApellido_paterno() + "</td>" +
                    "<td>" + a.getApellido_materno() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewDocenteCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloDocente modeloDocente = new ModeloDocente();
        int i =0;

        for (Docente a : modeloDocente.getAllDocente()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" + a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   RFC Docente: " + a.getRFCDoce() +
                    "                   <br>Apellido paterno: " + a.getApellido_paterno() +
                    "                   <br>Apellido materno: " + a.getApellido_materno() +
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