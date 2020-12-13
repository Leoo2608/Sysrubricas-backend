package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import pe.edu.com.sysrubricas.dao.DocenteDao;
import pe.edu.com.sysrubricas.dao.ExpertoEDao;
import pe.edu.com.sysrubricas.entity.Docente;
import pe.edu.com.sysrubricas.entity.ExpertoE;

import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.dao.PersonaDao;
import pe.edu.com.sysrubricas.dao.PlanAcademicoDao;
import pe.edu.com.sysrubricas.dao.PlanLineaDao;
import pe.edu.com.sysrubricas.dao.RolDao;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;
import pe.edu.com.sysrubricas.entity.LineaAcademica;
import pe.edu.com.sysrubricas.entity.Persona;
import pe.edu.com.sysrubricas.entity.PlanAcademico;
import pe.edu.com.sysrubricas.entity.PlanLinea;
import pe.edu.com.sysrubricas.entity.Rol;



@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired



	private ExpertoEDao e;
	
	@Autowired
	private PersonaDao ed;
	@Test
	void contextLoads() {

		//Docente doc = new Docente();
		//doc.setCodigo(1111111111);
		//doc.setIdpersona(41);
		//System.out.println(d.readDinamico());
		//System.out.println(ld.read(1111111111));
		/*LineaAcademica l = new LineaAcademica();
		l.setNombre("Gestión de TI");
		l.setId_unidad(5);
		System.out.println(ld.create(l));*/

		ExpertoE ex = new ExpertoE();
		System.out.println(e.delete(1));
		 
	}
}

		



	

