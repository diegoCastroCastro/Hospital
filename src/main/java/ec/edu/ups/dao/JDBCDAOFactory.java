package ec.edu.ups.dao;

import ec.edu.ups.bd.JDBCPersonaDAO;

public class JDBCDAOFactory extends FactoryDAO {

	@Override
	public void createTables() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonaDAO getPersonaDAO() {
		// TODO Auto-generated method stub
		return new JDBCPersonaDAO();
	}

	

}
