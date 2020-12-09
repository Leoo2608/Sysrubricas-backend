package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import pe.edu.com.sysrubricas.dao.CompetenciaDao;

import pe.edu.com.sysrubricas.dao.CompetenciaNivelDao;

import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;

import pe.edu.com.sysrubricas.dao.NiveldeLogroDao;
import pe.edu.com.sysrubricas.dao.SemestreDao;


import pe.edu.com.sysrubricas.dao.PlanAcademicoDao;
import pe.edu.com.sysrubricas.dao.PlanLineaDao;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;

import pe.edu.com.sysrubricas.entity.Competencia;

import pe.edu.com.sysrubricas.entity.CompetenciaNivel;

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

	private SemestreDao sdao;
	

	@Test
	void contextLoads() {

		
		System.out.println(sdao.read(1));
		
		
		//System.out.println(ld.read(1));
		//System.out.println(cDao.readAll());
		//ld.delete(21);
		/*LineaAcademica l = new LineaAcademica();
		l.setNombre("Gestión de TI");
		l.setId_unidad(5);
		System.out.println(ld.create(l));*/
		
	}
	}	



