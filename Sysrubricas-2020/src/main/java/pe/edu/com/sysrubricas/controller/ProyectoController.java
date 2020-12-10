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

import pe.edu.com.sysrubricas.entity.Proyecto;
import pe.edu.com.sysrubricas.service.ProyectoService;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	@Autowired
	private ProyectoService proyectoService;
	@GetMapping("/proyectos")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return proyectoService.readAllProyecto();
	}
	@GetMapping("/proyectos/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return proyectoService.readProyecto(id);
	}
	@PostMapping("/proyectos/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody Proyecto pr) {
		return proyectoService.createProyecto(pr);
	}
	@DeleteMapping("/proyectos/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return proyectoService.deleteProyecto(id);
	}
	
	@PutMapping("/proyectos/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Proyecto pr,@PathVariable int id) {
		Proyecto proyecto = new Proyecto();
		proyecto.setId_proyecto(id);
		proyecto.setCiclo(pr.getCiclo());
		proyecto.setGrupos(pr.getGrupos());
		proyecto.setId_persona(pr.getId_persona());
		
		return proyectoService.updateProyecto(proyecto);
	}
}
