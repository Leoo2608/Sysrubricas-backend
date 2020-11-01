package pe.edu.com.sysrubricas.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.com.sysrubricas.service.LineaAcademicaService;
import pe.edu.com.sysrubricas.service.TipoUnidadAcademicaService;
@RestController
@RequestMapping("/api")
public class TipoUnidadAcademicaController {
	@Autowired
	private TipoUnidadAcademicaService tser;
	
	@GetMapping("/tipo")
	public Map<String, Object> readAll(){
		return tser.readAll();
	}
	
	
}
