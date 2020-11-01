package pe.edu.com.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.com.sysrubricas.service.LineaAcademicaService;

@RestController
@RequestMapping("/lineasacademicas")
public class LineaAcademicaController {
	@Autowired
	private LineaAcademicaService lser;
	
	@GetMapping("/lista")
	public Map<String, Object> readAll(){
		return lser.readAll();
	}
}
