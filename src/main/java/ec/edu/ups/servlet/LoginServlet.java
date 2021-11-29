package ec.edu.ups.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.dao.FactoryDAO;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.model.Paciente;
import ec.edu.ups.model.Persona;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Persona persona;
	private PersonaDAO personaDAO;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
    	
    	personaDAO = FactoryDAO.getFactoryDAO().getUsuarioDAO();
    	persona = new Persona();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("email");
		String password = request.getParameter("password");
		
		StringBuilder errores = new StringBuilder();
		
		if (usuario.isEmpty()) {
			errores.append("<li>Falta Usuario/Correo</li>");
		} 
		if (password.isEmpty()) {
			errores.append("<li>Falta Contraseña</li>");
		}
		
		persona.setCorreo(usuario);
		persona.setPassword(password);
		
		System.out.println("VALORES PASADOS" + persona.toString());
		
		Persona p = personaDAO.login(persona);
		if (p != null) {
			HttpSession session = request.getSession(true);
			
			session.setAttribute("persona", persona.getNombres());
			session.setAttribute("cedula", persona.getCedula());
			
			System.out.println("sesion TRUE");
			String cedu = persona.getCedula();
			
			request.getSession(true).setAttribute("persona", p.getNombres());
			request.getSession(true).setAttribute("cedula", p.getCedula());
			request.setAttribute("peticion", "Conectado...");
			
			RequestDispatcher d = getServletContext().getRequestDispatcher("/Pacientes/homePaciente.jsp");
			d.forward(request, response);
			
			
		}else {
			HttpSession session = request.getSession(false);
			System.out.println("sesion FALSE");
			RequestDispatcher d = getServletContext().getRequestDispatcher("/public/error.jsp");
			d.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String usuario = request.getParameter("email");
		String password = request.getParameter("password");
		
		persona.setCorreo(usuario);
		persona.setPassword(password);
		
		System.out.println("VALORES PASADOS DES >" + usuario.toString());
		Persona p = personaDAO.login(persona);
		
		if (p != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("persona", persona.getNombres());
			session.setAttribute("password", persona.getCedula());
			System.out.println("sesion TRUE");
			
			RequestDispatcher d = getServletContext().getRequestDispatcher("/Pacientes/homePaciente.jsp");
			d.forward(request, response);
			
		} else {
			HttpSession session = request.getSession(false);
			System.out.println("sesion FALSE");
			RequestDispatcher d = getServletContext().getRequestDispatcher("/public/error.jsp");
			d.forward(request, response);
		}
		
		
		
		
	}

}
