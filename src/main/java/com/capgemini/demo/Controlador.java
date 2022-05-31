package com.capgemini.demo;

import java.util.List;
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

@CrossOrigin(origins = "http::localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/futbolbd")
public class Controlador {

	@Autowired
	JugadorService service;

	@GetMapping
	public List<Jugador> listar() {
		return service.listar();
	}

	@PostMapping(path = { "/id" })
	public Jugador add(@PathVariable("id") int id) {
		return service.add(id);
	}
	
	@GetMapping
	public List<Jugador> add() {
		return service.add();
	}

	@PostMapping
	public Jugador agregar(@RequestBody Jugador j) {
		return service.add(j);
	}

	@GetMapping(path = { "/id" })
	public Jugador listarId(@PathVariable("id") int id) {
		return service.listarId(id);
	}
	
	@PutMapping(path = { "/id" })
	public Jugador edit(@PathVariable("id") int id) {
		return service.edit(id);
	}

	@DeleteMapping(path = { "/id" })
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}

}