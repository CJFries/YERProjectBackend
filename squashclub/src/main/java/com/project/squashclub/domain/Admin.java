package com.project.squashclub.domain;

import com.project.squashclub.domain.Match;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Admin_Id")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long admin_id;
    String username;
    String password;

  //  @OneToMany(fetch = FetchType.LAZY, mappedBy = "match")
  //  private List<Match> matchList;


public void login(){
        this.username = username;
        this.password = password;

        if(username.equals("admin") & password.equals("admin")){
            System.out.println("You're in!");
        }else if (username.equals(username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Wrong credentials");
        }
    }


}
