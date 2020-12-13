package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.PersonaDao;
import pe.edu.com.sysrubricas.entity.Persona;
import pe.edu.com.sysrubricas.service.PersonaService;
@Service
public class PersonaServiceImp implements PersonaService{
	 @Autowired
	    private PersonaDao perdao;
		@Override
		public int create(Persona p) {
			return perdao.create(p);
		}

		@Override
		public int update(Persona p) {
			return perdao.update(p);
		}

		@Override
		public int delete(int id) {
			return perdao.delete(id);
		}

		@Override
		public Map<String, Object> read(int id) {
			return perdao.read(id);
		}

		@Override
		public Map<String, Object> readAll() {
			return perdao.readAll();
		}

}
