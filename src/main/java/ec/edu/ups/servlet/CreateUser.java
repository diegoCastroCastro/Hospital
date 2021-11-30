package ec.edu.ups.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.FactoryDAO;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.model.Persona;

/**
 * Servlet implementation class CreateSecretaria
 */
@WebServlet("/Usuarios/CreateUser")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonaDAO personaDAO;
	private Persona persona;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUser() {
        persona = new Persona();
        personaDAO = FactoryDAO.getFactoryDAO().getPersonaDAO();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Usuarios/AddUser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url;
		
		try {
			persona.setNombres(request.getParameter("nombres"));
			persona.setApellidos(request.getParameter("apellidos"));
			persona.setCedula(request.getParameter("cedula"));
			persona.setDireccion(request.getParameter("direccion"));
			persona.setTelefono(request.getParameter("telefono"));
			persona.setCorreo(request.getParameter("correo"));
			persona.setRol(request.getParameter("rol"));
			persona.setPassword(request.getParameter("password"));
			
			personaDAO.create(persona);
			
			url = "/index.html";
		} catch (Exception e) {
			url = "/Pacientes/crearCuenta.jsp";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
