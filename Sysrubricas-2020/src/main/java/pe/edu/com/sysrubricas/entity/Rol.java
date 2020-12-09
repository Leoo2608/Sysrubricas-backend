package pe.edu.com.sysrubricas.entity;

public class Rol {
	private int idrol;
	private String nombre;
	private char estado;
	public Rol() {
		super();
	}
	public Rol(int idrol, String nombre, char estado) {
		super();
		this.idrol = idrol;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	
}
