package pe.edu.com.sysrubricas.entity;

public class ExpertoExterno {
 private int id_experto;
 private int id_persona;
 private int estado;
public ExpertoExterno() {
	super();
}
public ExpertoExterno(int id_experto, int id_persona, int estado) {
	super();
	this.id_experto = id_experto;
	this.id_persona = id_persona;
	this.estado = estado;
}
public int getId_experto() {
	return id_experto;
}
public void setId_experto(int id_experto) {
	this.id_experto = id_experto;
}
public int getId_persona() {
	return id_persona;
}
public void setId_persona(int id_persona) {
	this.id_persona = id_persona;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}
}
