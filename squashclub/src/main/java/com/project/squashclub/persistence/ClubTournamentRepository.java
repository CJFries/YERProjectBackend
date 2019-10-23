package com.project.squashclub.persistence;

import com.project.squashclub.domain.ClubTournament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface ClubTournamentRepository extends CrudRepository<ClubTournament, Long> {
}
