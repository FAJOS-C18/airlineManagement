package com.semicolon.airlineManagement.data.repositories;

import com.semicolon.airlineManagement.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByPassword(String password);
    User findByEmailAddress(String emailAddress);
}
