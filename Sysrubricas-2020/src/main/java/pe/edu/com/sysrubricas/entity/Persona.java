package pe.edu.com.sysrubricas.entity;

public class Persona {
	 private int idpersona;
	   private String nombre;
	   private String apellidopat;
	   private String apellidomat;
	   private String dni;
	   private String telefono;
	   private char estado;
	public Persona() {
		super();
	}
	public Persona(int idpersona, String nombre, String apellidopat,String apellidomat, String dni, String telefono, char estado) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellidopat = apellidopat;
		this.apellidomat = apellidomat;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidopat() {
		return apellidopat;
	}
	public void setApellidopat(String apellidopat) {
		this.apellidopat = apellidopat;
	}
	public String getApellidomat() {
		return apellidomat;
	}
	public void setApellidomat(String apellidomat) {
		this.apellidomat = apellidomat;
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
