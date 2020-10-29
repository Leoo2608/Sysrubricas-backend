package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.entity.LineaAcademica;

@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	private LineaAcademicaDao ld;
	@Test
	void contextLoads() {
		System.out.println(ld.read(1));
	}

}
