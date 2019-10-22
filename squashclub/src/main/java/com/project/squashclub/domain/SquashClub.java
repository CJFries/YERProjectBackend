package com.project.squashclub.domain;


public class SquashClub {

    private int numberOfSquashClubMembers;
    public final int numberOfCourts = 12;
    private int numberOfReferees;


    public int getNumberOfSquashClubMembers() {
        return numberOfSquashClubMembers;
    }

    public void setNumberOfSquashMembers(int numberOfSquashClubMembers){
        this.numberOfSquashClubMembers = numberOfSquashClubMembers;
    }

    public int getNumberOfReferees() {
        return numberOfReferees;
    }

    public void setNumberOfReferees(int numberOfReferees) {
        this.numberOfReferees = numberOfReferees;
    }




}
