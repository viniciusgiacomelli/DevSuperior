package com.vinicius.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinicius.dspesquisa.entity.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
