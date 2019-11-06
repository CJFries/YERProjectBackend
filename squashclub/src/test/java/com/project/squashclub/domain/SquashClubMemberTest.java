package com.project.squashclub.domain;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Date;


import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class SquashClubMemberTest {

    @Test
    void getLastName() {
        SquashClubMember squashClubMember = new SquashClubMember();
        squashClubMember.setLastName("Pieterzoon");
        Assert.assertEquals("Pieterzoon", squashClubMember.getLastName());
    }

    @Test
    void setLastName() {
    }

    @Test
    void getRating() {
        SquashClubMember squashClubMember = new SquashClubMember();
        squashClubMember.setRating(3);
        assertThat(squashClubMember.getRating()).isEqualTo(3);
    }

    @Test
    void setRating() {
    }

    @Test
    void getDateOfBirth() {
        SquashClubMember squashClubMember = new SquashClubMember();
        //LocalDate date = new LocalDate(1883,12,14);
       // squashClubMember.setDateOfBirth(;
    }

    @Test
    void setDateOfBirth() {
    }

    @Test
    void calculateAge() {

    }

    @Test
    void getAge() {
        SquashClubMember squashClubMember = new SquashClubMember();
       // squashClubMember.calculateAge(3);
        assertThat(squashClubMember.getRating()).isEqualTo(3);
    }
}