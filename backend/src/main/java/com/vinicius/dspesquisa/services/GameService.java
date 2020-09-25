package com.vinicius.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vinicius.dspesquisa.dto.GameDTO;
import com.vinicius.dspesquisa.entity.Game;
import com.vinicius.dspesquisa.repositories.GameRepository;


@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true) //Importante para evitar o LockIn do BD
	public List<GameDTO> findAll(){
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}
	
}
