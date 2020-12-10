package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Semestre;

public interface SemestreDao {
	int createSemestre(Semestre sm);
	int updateSemestre (Semestre sm);
	int deleteSemestre(int id);
	Map<String, Object> readSemestre(int id);
	Map<String, Object> readAllSemestre();
}
