package com.project.squashclub.persistence;

import com.project.squashclub.domain.SquashClub;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SquashClubRepository extends CrudRepository<SquashClub, Long> {

}