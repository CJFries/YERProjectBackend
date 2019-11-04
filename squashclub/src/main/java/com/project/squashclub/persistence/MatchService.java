package com.project.squashclub.persistence;


import com.project.squashclub.domain.Match;
import com.project.squashclub.domain.SquashClubMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    SquashClubMemberRepository squashClubMemberRepository;

    public Match save(Match match){
        return matchRepository.save(match);
    }

 /*   public Iterable<Match> giveMatch(){
        Match m = matchRepository.findById();
        SquashClubMember sp1 = squashClubMemberRepository.findById(m.getIdPlayer1(m.getSquashClubMemberId));
        SquashClubMember sp2 = squashClubMemberRepository.findById(m.getIdPlayer2(m.getSquashClubMemberId));
        Speler sp2 = spelerp.getbyid(4);
        return matchRepository.findById();
    }*/


    public Iterable<Match> giveAllMatches(){
        return matchRepository.findAll();
    }


    public Iterable<Match> giveAllMatchScores(){
        return matchRepository.findAll();
    }

}
