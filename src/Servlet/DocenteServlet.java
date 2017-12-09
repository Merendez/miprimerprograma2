package servlet;

        import Controlador.ControladorDocente;
        import include.Docente;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;

@WebServlet(name = "DocenteServlet", urlPatterns = {"/crearDocente"})
public class DocenteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out =response.getWriter();
        out.println("<h1>Docente</h1>");
        int RFCDoce = 0;
        String Nombre = request.getParameter("Nombre");
        String Apellido_paterno = request.getParameter("Apellido_paterno");
        String Apellido_materno = request.getParameter("Apellido_materno");

        try {
            RFCDoce = Integer.parseInt(request.getParameter("RFCDoce"));
        } catch (NumberFormatException e){

        }
        out.println(RFCDoce);
        out.println(Nombre);
        out.println(Apellido_paterno);
        out.println(Apellido_materno);
        Docente a = new Docente
                (RFCDoce,Nombre,Apellido_paterno,Apellido_materno);
        ControladorDocente ca = new ControladorDocente();
        if(ca.crearDocente(a)) {
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
