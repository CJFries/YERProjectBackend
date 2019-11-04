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

    @DeleteMapping("/squashclubmembers/{squashClubMemberId}/delete")
    public void deleteSquashClubMember(@PathVariable("id") Long squashClubMemberId){
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

    @PostMapping("/login") //inlog mogelijkheid voor website met combinatie van front en backend.
    public Admin admin(@RequestBody Admin admin){
        admin.login();
        System.out.println("Login attempt");
        return admin;
    }

    @PostMapping("/creatematch")
    public Match match(@RequestBody Match match){
        Match newMatch = matchService.save(match);
        System.out.println("match made!");
        return newMatch;
    }

    @GetMapping("/allmatches")
    public Iterable<Match> giveAllMatches(){
        System.out.println("matches retrieved");
        return matchService.giveAllMatches();
    }


}
