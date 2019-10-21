package com.project.squashclub.api;

import com.project.squashclub.domain.SquashClubMember;
import com.project.squashclub.persistence.SquashClubMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquashClubMemberEndpoint {

    @Autowired
    SquashClubMemberService squashClubMemberService;

    @GetMapping("/allsquashclubmembers")
    public Iterable<SquashClubMember> giveSquashClubMembers(){
        return squashClubMemberService.giveAllSquashClubMembers();
    }

    @GetMapping("/test")
    public SquashClubMember test(){
        System.out.println("test gelukt!");
        SquashClubMember s = new SquashClubMember();
        s.setFirstName("henk");
        return s;
    }


    @PostMapping("/allsquashclubmembers")
    public SquashClubMember newSquashClubMember(@RequestBody SquashClubMember squashClubMember){
        SquashClubMember newnewSquashClubMember =squashClubMemberService.save(squashClubMember);
        return newnewSquashClubMember;
    }

}
