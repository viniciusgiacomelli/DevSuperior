package com.vinicius.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinicius.dspesquisa.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
