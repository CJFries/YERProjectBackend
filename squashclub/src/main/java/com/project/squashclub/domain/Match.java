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

    String result;
    private int courtNumber;


    @ManyToOne(fetch = FetchType.EAGER)
    private SquashClubMember player1;

    @ManyToOne(fetch = FetchType.EAGER)
    private SquashClubMember player2;

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

    public SquashClubMember getPlayer1() {
        return player1;
    }

    public void setPlayer1(SquashClubMember player1) {
        this.player1 = player1;
    }

    public SquashClubMember getPlayer2() {
        return player2;
    }

    public void setPlayer2(SquashClubMember player2) {
        this.player2 = player2;
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


    public String getResult() {
        return result;
    }
}
