package com.user.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
