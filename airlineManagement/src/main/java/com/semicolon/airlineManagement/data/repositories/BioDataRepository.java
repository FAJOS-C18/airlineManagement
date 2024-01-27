package com.semicolon.airlineManagement.data.repositories;

import com.semicolon.airlineManagement.data.models.BioData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BioDataRepository extends JpaRepository<BioData, Long> {
}
