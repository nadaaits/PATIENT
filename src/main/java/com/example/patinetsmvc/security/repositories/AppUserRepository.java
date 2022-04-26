package com.example.patinetsmvc.security.repositories;

import com.example.patinetsmvc.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String>{
    AppUser findByUsername(String username);
}
