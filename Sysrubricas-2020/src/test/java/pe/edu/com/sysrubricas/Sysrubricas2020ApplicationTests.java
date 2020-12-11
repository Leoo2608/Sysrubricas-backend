package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.CompetenciaCursoDao;
import pe.edu.com.sysrubricas.dao.Curso_planDao;


@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	private CompetenciaCursoDao ccdao;
	@Autowired
	private Curso_planDao d;

	@Test
	void contextLoads() {

		System.out.println(d.readxPlan(21));
	}	
}	



