package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import pe.edu.com.sysrubricas.dao.DocenteDao;
import pe.edu.com.sysrubricas.dao.ExpertoEDao;
import pe.edu.com.sysrubricas.entity.Docente;
import pe.edu.com.sysrubricas.entity.ExpertoE;





@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired


	private DocenteDao ld;
	
	@Autowired
	private ExpertoEDao e;



	@Test
	void contextLoads() {
		
		

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
}

	

