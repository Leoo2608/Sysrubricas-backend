package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Persona;

public interface PersonaDao {
	int createPersona(Persona p);
	int updatePersona(Persona p);
	Persona readUpdateEvaluador(int id);
	Map<String,Object> deleteEvaluador(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
