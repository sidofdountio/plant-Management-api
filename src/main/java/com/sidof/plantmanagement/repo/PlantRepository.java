package com.sidof.plantmanagement.repo;

import com.sidof.plantmanagement.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PlantRepository extends JpaRepository<Plant, Long> {
    @Override
    @Query("SELECT p FROM Plant p ORDER BY p.id desc")
    List<Plant> findAll();
    @Query("SELECT p FROM Plant p WHERE p.name= ?1")
    Optional<Plant>findByName(String name);

}
