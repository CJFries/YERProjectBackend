package com.project.squashclub.api;


import com.project.squashclub.domain.ClubTournament;
import com.project.squashclub.persistence.ClubTournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClubTournamentEndpoint {

    @Autowired
    ClubTournamentService clubTournamentService;

    @PostMapping("/scoreinput")
    public ClubTournament newScoreInput(@RequestBody ClubTournament clubTournament){
        clubTournament.matchScore();
        ClubTournament newClubTournament = clubTournamentService.save(clubTournament);
        System.out.println("score added");
        return newClubTournament;
    }

    @GetMapping("/scoreoutput")
    public Iterable<ClubTournament> giveMatchScores(){

        return clubTournamentService.giveAllMatchScores();
    }

}
