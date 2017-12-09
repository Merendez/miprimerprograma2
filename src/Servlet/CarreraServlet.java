package servlet;

import Controlador.ControladorCarrera;
import include.Carrera;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CarreraServlet",urlPatterns = {"/crearCarrera"})
public class CarreraServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Carrera</h1>");
        int ClaveCarre = 0;
        String Nombre = request.getParameter("nombre_carrera");

        try {
            ClaveCarre = Integer.parseInt(request.getParameter("clave_carrera"));
        } catch (NumberFormatException e){

        }
        out.println(ClaveCarre);
        out.println(Nombre);
        Carrera a = new Carrera
                (ClaveCarre,Nombre);
        ControladorCarrera ca = new ControladorCarrera();
        if(ca.crearCarrera(a)) {
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