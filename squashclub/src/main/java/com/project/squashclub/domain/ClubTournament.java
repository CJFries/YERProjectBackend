package com.project.squashclub.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClubTournament {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long match_id;
    private int scorePlayer1;
    private int scorePlayer2;
    String result;


    public long getMatch_id() {
        return match_id;
    }

    public void setMatch_id(long match_id) {
        this.match_id = match_id;
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
