package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.CursoDao;
import pe.edu.com.sysrubricas.dao.Curso_planDao;
import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.dao.ParticipanteDao;
import pe.edu.com.sysrubricas.dao.PlanAcademicoDao;
import pe.edu.com.sysrubricas.dao.PlanLineaDao;
import pe.edu.com.sysrubricas.dao.ProyectoDao;
import pe.edu.com.sysrubricas.dao.SemestreDao;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.Curso;
import pe.edu.com.sysrubricas.entity.Curso_plan;
import pe.edu.com.sysrubricas.entity.LineaAcademica;
import pe.edu.com.sysrubricas.entity.Participante;
import pe.edu.com.sysrubricas.entity.PlanAcademico;
import pe.edu.com.sysrubricas.entity.PlanLinea;


@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	private PlanAcademicoDao pd;
	@Autowired
	private UnidadAcademicaDao ud;
	@Autowired
	private ParticipanteDao p;
	@Autowired
	private CursoDao cu;
	@Autowired
	private Curso_planDao cp;
	@Autowired
	private SemestreDao s;
	@Autowired
	private ProyectoDao pp;
	@Test
	void contextLoads() {
						
						
		System.out.println(pp.readxUnidad(5));
	}	

}
