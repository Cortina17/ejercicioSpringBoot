package com.capgemini.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http::localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/futbolbd")
public class Controlador {

	@Autowired
	JugadorService service;

	@GetMapping
	public List<Jugador> listar() {
		return service.registrar();
	}

	@PostMapping(path = { "/id" })
	public Jugador registrar(@PathVariable("id") int id) {
		return service.registrar(id);
	}
	
	@DeleteMapping()
	public Jugador delete(@PathVariable("id") int id) {
		return service.delete(id);
	}

}