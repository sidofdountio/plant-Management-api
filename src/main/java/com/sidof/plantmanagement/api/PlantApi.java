package com.sidof.plantmanagement.api;

import com.sidof.plantmanagement.DTO.PlantDTO;
import com.sidof.plantmanagement.model.Plant;
import com.sidof.plantmanagement.service.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("api/v1/plant")
@CrossOrigin(origins = "*",maxAge = 3600,allowedHeaders = "*")
@RequiredArgsConstructor
public class PlantApi {
    private  final PlantService plantService;

    /**
     * Get all plant
     */
    @GetMapping
    public ResponseEntity<List<Plant>>getAllPlant(){
        return new ResponseEntity<>(plantService.getAllPlant(), HttpStatus.OK);
    }

    /**
     * Save new plant
     */
    @PostMapping
    public ResponseEntity<Plant>addNewPlant(@RequestBody Plant plantToSave) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return new ResponseEntity<>(plantService.addNewPLant(plantToSave), HttpStatus.CREATED);
    }

    /**
     * edite new plant
     */
    @PutMapping
    public ResponseEntity<Plant>editePlant(@RequestBody Plant plantToEdite){
        return new ResponseEntity<>(plantService.editePlant(plantToEdite), HttpStatus.CREATED);
    }
}
