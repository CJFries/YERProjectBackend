package com.project.squashclub.persistence;


import com.project.squashclub.domain.SquashClub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SquashClubService {

    @Autowired
    SquashClubRepository squashClubRepository;

    public Iterable<SquashClub> giveAllSquashClub(){
        return squashClubRepository.findAll();
    }

    public SquashClub save(SquashClub squashClub){
        return squashClubRepository.save(squashClub);
    }

    public void delete(Long id){
        squashClubRepository.deleteById(id);
    }

}
