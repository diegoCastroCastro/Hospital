package ec.edu.ups.model;

import java.io.Serializable;

public class Secretaria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idSecretaria;
	private Integer anosExperencia;
	private Persona idPersona;
	
	public Secretaria() {
	}

	public Secretaria(Integer idSecretaria, Integer anosExperencia, Persona idPersona) {
		super();
		this.idSecretaria = idSecretaria;
		this.anosExperencia = anosExperencia;
		this.idPersona = idPersona;
	}


	public Integer getIdSecretaria() {
		return idSecretaria;
	}


	public void setIdSecretaria(Integer idSecretaria) {
		this.idSecretaria = idSecretaria;
	}


	public Integer getAnosExperencia() {
		return anosExperencia;
	}


	public void setAnosExperencia(Integer anosExperencia) {
		this.anosExperencia = anosExperencia;
	}


	public Persona getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "Secretaria [idSecretaria=" + idSecretaria + ", anosExperencia=" + anosExperencia + ", idPersona="
				+ idPersona + "]";
	}
	
}
