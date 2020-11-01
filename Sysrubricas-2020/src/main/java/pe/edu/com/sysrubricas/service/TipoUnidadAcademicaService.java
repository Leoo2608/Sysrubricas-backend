package pe.edu.com.sysrubricas.service;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;

public interface TipoUnidadAcademicaService {
	int create(TipoUnidadAcademica t);
	int update(TipoUnidadAcademica t);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
