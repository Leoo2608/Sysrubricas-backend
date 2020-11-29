package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.ExpertoEDao;
import pe.edu.com.sysrubricas.service.ExpertoEService;
@Service
public class ExpertoEServiceImp implements ExpertoEService{
	@Autowired
	private ExpertoEDao e;
	@Override
	
	public int create(ExpertoEService e) {
		
		return e.create(e);
	}

	@Override
	public int update(ExpertoEService e) {
		
		return e.update(e);
	}

	@Override
	public int delete(int id) {
		
		return e.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return e.readAll();
	}

	@Override
	public Map<String, Object> readAll() {
		return e.readAll();
	}

}
