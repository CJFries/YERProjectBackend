package com.project.squashclub.persistence;

import com.project.squashclub.domain.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AdminRepository extends CrudRepository<Admin, Long> {


}
