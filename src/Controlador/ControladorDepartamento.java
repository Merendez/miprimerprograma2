package Controlador;

import Modelo.ModeloDepartamento;
import include.Departamento;

public class ControladorDepartamento {
    public boolean crearDepartamento(Departamento a) {
        ModeloDepartamento modeloDepartamento = new ModeloDepartamento();
        return modeloDepartamento.crear_departamento(a);
    }

    public String getViewDepartamentos() {
        String htmlcode = "<table class=\"striped\">\n" +
                "\t\t\t\t\t  <thead>\n" +
                "\t\t\t\t\t    <tr>\n" +
                "\t\t\t\t            <th>Nombre del Departamento</th>\n" +
                "\t\t\t\t            <th>Edificio</th>\n" +
                "\t\t\t\t            <th>RFC del Docente</th>\n" +
                "\t\t\t\t\t    </tr>\n" +
                "\t\t\t\t\t  </thead>" +
                "<tbody>";
        ModeloDepartamento modeloDepartamento = new ModeloDepartamento();
        int i =0;

        for (Departamento a : modeloDepartamento.getAllDepartamentos()){
            htmlcode += "<tr>" +
                    "<td>" + a.getNombreDepar() + "</td>" +
                    "<td>" + a.getEdificio() + "</td>" +
                    "<td>" + a.getDocente_RFC() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewDepartamentosCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloDepartamento modeloDepartamento = new ModeloDepartamento();
        int i =0;

        for (Departamento a : modeloDepartamento.getAllDepartamentos()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" + a.getNombreDepar() +
                    "               </span> " +
                    "               <p>" +
                    "                   Edificio: " + a.getEdificio() +
                    "                   <br>RFC del Docente: " + a.getDocente_RFC() +
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