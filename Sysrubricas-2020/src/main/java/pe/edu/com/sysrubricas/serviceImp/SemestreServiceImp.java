package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.SemestreDao;
import pe.edu.com.sysrubricas.entity.Semestre;
import pe.edu.com.sysrubricas.service.SemestreService;
@Service
public class SemestreServiceImp implements SemestreService {
	@Autowired
	private SemestreDao semestreDao;
	@Override
	public int createSemestre(Semestre sm) {
		// TODO Auto-generated method stub
		return semestreDao.createSemestre(sm);
	}

	@Override
	public int updateSemestre(Semestre sm) {
		// TODO Auto-generated method stub
		return semestreDao.updateSemestre(sm);
	}

	@Override
	public int deleteSemestre(int id) {
		// TODO Auto-generated method stub
		return semestreDao.deleteSemestre(id);
	}

	@Override
	public Map<String, Object> readSemestre(int id) {
		// TODO Auto-generated method stub
		return semestreDao.readSemestre(id);
	}

	@Override
	public Map<String, Object> readAllSemestre() {
		// TODO Auto-generated method stub
		return semestreDao.readAllSemestre();
	}

}
