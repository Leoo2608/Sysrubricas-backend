package pe.edu.com.sysrubricas.entity;

public class Persona {
	 private int idpersona;
	   private String nombres;
	   private String apepat;
	   private String apemat;
	   private String dni;
	   private String telefono;
	   private char estado;
	public Persona() {
		super();
	}
	public Persona(int idpersona, String nombres, String apepat,String apemat, String dni, String telefono, char estado) {
		super();
		this.idpersona = idpersona;
		this.nombres = nombres;
		this.apepat = apepat;
		this.apemat = apemat;
		this.dni = dni;
		this.telefono = telefono;
		this.estado = estado;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApepat() {
		return apepat;
	}
	public void setApepat(String apepat) {
		this.apepat = apepat;
	}
	public String getApemat() {
		return apemat;
	}
	public void setApemat(String apemat) {
		this.apemat = apemat;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
}
