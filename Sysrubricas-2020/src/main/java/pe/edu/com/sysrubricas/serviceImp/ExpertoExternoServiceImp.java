package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.ExpertoExternoDao;
import pe.edu.com.sysrubricas.entity.ExpertoExterno;
import pe.edu.com.sysrubricas.service.ExpertoExternoService;

@Service
public class ExpertoExternoServiceImp implements ExpertoExternoService {
	@Autowired
	private ExpertoExternoDao expertoExternoDao;

	@Override
	public int createExpertoExterno(ExpertoExterno exp) {
		// TODO Auto-generated method stub
		return expertoExternoDao.createExpertoExterno(exp);
	}

	@Override
	public int updateExpertoExterno(ExpertoExterno exp) {
		// TODO Auto-generated method stub
		return expertoExternoDao.updateExpertoExterno(exp);
	}

	@Override
	public int deleteExpertoExterno(int id) {
		// TODO Auto-generated method stub
		return expertoExternoDao.deleteExpertoExterno(id);
	}

	@Override
	public Map<String, Object> readExpertoExterno(int id) {
		// TODO Auto-generated method stub
		return expertoExternoDao.readExpertoExterno(id);
	}

	@Override
	public Map<String, Object> readAllExpertoExterno() {
		// TODO Auto-generated method stub
		return expertoExternoDao.readAllExpertoExterno();
	}
}
