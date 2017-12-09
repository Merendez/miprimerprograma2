package servlet;

import Controlador.ControladorAcademia;
import include.Academia;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AcademiaServlet",urlPatterns = {"/crearAcademia"})
public class AcademiaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Academia</h1>");
        int clave_academia = 0;
        String Nombre = request.getParameter("nombre_academia");
        int Docente_RFC = 0;

        try {
            clave_academia = Integer.parseInt(request.getParameter("clave_academia"));
            Docente_RFC = Integer.parseInt(request.getParameter("Rfc del docente"));
        } catch (NumberFormatException e){

        }
        out.println(clave_academia);
        out.println(Nombre);
        out.println(Docente_RFC);
        Academia a = new Academia
                (clave_academia,Nombre,Docente_RFC);
        ControladorAcademia ca = new ControladorAcademia();
        if(ca.crearAcademia(a)) {
            out.println("<p>Materia agregada</p>");
        } else {
            out.println("<p>Materia no agregada</p>");
        }
        //enctype="multipart/form-data"



        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}


