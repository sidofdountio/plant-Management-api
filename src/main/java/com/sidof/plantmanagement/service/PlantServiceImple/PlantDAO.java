package com.sidof.plantmanagement.service.PlantServiceImple;

import com.sidof.plantmanagement.model.Plant;

import java.util.List;

public interface PlantDAO {
    Plant addNewPLant(Plant plantToSave);
    Plant editePlant(Plant plantToUpdate);
    void deletePlant(Long PlantId);
    List<Plant>getAllPlant();
}
