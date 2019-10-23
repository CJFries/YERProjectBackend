package com.project.squashclub.persistence;


import com.project.squashclub.domain.ClubTournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubTournamentService {

    @Autowired
    ClubTournamentRepository clubTournamentRepository;

    public ClubTournament save(ClubTournament clubTournament){
        return clubTournamentRepository.save(clubTournament);
    }

    public Iterable<ClubTournament> giveAllMatchScores(){
        return clubTournamentRepository.findAll();
    }

}
