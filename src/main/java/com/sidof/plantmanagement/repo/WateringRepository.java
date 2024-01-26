package com.sidof.plantmanagement.repo;

import com.sidof.plantmanagement.model.Watering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WateringRepository extends JpaRepository<Watering, Long> {

    @Override
    @Query("SELECT w FROM Watering w ORDER BY w.id desc")
    List<Watering> findAll();
}
