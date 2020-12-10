package pe.edu.com.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.sysrubricas.dao.ProyectoDao;
import pe.edu.com.sysrubricas.entity.Proyecto;
import pe.edu.com.sysrubricas.service.ProyectoService;
@Service
public class ProyectoServiceImp implements ProyectoService {
	@Autowired
	private ProyectoDao proyectoDao;
	@Override
	public int createProyecto(Proyecto pr) {
		// TODO Auto-generated method stub
		return proyectoDao.createProyecto(pr) ;
	}

	@Override
	public int updateProyecto(Proyecto pr) {
		// TODO Auto-generated method stub
		return proyectoDao.updateProyecto(pr);
	}

	@Override
	public int deleteProyecto(int id) {
		// TODO Auto-generated method stub
		return proyectoDao.deleteProyecto(id);
	}

	@Override
	public Map<String, Object> readProyecto(int id) {
		// TODO Auto-generated method stub
		return proyectoDao.readProyecto(id);
	}

	@Override
	public Map<String, Object> readAllProyecto() {
		// TODO Auto-generated method stub
		return proyectoDao.readAllProyecto();
	}

}
