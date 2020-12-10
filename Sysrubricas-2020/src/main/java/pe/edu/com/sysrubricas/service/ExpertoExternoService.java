package pe.edu.com.sysrubricas.service;

import java.util.Map;



import pe.edu.com.sysrubricas.entity.ExpertoExterno;


public interface ExpertoExternoService {
	int createExpertoExterno(ExpertoExterno exp);
	int updateExpertoExterno(ExpertoExterno exp);
	int deleteExpertoExterno(int id);
	Map<String, Object> readExpertoExterno(int id);
	Map<String,Object> readAllExpertoExterno();
}
