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

import pe.edu.com.sysrubricas.entity.ExpertoExterno;
import pe.edu.com.sysrubricas.service.ExpertoExternoService;

@RestController
@RequestMapping("/api")
public class ExpertoExternoController {
	@Autowired
	private ExpertoExternoService expertoexService;
	@GetMapping("/expertoex")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return expertoexService.readAllExpertoExterno();
	}
	@GetMapping("/expertoex/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return expertoexService.readExpertoExterno(id);
	}
	@PostMapping("/expertoex/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody ExpertoExterno exp) {
		return expertoexService.createExpertoExterno(exp);
	}
	@DeleteMapping("/expertoex/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return expertoexService.deleteExpertoExterno(id);
	}
	
	@PutMapping("/expertoex/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody ExpertoExterno exp,@PathVariable int id) {
		ExpertoExterno expertos = new ExpertoExterno();
		expertos.setId_experto(id);
		expertos.setId_persona(exp.getId_persona());
		
		return expertoexService.updateExpertoExterno(expertos);
	}
	
		
}
