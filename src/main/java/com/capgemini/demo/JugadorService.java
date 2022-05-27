package com.capgemini.demo;

import java.util.List;

public interface JugadorService {

	public interface PersonaService {
		
		List <Jugador> registrar();
		Jugador registrarId(int id);
		Jugador edit(Jugador j);
		Jugador add(Jugador j);
		void delete(int id);
	}
}
