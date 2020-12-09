package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Persona;

public interface PersonaService {
	int create(Persona p);
	int update(Persona p);
	int delete(int id);
    Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
