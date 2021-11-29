package ec.edu.ups.dao;



public class JDBCDAOFactory extends FactoryDAO {

	@Override
	public void createTables() {
		
	}
	
	@Override
	public PersonaDAO getUsuarioDAO() {
		return new JDBCPersonaDAO();
	}

}
