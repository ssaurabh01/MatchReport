package com.crick.apis.services;

import java.util.List;
import java.util.Map;

import com.crick.apis.entities.Match;

public interface MatchService {
	
	//get all matches
	
	List<Match> getAllMatchs();
	
	//get live matches
	
	List<Match> getLiveMatchs();
	
	//get point table
	
	List<Map<String,String>> getPointTable();

}
