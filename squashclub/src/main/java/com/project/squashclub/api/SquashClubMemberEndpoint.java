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

    @GetMapping("/test")
    public SquashClubMember test(){
        System.out.println("test gelukt!");
        SquashClubMember s = new SquashClubMember();
        s.setFirstName("henk");
        s.setId(1);
        s.setLastName("henkertsma");
        s.setRating(5);
        s.setGender("Apache");
        return s;
    }

    @PostMapping("/allsquashclubmembers")
    public SquashClubMember newSquashClubMember(@RequestBody SquashClubMember squashClubMember){
        SquashClubMember newnewSquashClubMember =squashClubMemberService.save(squashClubMember);
        return newnewSquashClubMember;
    }

    @DeleteMapping("/allsquashclubmembers/{id}")
    public void deleteSquashClubMember(@PathVariable("id") Long id){
         squashClubMemberService.delete(id);
    }

    /*@PutMapping("/allsquashclubmembers/{id}")
    public SquashClubMember updateSquashClubMember(@PathVariable Long id, @RequestBody SquashClubMember squashClubMember){
        Optional<SquashClubMember> squashClubMemberOptional = squashClubMemberRepository.findById(id);

        if (!studentOptional.isPresent())
            return SquashClubMember.notFound().build();

        squashClubMember.setId(id);

        squashClubMemberRepository.save(squashClubMember);

        return SquashClubMember.noContent().build();
    }

    }*/
}
