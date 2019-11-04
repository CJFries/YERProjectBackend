package com.project.squashclub.persistence;


import com.project.squashclub.domain.Match;
import com.project.squashclub.domain.SquashClubMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.ManyToOne;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    SquashClubMemberRepository squashClubMemberRepository;

    public Match save(Match match, Long squashClubMemberId1, Long squashClubMemberId2){
        SquashClubMember player1 = squashClubMemberRepository.findById(squashClubMemberId1).get();
        SquashClubMember player2 = squashClubMemberRepository.findById(squashClubMemberId2).get();
        match.setPlayer1(player1);
        match.setPlayer2(player2);
        return matchRepository.save(match);
    }

    public Match save(Match match, int scorePlayer1, int scorePlayer2){
        match.setScorePlayer1(scorePlayer1);
        match.setScorePlayer2(scorePlayer2);
        return matchRepository.save(match);
    }

    public Match save(Match match){
        return matchRepository.save(match);
    }
 /*   public Iterable<Match> giveMatch(Match m, Long squashClubMemberId1, Long squashClubMemberId2){
        Match m = matchRepository.findById(match_id.get());
        SquashClubMember sp1 = squashClubMemberRepository.findById(squashClubMemberId1).get();
        SquashClubMember sp2 = squashClubMemberRepository.findById(squashClubMemberId2).get();
        m.getPlayer1(sp1);
        m.
        return matchRepository.findById(m);
    } */


    public Iterable<Match> giveAllMatches(){
        return matchRepository.findAll();
    }


    public Iterable<Match> giveAllMatchScores(){
        return matchRepository.findAll();
    }

}
