package pe.edu.com.sysrubricas.service;

import java.util.Map;

public interface DocenteService {
	int create(DocenteService d);
	int update(DocenteService d);
	int delete(int codigo);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
