package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.dao.NiveldeLogroDao;
import pe.edu.com.sysrubricas.dao.SemestreDao;
import pe.edu.com.sysrubricas.entity.LineaAcademica;

@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	private NiveldeLogroDao nDao;
	@Test
	void contextLoads() {
		//System.out.println(ld.read(1));
		System.out.println(nDao.readAll());
		//ld.delete(21);
		/*LineaAcademica l = new LineaAcademica();
		l.setNombre("Gestión de TI");
		l.setId_unidad(5);
		System.out.println(ld.create(l));*/
		
	}

}
