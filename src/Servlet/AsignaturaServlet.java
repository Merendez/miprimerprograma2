package servlet;

import Controlador.ControladorAsignatura;
import include.Asignatura;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AsignaturaServlet", urlPatterns = {"/crearAsignatura"})
public class AsignaturaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Materia</h1>");
        int Clave = 0;
        String Nombre = request.getParameter("nombre_asignatura");
        int Creditos = 0;
        int ClaveCarrera = 0;

        try {
            Clave = Integer.parseInt(request.getParameter("clave_asignatura"));
            Creditos = Integer.parseInt(request.getParameter("creditos"));
            ClaveCarrera = Integer.parseInt(request.getParameter("clave_carrera"));
        } catch (NumberFormatException e){

        }
        out.println(Clave);
        out.println(Nombre);
        out.println(Creditos);
        out.println(ClaveCarrera);
        Asignatura a = new Asignatura
                (Clave,Nombre,Creditos,ClaveCarrera);
        ControladorAsignatura ca = new ControladorAsignatura();
        if(ca.crearAsignatura(a)) {
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
