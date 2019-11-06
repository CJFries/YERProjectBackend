package com.project.squashclub.api;


import com.project.squashclub.domain.Admin;
import com.project.squashclub.domain.Match;
import com.project.squashclub.domain.SquashClubMember;
import com.project.squashclub.persistence.AdminService;
import com.project.squashclub.persistence.MatchService;
import com.project.squashclub.persistence.SquashClubMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminEndpoint {

    @Autowired
    SquashClubMemberService squashClubMemberService;

    @Autowired
    AdminService adminService;

    @Autowired
    MatchService matchService;

    @PutMapping("/admin/scoreinput/{match_id}/{scorePlayer1}/{scorePlayer2}")
    public Match newScoreInput(@PathVariable long match_id, @PathVariable int scorePlayer1, @PathVariable int scorePlayer2){
        System.out.println("score added");
        Match updateMatch = matchService.save(match_id, scorePlayer1, scorePlayer2);
        return updateMatch;
    }

    @GetMapping("/admin/scoreoutput")
    public Iterable<Match> giveMatchScores(){
        return matchService.giveAllMatchScores();
    }


    @DeleteMapping("/squashclubmembers/{squashClubMemberId}/delete")
    public void deleteSquashClubMember(@PathVariable Long squashClubMemberId){
        squashClubMemberService.delete(squashClubMemberId);
        System.out.println("Member deleted");
    }

    @PatchMapping("/squashclubmembers/{squashClubMemberId}")
    public SquashClubMember updateSquashClubMember(@RequestBody SquashClubMember squashClubMember, @PathVariable Long squashClubMemberId){
        squashClubMember.setSquashClubMemberId(squashClubMemberId);
        SquashClubMember updateSquashClubMember = squashClubMemberService.save(squashClubMember);
        System.out.println("Member updated");
        return updateSquashClubMember;
    }

    @GetMapping("/login") //inlog mogelijkheid voor website met combinatie van front en backend.
    public Admin admin(@RequestBody Admin admin){
        admin.login();
        System.out.println("Login attempt");
        return admin;
    }

    @PostMapping("/admin/creatematch/{player1}/{player2}/{courtnumber}")
    public Match match(@RequestBody Match match, @PathVariable("player1") Long squashClubMemberId1, @PathVariable("player2") Long squashClubMemberId2, @PathVariable("courtnumber") int courtNumber){
        System.out.println("match made!");
        Match newMatch = matchService.save(match, squashClubMemberId1, squashClubMemberId2, courtNumber);
        return newMatch;
    }

    @GetMapping("/admin/allmatches")
    public Iterable<Match> giveAllMatches(){
        System.out.println("matches retrieved");
        return matchService.giveAllMatches();
    }


}
