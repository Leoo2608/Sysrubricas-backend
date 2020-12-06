package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.EvaluadorDao;
import pe.edu.com.sysrubricas.entity.Evaluador;
import pe.edu.com.sysrubricas.service.EvaluadorService;
@Service

public class EvaluadorServiceImp implements EvaluadorService {
	@Autowired
	private EvaluadorDao evaluadorDao;
	@Override
	public int createEvaluador(Evaluador ev) {
		// TODO Auto-generated method stub
		return evaluadorDao.createEvaluador(ev);
	}

	@Override
	public int updateEvaluador(Evaluador ev) {
		// TODO Auto-generated method stub
		return evaluadorDao.updateEvaluador(ev);
	}

	@Override
	public Evaluador readUpdateEvaluador(int id) {
		// TODO Auto-generated method stub
		return evaluadorDao.readUpdateEvaluador(id);
	}

	@Override
	public Map<String, Object> deleteEvaluador(int id) {
		// TODO Auto-generated method stub
		return evaluadorDao.deleteEvaluador(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return evaluadorDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return evaluadorDao.readAll();
	}

}
