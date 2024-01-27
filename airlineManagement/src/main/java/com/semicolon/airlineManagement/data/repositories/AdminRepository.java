package com.semicolon.airlineManagement.data.repositories;

import com.semicolon.airlineManagement.data.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByEmailAddress(String emailAddress);

}
