package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.CompetenciaNivel;

public interface CompetenciaNivelDao {
	int create(CompetenciaNivel cn);
	int update(CompetenciaNivel cn);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String,Object> readAll();
}
