package com.capgemini.demo;

import java.util.List;

public interface JugadorService {

	List<Jugador> listar();

	Jugador add(int id);
	
	Jugador edit(int id);

	Jugador listarId(int id);
	
	Jugador delete(int id);
	

}
