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

import pe.edu.com.sysrubricas.entity.Competencia;
import pe.edu.com.sysrubricas.entity.Semestre;
import pe.edu.com.sysrubricas.service.CompetenciaService;


@RestController
@RequestMapping("/competencia")
public class CompetenciaController {
	@Autowired
	private CompetenciaService compser;
	
	@GetMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return compser.readAll();
	}
	@PostMapping("/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody Competencia comp) {
		Competencia competencia = new Competencia();
		competencia.setNombre(comp.getNombre());
		return compser.create(competencia);
	}
	
	@DeleteMapping("/competencia/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return compser.delete(id);
	}
	@PutMapping("/competencia/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Competencia compe,@PathVariable int id) {
		Competencia competencia = new Competencia();
		competencia.setIdcomp(id);
		competencia.setNombre(compe.getNombre());
		return compser.update(competencia);
	}
}
