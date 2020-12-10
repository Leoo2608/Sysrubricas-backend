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

import pe.edu.com.sysrubricas.entity.Semestre;
import pe.edu.com.sysrubricas.service.SemestreService;

@RestController
@RequestMapping("/api")
public class SemestreController {
	@Autowired
	private SemestreService semestreService;
	@GetMapping("/semestres")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return semestreService.readAllSemestre();
	}
	@GetMapping("/semestres/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return semestreService.readSemestre(id);
	}
	@PostMapping("/semestres/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody Semestre sm) {
		return semestreService.createSemestre(sm);
	}
	@DeleteMapping("/semestres/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return semestreService.deleteSemestre(id);
	}
	
	@PutMapping("/semestres/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Semestre sm,@PathVariable int id) {
		Semestre semestre = new Semestre();
		semestre.setId_semestre(id);
		semestre.setNombre(sm.getNombre());
		return semestreService.updateSemestre(semestre);
	}
}
