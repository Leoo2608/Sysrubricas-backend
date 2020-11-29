package pe.edu.com.sysrubricas.service;

import java.util.Map;


public interface ExpertoEService {
	int create(ExpertoEService e);
	int update(ExpertoEService e);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();

}
