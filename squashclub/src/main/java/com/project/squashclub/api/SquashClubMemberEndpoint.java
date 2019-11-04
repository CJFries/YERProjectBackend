package com.project.squashclub.api;

import com.project.squashclub.domain.SquashClubMember;
import com.project.squashclub.persistence.SquashClubMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SquashClubMemberEndpoint {

    @Autowired
    SquashClubMemberService squashClubMemberService;

    @GetMapping("/allsquashclubmembers")
    public Iterable<SquashClubMember> giveSquashClubMembers(){
        return squashClubMemberService.giveAllSquashClubMembers();
    }

    @PostMapping("/allsquashclubmembers")
    public SquashClubMember newSquashClubMember(@RequestBody SquashClubMember squashClubMember){
        squashClubMember.calculateAge();
        SquashClubMember newnewSquashClubMember =squashClubMemberService.save(squashClubMember);
        System.out.println("Member added");
        return newnewSquashClubMember;
    }

    @GetMapping("/zoek/{zoekterm}")
    public void zoeken(@PathVariable String zoekterm){
        System.out.println("gezocht op: " + zoekterm);
    }

/*    @PatchMapping("/squashclubmembers/{squashClubMemberId}")
    public SquashClubMember updateSquashClubMember(@RequestBody SquashClubMember squashClubMember, @PathVariable Long squashClubMemberId){
        squashClubMember.setSquashMemberId(squashClubMemberId);
        SquashClubMember updateSquashClubMember = squashClubMemberService.save(squashClubMember);
        System.out.println("Member updated");
        return updateSquashClubMember;
    }*/


}
