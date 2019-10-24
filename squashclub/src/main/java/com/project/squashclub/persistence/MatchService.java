package com.project.squashclub.persistence;


import com.project.squashclub.domain.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    public Match save(Match match){
        return matchRepository.save(match);
    }

    public Iterable<Match> giveAllMatchScores(){
        return matchRepository.findAll();
    }

}
