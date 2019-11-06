package com.project.squashclub.domain;

import com.project.squashclub.persistence.SquashClubMemberRepository;
import com.project.squashclub.persistence.SquashClubMemberService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MatchTest {


    @Test
    public void getMatch_id() {
        Match match = new Match();
        match.setMatch_id(12);
        assertThat(match.getMatch_id()).isEqualTo(12);
    }

    @Test
    void setMatch_id() {
    }


}