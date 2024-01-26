package com.sidof.plantmanagement.service;

import com.sidof.plantmanagement.model.Plant;
import com.sidof.plantmanagement.repo.PlantRepository;
import com.sidof.plantmanagement.service.PlantServiceImple.PlantDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlantService implements PlantDAO {
    private final PlantRepository plantRepository;


    /**
     * Service to save new plant
     * @param plantToSave
     */
    @Override
    public Plant addNewPLant(Plant plantToSave) {
        boolean present = plantRepository.findByName(plantToSave.getName()).isPresent();
        if(present){
            throw new IllegalStateException("Plant with this name "+ plantToSave.getName() + "already exist");
        }
        return plantRepository.save(plantToSave);
    }

    @Override
    public Plant editePlant(Plant plantToUpdate) {
       return  plantRepository.save(plantToUpdate);
    }

    @Override
    public void deletePlant(Long PlantId) {
        plantRepository.deleteById(PlantId);
    }

    @Override
    public List<Plant> getAllPlant() {
        log.info("Fetching plants");
        return plantRepository.findAll();
    }
}
