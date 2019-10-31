package com.project.squashclub.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;


@Entity
@Table(name = "SquashClub_Member_Id")
public class SquashClubMember{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long squashMemberId;
    private String firstName;
    private String lastName;
    private int rating;
    private LocalDate dateOfBirth;
    private String gender;
    private long age;

    @ManyToMany
    private List<Match> match;

    public long getSquashMemberId() {
        return squashMemberId;
    }

    public void setSquashMemberId(long squashMemberId) {
        this.squashMemberId = squashMemberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void calculateAge() {
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public long getAge() {
        return age;
    }



}
