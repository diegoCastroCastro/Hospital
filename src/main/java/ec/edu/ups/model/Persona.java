package ec.edu.ups.model;

import java.io.Serializable;

public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer IDPersona;
	private String cedula;
	private String apellidos;
	private String nombres;
	private String direccion;
	private String telefono;
	private String correo;
	private String rol;
	
	public Persona() {
			
	}

	public Persona(Integer iDPersona, String cedula, String apellidos, String nombres, String direccion, String telefono,
			String correo, String rol) {
		super();
		IDPersona = iDPersona;
		this.cedula = cedula;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.rol = rol;
	}

	public Integer getIDPersona() {
		return IDPersona;
	}

	public void setIDPersona(Integer iDPersona) {
		IDPersona = iDPersona;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	
	@Override
	public String toString() {
		return "Persona [IDPersona=" + IDPersona + ", cedula=" + cedula + ", apellidos=" + apellidos + ", nombres="
				+ nombres + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", rol="
				+ rol + "]";
	}
	

}
