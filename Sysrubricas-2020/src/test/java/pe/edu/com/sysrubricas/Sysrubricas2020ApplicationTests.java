package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.EvaluadorDao;
import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.dao.PersonaDao;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.Evaluador;
import pe.edu.com.sysrubricas.entity.LineaAcademica;
import pe.edu.com.sysrubricas.entity.Persona;



@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	private UnidadAcademicaDao ud;
	@Autowired
	private PersonaDao personaDao;
	@Autowired
	private EvaluadorDao evaluadorDao;
	
	@Test
	void contextLoads() {
	/*	Persona p = new Persona();
		p.setId_persona(1);
		p.setNombres("JeanPaul");
		System.out.println(personaDao.updatePersona(p));*/
		
		Evaluador ev = new Evaluador();
		ev.setIdevaluador(4);
		ev.setId_persona(22);
		ev.setId_proyecto(1);
		ev.setTipo("Evs.Interno");
		System.out.println(evaluadorDao.updateEvaluador(ev));
	}	

}
