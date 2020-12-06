package pe.edu.com.sysrubricas.service;

import java.util.Map;



import pe.edu.com.sysrubricas.entity.Evaluador;


public interface EvaluadorService {
	int createEvaluador(Evaluador ev);
	int updateEvaluador(Evaluador ev);
	Evaluador readUpdateEvaluador(int id);
	Map<String,Object> deleteEvaluador(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
