package com.user.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
}
