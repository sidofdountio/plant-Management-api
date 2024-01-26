package com.sidof.plantmanagement.api;

import com.sidof.plantmanagement.DTO.PlantDTO;
import com.sidof.plantmanagement.model.Plant;
import com.sidof.plantmanagement.model.Species;
import com.sidof.plantmanagement.service.SpecieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("api/v1/plant/specie")
@CrossOrigin(origins = "*",maxAge = 3600,allowedHeaders = "*")
@RequiredArgsConstructor
public class SpecieAPI {
    private final SpecieService specieService;

    /**
     * Get all specie
     */
    @GetMapping
    public ResponseEntity<List<Species>> getAllSpecie(){
        return new ResponseEntity<>(specieService.getAllSpecie(), HttpStatus.OK);
    }

    /**
     * Save new specie
     */
    @PostMapping
    public ResponseEntity<Species>addNewPlant(@RequestBody  Species species) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return new ResponseEntity<>(specieService.addNewSpecie(species), HttpStatus.CREATED);
    }
}
