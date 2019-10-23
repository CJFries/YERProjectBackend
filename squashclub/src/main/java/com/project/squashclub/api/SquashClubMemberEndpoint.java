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

    @DeleteMapping("/squashclubmembers/{id}/delete")
    public void deleteSquashClubMember(@PathVariable("id") Long id){
        squashClubMemberService.delete(id);
        System.out.println("Member deleted");
    }

    @PatchMapping("/squashclubmembers/{id}")
    public SquashClubMember updateSquashClubMember(@RequestBody SquashClubMember squashClubMember, @PathVariable Long id){
        squashClubMember.setId(id);
        SquashClubMember updateSquashClubMember = squashClubMemberService.save(squashClubMember);
        System.out.println("Member updated");
        return updateSquashClubMember;
    }


}
