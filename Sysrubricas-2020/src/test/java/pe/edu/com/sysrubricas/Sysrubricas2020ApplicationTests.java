package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.DocenteDao;
import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;
import pe.edu.com.sysrubricas.entity.LineaAcademica;

@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	private DocenteDao ld;
	@Test
	void contextLoads() {
		//System.out.println(ld.read(1));
		 System.out.println(ld.readAll());
		//ld.delete(21);
		/*LineaAcademica l = new LineaAcademica();
		l.setNombre("Gestión de TI");
		l.setId_unidad(5);
		System.out.println(ld.create(l));*/
		
		
		
	}

}
