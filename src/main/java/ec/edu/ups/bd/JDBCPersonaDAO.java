package ec.edu.ups.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import ec.edu.ups.model.Persona;

public class JDBCPersonaDAO extends JDBCGenericDAO<Persona, Integer>  	  {

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Persona entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Persona entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Persona entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona login(Persona persona) {
		
		Persona p = null;
		ResultSet rs = connection.query("SELECT * FROM Persona  where correo ='" + persona.getCorreo()
				+ "' and password ='" + persona.getPassword() + "'");


		try {
			if (rs != null && rs.next()) {
				p = new Persona(null, rs.getString("cedula"), rs.getString("apellidos"), rs.getString("nombres"), rs.getString("direccion"), rs.getString("telefono"), rs.getString("correo"), null, rs.getString("password"));
				System.out.println("Usuario> " + p.toString());

			} else {
				System.out.println("no existe el usurio");
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("ERROR DE resultados" + e.getMessage());
			return null;
		}
		return p;
	}

	@Override
	public List<Persona> find() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
