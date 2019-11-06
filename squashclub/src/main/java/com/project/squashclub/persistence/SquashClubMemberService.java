package com.project.squashclub.persistence;


import com.project.squashclub.domain.SquashClubMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SquashClubMemberService {

    @Autowired
    SquashClubMemberRepository squashClubMemberRepository;

    public Iterable<SquashClubMember> giveAllSquashClubMembers(){
        return squashClubMemberRepository.findAll();
    }

    public SquashClubMember save(SquashClubMember squashClubMember){
        return squashClubMemberRepository.save(squashClubMember);
    }

    public void delete(Long squashClubMemberId){
        squashClubMemberRepository.deleteById(squashClubMemberId);
    }

    public void findSquashClubMemberByRating(int rating){
        Iterable<SquashClubMember> sq = squashClubMemberRepository.findByRating(rating);
        for(SquashClubMember scm : sq){
            System.out.println("Found by rating");
        }
    }



}
