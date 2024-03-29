package com.project.squashclub.domain;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;


@Entity
@Table(name = "SquashClub_Member_Id")
public class SquashClubMember{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long squashClubMemberId;
    private String firstName;
    private String lastName;
    private int rating;
    private LocalDate dateOfBirth;
    private String gender;
    private long age;



    public long getSquashClubMemberId() {
        return squashClubMemberId;
    }

    public void setSquashClubMemberId(long squashClubMemberId) {
        this.squashClubMemberId = squashClubMemberId;
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
