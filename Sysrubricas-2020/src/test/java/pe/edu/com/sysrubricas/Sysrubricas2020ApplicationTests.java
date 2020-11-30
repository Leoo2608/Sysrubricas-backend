package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.dao.TipoUnidadAcademicaDao;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.LineaAcademica;
import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;
import pe.edu.com.sysrubricas.entity.UnidadAcademica;

@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	private UnidadAcademicaDao t;
	@Test
	void contextLoads() {
		
		
		System.out.println(t.readCampus("Lima"));


	}

}
