package servlet;

import Controlador.ControladorDepartamento;
import include.Departamento;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DepartamentoServlet", urlPatterns = {"/crearDepartamento"})
public class DepartamentoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Departamento</h1>");
        String NombreDepar = request.getParameter("nombre_departamento");
        int Edificio = 0;
        int Docente_RFC = 0;

        try {
            Edificio = Integer.parseInt(request.getParameter("edificio"));
            Docente_RFC = Integer.parseInt(request.getParameter("docente_rfc"));
        } catch (NumberFormatException e){

        }
        out.println(NombreDepar);
        out.println(Edificio);
        out.println(Docente_RFC);
        Departamento a = new Departamento
                (NombreDepar,Edificio,Docente_RFC);
        ControladorDepartamento ca = new ControladorDepartamento();
        if(ca.crearDepartamento(a)) {
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