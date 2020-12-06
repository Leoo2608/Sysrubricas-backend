package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.PersonaDao;
import pe.edu.com.sysrubricas.entity.Persona;
import pe.edu.com.sysrubricas.service.PersonaService;
@Service

public class PersonaServiceImp implements PersonaService {
	@Autowired
	private PersonaDao personDao;

	@Override
	public int createPersona(Persona p) {
		// TODO Auto-generated method stub
		return personDao.createPersona(p);
	}

	@Override
	public int updatePersona(Persona p) {
		// TODO Auto-generated method stub
		return personDao.updatePersona(p);
	}

	@Override
	public Persona readUpdateEvaluador(int id) {
		// TODO Auto-generated method stub
		return personDao.readUpdateEvaluador(id);
	}

	@Override
	public Map<String, Object> deleteEvaluador(int id) {
		// TODO Auto-generated method stub
		return personDao.deleteEvaluador(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return personDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return personDao.readAll();
	}
	

}
