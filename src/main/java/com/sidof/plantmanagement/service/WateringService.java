package com.sidof.plantmanagement.service;

import com.sidof.plantmanagement.model.Watering;
import com.sidof.plantmanagement.repo.WateringRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WateringService {

    private final WateringRepository  wateringRepository;

    public List<Watering>getAllWatering(){
        return wateringRepository.findAll();
    }

    /**
     * Watering plant
     * @param watering
     */
    public Watering saveWateringPlant(Watering watering){
        return wateringRepository.save(watering);
    }

}
