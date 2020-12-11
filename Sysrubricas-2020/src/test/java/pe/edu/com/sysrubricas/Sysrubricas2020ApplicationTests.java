package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.CompetenciaCursoDao;
import pe.edu.com.sysrubricas.dao.CompetenciaDao;
import pe.edu.com.sysrubricas.dao.CompetenciaNivelDao;
import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;

import pe.edu.com.sysrubricas.dao.NiveldeLogroDao;
import pe.edu.com.sysrubricas.dao.SemestreDao;


import pe.edu.com.sysrubricas.dao.PlanAcademicoDao;
import pe.edu.com.sysrubricas.dao.PlanLineaDao;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.CompetenciaCurso;
import pe.edu.com.sysrubricas.entity.CompetenciaNivel;

import pe.edu.com.sysrubricas.entity.LineaAcademica;

import pe.edu.com.sysrubricas.entity.PlanAcademico;
import pe.edu.com.sysrubricas.entity.PlanLinea;


@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	private CompetenciaNivelDao cndao;
	@Autowired
	private NiveldeLogroDao ndao;
	@Autowired
	private CompetenciaCursoDao ccdao;
	@Test
	void contextLoads() {
		System.out.println(ccdao.delete(42));
	}	
}	



