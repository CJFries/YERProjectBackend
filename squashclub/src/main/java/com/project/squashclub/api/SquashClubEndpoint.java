package com.project.squashclub.api;


import com.project.squashclub.domain.SquashClub;
import com.project.squashclub.persistence.SquashClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SquashClubEndpoint {

    @Autowired
    SquashClubService squashClubService;

    @GetMapping("/allsquashclub")
    public Iterable<SquashClub> giveSquashClubMember(){
        return squashClubService.giveAllSquashClub();
    }

    @GetMapping("/zoek/{zoekterm}")
    public void zoeken(@PathVariable String zoekterm){
        System.out.println("gezocht op: " + zoekterm);
    }

    @PostMapping("/allsquashclub")
    public SquashClub newSquashClub(@RequestBody SquashClub squashClub){
        SquashClub newnewSquashClub =squashClubService.save(squashClub);
        System.out.println("Member added");
        return newnewSquashClub;
    }

    @DeleteMapping("/allsquashclub/{id}/delete")
    public void deleteSquashClub(@PathVariable("id") Long id){
        squashClubService.delete(id);
        System.out.println("Member deleted");
    }

    @PatchMapping("/allsquashclub/{id}")
    public SquashClub updateSquashClub(@RequestBody SquashClub squashClub, @PathVariable("id") Long id){
        squashClub.setId(id);
        SquashClub updateSquashClub = squashClubService.save(squashClub);
        System.out.println("Member updated");
        return updateSquashClub;
    }

}
