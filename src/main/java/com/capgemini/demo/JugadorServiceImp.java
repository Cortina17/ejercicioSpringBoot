package com.capgemini.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorServiceImp implements JugadorService {

	@Autowired
	private JugadorRepositorio repositorio;

	@Override
	public List<Jugador> registrar() {
		return repositorio.findAll();
	}

	@Override
	public Jugador registrar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}