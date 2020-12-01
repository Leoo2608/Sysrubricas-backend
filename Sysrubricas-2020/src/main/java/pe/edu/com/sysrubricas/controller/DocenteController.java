package pe.edu.com.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.com.sysrubricas.entity.Docente;
import pe.edu.com.sysrubricas.entity.LineaAcademica;
import pe.edu.com.sysrubricas.service.DocenteService;

@RestController
@RequestMapping("/api")
public class DocenteController {
	
		@Autowired
		private DocenteService d;
		
		@GetMapping("/docentes")
		@CrossOrigin(origins = "http://localhost:4200")
		public Map<String, Object> readAll(){
			return d.readAll();
		}
		@GetMapping("/docentes/{id}")
		@CrossOrigin(origins = "http://localhost:4200")
		public Map<String, Object> read(@PathVariable int codigo) {
			return d.read(codigo);
		}
		@PostMapping("/docentes/add")
		@CrossOrigin(origins = "http://localhost:4200")
		public int create(@RequestBody Docente dc) {
			return d.create(dc);
		}
		@DeleteMapping("/docentes/delete/{id}")
		@CrossOrigin(origins = "http://localhost:4200")
		public int delete(@PathVariable int codigo) {
			return d.delete(codigo);
		}
		
		@PutMapping("/docentes/update/{id}")
		@CrossOrigin(origins = "http://localhost:4200")
		public int update(@RequestBody Docente docente,@PathVariable int codigo) {
			Docente da = new Docente();
			da.setCodigo(docente.getCodigo());
			da.setIdpersona(docente.getIdpersona());
			return d.update(da);
		}

}
