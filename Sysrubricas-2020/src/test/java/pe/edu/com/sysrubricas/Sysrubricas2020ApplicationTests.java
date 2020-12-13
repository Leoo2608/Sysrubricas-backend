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

import pe.edu.com.sysrubricas.dao.DocenteDao;
import pe.edu.com.sysrubricas.dao.ExpertoEDao;
import pe.edu.com.sysrubricas.entity.Docente;
import pe.edu.com.sysrubricas.entity.ExpertoE;




@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired

	private UnidadAcademicaDao ud;
	@Autowired
	private PersonaDao personaDao;
	@Autowired
	private EvaluadorDao evaluadorDao;
	



	private DocenteDao ld;
	
	@Autowired
	private ExpertoEDao e;

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


		//Docente doc = new Docente();
		//doc.setCodigo(1111111111);
		//doc.setIdpersona(41);
		System.out.println(ld.delete(1111111111));
		//System.out.println(ld.read(1111111111));
		//ld.delete(21);
		/*LineaAcademica l = new LineaAcademica();
		l.setNombre("Gestión de TI");
		l.setId_unidad(5);
		System.out.println(ld.create(l));*/

		

	}

		/*PlanAcademico p = new PlanAcademico();
		p.setIdplan(23);
		p.setNombre("2016-1 EP Ingeniería de Sistemas - Sede Lima");
		p.setIdunidad(5);
		p.setCiclos(10);
		p.setCreditos(201);
		p.setCursos(70);
		p.setAnio_inicio("02/03/2016");
		p.setAnio_termino("25/12/2020");
		System.out.println(pd.update(p));*/
		//System.out.println(ud.Campus());
		

	}	




	

