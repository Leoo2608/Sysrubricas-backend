package pe.edu.com.sysrubricas.entity;

public class Persona {
	private int id_persona;
	private String nombres;
	private String ape_pat;
	private String ape_mat;
	private String dni;
	private String telefono;
	private int estado;
	public Persona() {
		super();
	}
	public Persona(int id_persona, String nombres, String ape_pat, String ape_mat, String dni, String telefono,
			int estado) {
		super();
		this.id_persona = id_persona;
		this.nombres = nombres;
		this.ape_pat = ape_pat;
		this.ape_mat = ape_mat;
		this.dni = dni;
		this.telefono = telefono;
		this.estado = estado;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApe_pat() {
		return ape_pat;
	}
	public void setApe_pat(String ape_pat) {
		this.ape_pat = ape_pat;
	}
	public String getApe_mat() {
		return ape_mat;
	}
	public void setApe_mat(String ape_mat) {
		this.ape_mat = ape_mat;
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
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
