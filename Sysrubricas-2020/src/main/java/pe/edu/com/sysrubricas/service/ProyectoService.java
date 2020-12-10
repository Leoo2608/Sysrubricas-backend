package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Proyecto;

public interface ProyectoService {
	int createProyecto (Proyecto pr);
	int updateProyecto (Proyecto pr);
	int deleteProyecto(int id);
	Map<String, Object> readProyecto(int id);
	Map<String, Object> readAllProyecto();
}
