package Controlador;

import Modelo.ModeloCicloEscolar;
import include.CicloEscolar;

public class ControladorCicloEscolar {

    public boolean crearCicloEscolar(CicloEscolar a) {
        ModeloCicloEscolar modeloAsignatura = new ModeloCicloEscolar();
        return modeloAsignatura.crear_cicloescolar(a);
    }

    public String getViewCicloEscolar() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t          \t<th>Clave Ciclo</th>\n" +
                "\t\t\t\t            <th>Nombre CicloEscolar</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloCicloEscolar modeloCicloEscolar = new ModeloCicloEscolar();
        int i =0;

        for (CicloEscolar a : modeloCicloEscolar.getAllCicloEscolar()){
            htmlcode += "<tr>" +
                    "<td>" + a.getClaveCiclo() + "</td>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewCicloEscolarCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloCicloEscolar modeloCicloEscolar = new ModeloCicloEscolar();
        int i =0;

        for (CicloEscolar a : modeloCicloEscolar.getAllCicloEscolar()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" + a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   Clave Asignatura: " + a.getClaveCiclo() +
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
