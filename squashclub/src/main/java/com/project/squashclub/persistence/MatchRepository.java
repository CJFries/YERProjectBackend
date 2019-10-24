package com.project.squashclub.persistence;

import com.project.squashclub.domain.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface MatchRepository extends CrudRepository<Match, Long> {
}
