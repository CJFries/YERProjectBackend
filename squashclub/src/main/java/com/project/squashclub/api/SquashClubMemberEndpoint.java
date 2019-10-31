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

  /*  @DeleteMapping("/squashclubmembers/{squashmemberId}/delete")
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
    }*/


}
