package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
	private PlanAcademicoDao pd;
	@Autowired
	private RolDao rd;
	@Autowired
	private PersonaDao ed;
	@Test
	void contextLoads() {

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
		Persona p = new Persona();
		p.setIdpersona(22);
		p.setNombre("Carlos");
		p.setApellidopat("Medina");
		p.setApellidomat("Ugarte");
		p.setDni("45682462");
		p.setTelefono("970380344");
		System.out.println(ed.update(p));
	}	

}
