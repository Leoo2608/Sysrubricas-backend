package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Docente;

public interface DocenteDao {
	int create(Docente d);
	int update(Docente d);
	Docente delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();

}
