package Controlador;

import Modelo.ModeloCarrera;
import include.Carrera;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControladorCarrera {
    public boolean crearCarrera(Carrera a) {
        ModeloCarrera modeloCarrera = new ModeloCarrera();
        return modeloCarrera.crear_carrera(a);
    }

    public String getViewCarreras() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Clave de la Carrera</th>\n" +
                "\t\t\t\t            <th>Nombre de la Carrera</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloCarrera modeloCarrera = new ModeloCarrera();
        int i =0;

        for (Carrera a : modeloCarrera.getAllCarreras()){
            htmlcode += "<tr>" +
                    "<td>" + a.getClaveCarre() + "</td>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewCarrerasCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloCarrera modeloCarrera = new ModeloCarrera();
        int i =0;

        for (Carrera a : modeloCarrera.getAllCarreras()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" + a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   Clave de la Carrera: " + a.getClaveCarre() +
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