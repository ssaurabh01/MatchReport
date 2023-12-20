package com.crick.apis.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crick.apis.entities.Match;


@Repository
public interface MatchRepo extends JpaRepository<com.crick.apis.entities.Match, Integer>{
	
	//We need to fetch match by team heading we can.
	
	Optional<Match> findByTeamHeading(String teamHeading);

}
