package pe.edu.com.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import pe.edu.com.sysrubricas.dao.PersonaDao;
import pe.edu.com.sysrubricas.entity.Persona;
@Component
public class PersonaDaoImp implements PersonaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int createPersona(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePersona(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Persona readUpdateEvaluador(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteEvaluador(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
