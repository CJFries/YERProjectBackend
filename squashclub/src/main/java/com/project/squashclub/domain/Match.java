package com.project.squashclub.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Match_Id")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long match_id;
    private int scorePlayer1;
    private int scorePlayer2;
    private long idPlayer1;
    private long idPlayer2;
    String result;
    private int courtNumber;


    @ManyToMany(mappedBy = "match")
    private List<SquashClubMember> squashClubMember;

    public long getMatch_id() {
        return match_id;
    }

    public void setMatch_id(long match_id) {
        this.match_id = match_id;
    }

    public int getCourtNumber() {
        return courtNumber;
    }

    public void setCourtNumber(int courtNumber) {
        this.courtNumber = courtNumber;
    }

    public long getIdPlayer1() {
        return idPlayer1;
    }

    public void setIdPlayer1(long idPlayer1) {
        this.idPlayer1 = idPlayer1;
    }

    public long getIdPlayer2() {
        return idPlayer2;
    }

    public void setIdPlayer2(long idPlayer2) {
        this.idPlayer2 = idPlayer2;
    }

    public int getScorePlayer1() {
        return scorePlayer1;
    }

    public void setScorePlayer1(int scorePlayer1) {
        this.scorePlayer1 = scorePlayer1;
    }

    public int getScorePlayer2() {
        return scorePlayer2;
    }

    public void setScorePlayer2(int scorePlayer2) {
        this.scorePlayer2 = scorePlayer2;
    }

    public void matchScore(){

        getScorePlayer1();
        getScorePlayer2();

        this.result = "De score is: " + scorePlayer1 + "-" + scorePlayer2;
        System.out.println(this.result);
    }

    /*public void newMatch(long squashClubMemberId, long squashClubMemberId, long courtId){
        getPlayer1();
        getPlayer2();
        getCourtId();
    }*/

    public String getResult() {
        return result;
    }
}
