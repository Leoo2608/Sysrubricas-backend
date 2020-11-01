package pe.edu.com.sysrubricas.entity;

public class Proyecto {
	private int id_proyecto;
	private String nombre;
	private int id_semestre;
	public Proyecto() {
		super();
	}
	public Proyecto(int id_proyecto, String nombre, int id_semestre) {
		super();
		this.id_proyecto = id_proyecto;
		this.nombre = nombre;
		this.id_semestre = id_semestre;
	}
	public int getId_proyecto() {
		return id_proyecto;
	}
	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_semestre() {
		return id_semestre;
	}
	public void setId_semestre(int id_semestre) {
		this.id_semestre = id_semestre;
	}
	
}


