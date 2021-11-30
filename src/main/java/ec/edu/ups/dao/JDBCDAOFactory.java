package ec.edu.ups.dao;

import ec.edu.ups.bd.JDBCPersonaDAO;

public class JDBCDAOFactory extends FactoryDAO {

	@Override
	public void createTables() {
		
	}
	
	@Override
	public PersonaDAO getUsuarioDAO() {
		return (PersonaDAO) new JDBCPersonaDAO();
	}

}
