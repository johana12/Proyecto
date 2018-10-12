package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import email.message;
import email.util;
import entidades.Contacto;


/**
 * Servlet implementation class contactoservlet
 */
@WebServlet("/contactoservlet")
public class contactoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactoservlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre= request.getParameter("nombre");
		String email = request.getParameter("email");
		String sitio= request.getParameter("sitio_web");
		String mensaje= request.getParameter("message");
		
	message mensage = new message();
	mensage.setNombre(nombre);
	mensage.setEmail(email);
	mensage.setSitio(sitio);
	mensage.setMessage(mensaje); 
	
	util u = new util();
	
	boolean bool= u.enviarCorreo(mensage);
		
	request.setAttribute("mensaje", mensaje); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
	
	
	if(bool){
		request.setAttribute("info", "El mensaje se ha enviado correctamente");
		request.getRequestDispatcher("/registro.jsp").forward(request, response);
	}else{
		request.setAttribute("info", "Se ha presentado un error en el envio del formulario");
		request.getRequestDispatcher("/contacto.jsp").forward(request, response);
	}
	
		
		
		
	}

}
