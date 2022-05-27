package com.capgemini.demo;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface JugadorRepositorio extends Repository<Jugador, Integer> {

	List<Jugador> findAll(); // overriding el findAll del repository

	Jugador findById(int id);

	Jugador save(Jugador j);

}
