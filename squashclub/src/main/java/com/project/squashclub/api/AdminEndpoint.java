package com.project.squashclub.api;


import com.project.squashclub.domain.Admin;
import com.project.squashclub.domain.Match;
import com.project.squashclub.domain.SquashClubMember;
import com.project.squashclub.persistence.AdminService;
import com.project.squashclub.persistence.SquashClubMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminEndpoint {

    @Autowired
    SquashClubMemberService squashClubMemberService;

    @Autowired
    AdminService adminService;

    @DeleteMapping("/squashclubmembers/{squashMemberId}/delete")
    public void deleteSquashClubMember(@PathVariable("id") Long squashMemberId){
        squashClubMemberService.delete(squashMemberId);
        System.out.println("Member deleted");
    }

    @PatchMapping("/squashclubmembers/{squashMemberId}")
    public SquashClubMember updateSquashClubMember(@RequestBody SquashClubMember squashClubMember, @PathVariable Long squashMemberId){
        squashClubMember.setSquashMemberId(squashMemberId);
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
    public Match match(@RequestBody Match match, @PathVariable Long match_id){
        match.setMatch_id(match_id);
        System.out.println("match made!");
        return match;
    }

}
