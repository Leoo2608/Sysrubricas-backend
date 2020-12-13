package pe.edu.com.sysrubricas.dao;

import java.util.Map;

import pe.edu.com.sysrubricas.entity.Rol;

public interface RolDao {
		int create(Rol r);
		int update(Rol r);
		int delete(int id);
		Map<String, Object> read(int id);
		Map<String, Object> readAll();
}
