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

import pe.edu.com.sysrubricas.entity.Persona;
import pe.edu.com.sysrubricas.service.PersonaService;

@RestController
@RequestMapping("/api")
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	@GetMapping("/personas")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return personaService.readAllPersona();
	}
	@GetMapping("/personas/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return personaService.readPersona(id);
	}
	@PostMapping("/personas/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody Persona p) {
		return personaService.createPersona(p);
	}
	@DeleteMapping("/personas/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return personaService.deletePersona(id);
	}
	
	@PutMapping("/personas/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Persona p,@PathVariable int id) {
		Persona persona = new Persona();
		persona.setId_persona(id);
		persona.setNombres(p.getNombres());
		persona.setApe_pat(p.getApe_pat());
		persona.setApe_mat(p.getApe_mat());
		persona.setDni(p.getDni());
		persona.setTelefono(p.getTelefono());
		return personaService.updatePersona(persona);
	}
}
