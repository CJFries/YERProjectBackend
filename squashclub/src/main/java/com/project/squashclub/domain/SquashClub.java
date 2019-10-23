package com.project.squashclub.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class SquashClub {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private int numberOfSquashClubMembers;
    public final int numberOfCourts = 12;
    private int numberOfReferees;


    public int getNumberOfSquashClubMembers() {
        return numberOfSquashClubMembers;
    }

    public void setNumberOfSquashMembers(int numberOfSquashClubMembers) {
        this.numberOfSquashClubMembers = numberOfSquashClubMembers;
    }

    public int getNumberOfReferees() {
        return numberOfReferees;
    }

    public void setNumberOfReferees(int numberOfReferees) {
        this.numberOfReferees = numberOfReferees;
    }


    public void setId(Long id) {
    }
}
