package com.project.squashclub.api;


import com.project.squashclub.domain.Match;
import com.project.squashclub.persistence.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchEndpoint {

    @Autowired
    MatchService matchService;

    @PostMapping("/scoreinput")
    public Match newScoreInput(@RequestBody Match match){
        match.matchScore();
        Match newMatch = matchService.save(match);
        System.out.println("score added");
        return newMatch;
    }

    @GetMapping("/scoreoutput")
    public Iterable<Match> giveMatchScores(){
        return matchService.giveAllMatchScores();
    }

}
