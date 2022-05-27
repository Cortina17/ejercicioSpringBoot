package com.capgemini.demo;

import java.util.List;

public interface JugadorService {

	List<Jugador> registrar();

	Jugador registrar(int id);

	Jugador delete(int id);

}
