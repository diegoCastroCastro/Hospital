package ec.edu.ups.model;

import java.io.Serializable;

public class Paciente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer idPaciente;
	private String enfermedade;
	private Persona idPersona;
	
	public Paciente() {
		
	}
	
	public Paciente(Integer idPaciente, String enfermedade, Persona idPersona) {
		super();
		this.idPaciente = idPaciente;
		this.enfermedade = enfermedade;
		this.idPersona = idPersona;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getEnfermedade() {
		return enfermedade;
	}

	public void setEnfermedade(String enfermedade) {
		this.enfermedade = enfermedade;
	}

	public Persona getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", enfermedade=" + enfermedade + ", idPersona=" + idPersona + "]";
	}
	
	
	
	
	
	
	
	
	

}
