package pe.edu.com.sysrubricas.entity;

public class LineaAcademica {
	private int id_linea;
	private String nombre;
	private int id_unidad;
	private char estado;
	public LineaAcademica() {
		super();
	}
	public LineaAcademica(int id_linea, String nombre, int id_unidad, char estado) {
		super();
		this.id_linea = id_linea;
		this.nombre = nombre;
		this.id_unidad = id_unidad;
		this.estado = estado;
	}
	public int getId_linea() {
		return id_linea;
	}
	public void setId_linea(int id_linea) {
		this.id_linea = id_linea;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_unidad() {
		return id_unidad;
	}
	public void setId_unidad(int id_unidad) {
		this.id_unidad = id_unidad;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
}
