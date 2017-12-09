package servlet;

import Controlador.ControladorLibro;
import include.Libro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LibroServlet", urlPatterns = {"/crearLibro"})
public class LibroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Libro</h1>");
        String NombreLibro = request.getParameter("nombre_libro");
        String Autores = request.getParameter("autor");
        String Editorial = request.getParameter("editorial");
        int Año = 0;
        int ISBN = 0;
        int Edicion = 0;

        try {
            Año= Integer.parseInt(request.getParameter("año"));
            ISBN = Integer.parseInt(request.getParameter("ISBN_del_libro"));
            Edicion = Integer.parseInt(request.getParameter("edicion"));
        } catch (NumberFormatException e){

        }
        out.println(NombreLibro);
        out.println(Autores);
        out.println(Editorial);
        out.println(Año);
        out.println(ISBN);
        out.println(Edicion);
        Libro a = new Libro
                (NombreLibro,Autores,Editorial,Año,ISBN,Edicion);
        ControladorLibro ca = new ControladorLibro();
        if(ca.crearLibro(a)) {
            out.println("<p>Libro agregado</p>");
        } else {
            out.println("<p>Libro no agregado</p>");
        }
        //enctype="multipart/form-data"



        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
