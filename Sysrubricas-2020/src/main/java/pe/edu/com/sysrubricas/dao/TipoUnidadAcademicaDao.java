package pe.edu.com.sysrubricas.dao;
import java.util.Map;

import pe.edu.com.sysrubricas.entity.LineaAcademica;
import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;

public interface TipoUnidadAcademicaDao {
	int create(TipoUnidadAcademica t);
	int update(TipoUnidadAcademica t);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
	
}
