package servlet;

import Controlador.ControladorInstituto;
import include.Instituto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InstitutoServlet", urlPatterns = {"/crearInstituto"})
public class InstitutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Instituto</h1>");
        String ClaveInst = request.getParameter("clave_instituto");
        String NombreInst = request.getParameter("nombre_instituto");
        String DireccionInst = request.getParameter("direccion_instituto");

        try {

        } catch (NumberFormatException e){

        }
        out.println(ClaveInst);
        out.println(NombreInst);
        out.println(DireccionInst);
        Instituto a = new Instituto
                (ClaveInst,NombreInst,DireccionInst);
        ControladorInstituto ca = new ControladorInstituto();
        if(ca.crearInstituto(a)) {
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