package com.project.squashclub.persistence;


import com.project.squashclub.domain.SquashClubMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SquashClubMemberRepository extends CrudRepository<SquashClubMember, Long> {

    Iterable<SquashClubMember> findByRating(int rating);
}
