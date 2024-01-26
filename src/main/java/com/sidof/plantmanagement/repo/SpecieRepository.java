package com.sidof.plantmanagement.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import  com.sidof.plantmanagement.model.*;

public interface SpecieRepository extends JpaRepository<Species, Long> {
}
