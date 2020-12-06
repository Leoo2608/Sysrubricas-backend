package pe.edu.com.sysrubricas.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.entity.Persona;

@Service
public interface PersonaService {
	int createPersona(Persona p);
	int updatePersona(Persona p);
	Persona readUpdateEvaluador(int id);
	Map<String,Object> deleteEvaluador(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
	
	
}
