package ec.edu.ups.model;

import java.io.Serializable;

public class Doctor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idDoctor;
	private Persona idPersona;
	private String passwordDoctor;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(Integer idDoctor, Persona idPersona, String passwordDoctor) {
		super();
		this.idDoctor = idDoctor;
		this.idPersona = idPersona;
		this.passwordDoctor = passwordDoctor;
	}

	public Integer getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(Integer idDoctor) {
		this.idDoctor = idDoctor;
	}

	public Persona getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}

	public String getPasswordDoctor() {
		return passwordDoctor;
	}

	public void setPasswordDoctor(String passwordDoctor) {
		this.passwordDoctor = passwordDoctor;
	}

	@Override
	public String toString() {
		return "Doctor [ idDoctor=" + idDoctor + ", idPersona=" + idPersona + ", passwordDoctor=" + passwordDoctor + "]";
	}
	
	

}
