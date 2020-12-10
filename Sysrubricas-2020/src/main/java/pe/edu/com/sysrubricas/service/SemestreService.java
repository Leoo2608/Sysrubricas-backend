package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Semestre;

public interface SemestreService {
	int createSemestre(Semestre sm);
	int updateSemestre (Semestre sm);
	int deleteSemestre(int id);
	Map<String, Object> readSemestre(int id);
	Map<String, Object> readAllSemestre();
}
