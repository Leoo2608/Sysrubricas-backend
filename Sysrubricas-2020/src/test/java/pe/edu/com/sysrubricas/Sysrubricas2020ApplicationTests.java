package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.CompetenciaDao;
import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;

import pe.edu.com.sysrubricas.dao.NiveldeLogroDao;
import pe.edu.com.sysrubricas.dao.SemestreDao;


import pe.edu.com.sysrubricas.dao.PlanAcademicoDao;
import pe.edu.com.sysrubricas.dao.PlanLineaDao;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.Competencia;
import pe.edu.com.sysrubricas.entity.LineaAcademica;

import pe.edu.com.sysrubricas.entity.PlanAcademico;
import pe.edu.com.sysrubricas.entity.PlanLinea;


@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired

	private NiveldeLogroDao nDao;

	private PlanAcademicoDao pd;
	@Autowired
	private UnidadAcademicaDao ud;
	@Autowired
	private CompetenciaDao cDao;
	
	@Test
	void contextLoads() {
		
		System.out.println(cDao.delete(21));
		
		//System.out.println(ld.read(1));
		//System.out.println(cDao.readAll());
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



