package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.DocenteDao;
import pe.edu.com.sysrubricas.service.DocenteService;
@Service
public class DocenteServiceImp implements DocenteService {
	@Autowired
	private DocenteDao d;
	@Override
	public int create(DocenteService d) {
		return d.create(d);
	}

	@Override
	public int update(DocenteService d) {
		return d.update(d);
	}

	

	@Override
	public Map<String, Object> read(int id) {
		return d.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return d.readAll();
	}

	@Override
	public int delete(int codigo) {
		// TODO Auto-generated method stub
		return d.delete(codigo);
	}

}
