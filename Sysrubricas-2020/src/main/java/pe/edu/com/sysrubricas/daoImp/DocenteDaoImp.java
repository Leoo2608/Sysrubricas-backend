package pe.edu.com.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import pe.edu.com.sysrubricas.dao.DocenteDao;
import pe.edu.com.sysrubricas.entity.Docente;
@Component
public class DocenteDaoImp implements DocenteDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Docente d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Docente d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Docente delete(int id) {
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
