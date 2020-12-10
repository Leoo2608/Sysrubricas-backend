package pe.edu.com.sysrubricas.service;

import java.util.Map;



import pe.edu.com.sysrubricas.entity.Persona;


public interface PersonaService {
	int createPersona (Persona p);
	int updatePersona (Persona p);
	int deletePersona(int id);
	Map<String, Object> readPersona(int id);
	Map<String, Object> readAllPersona();
	
	
}
