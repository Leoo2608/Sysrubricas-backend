package pe.edu.com.sysrubricas.service;
import pe.edu.com.sysrubricas.entity.Semestre;
import java.util.Map;

public interface SemestreService {
	int create(Semestre s);
	int update(Semestre s);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();
}
