package com.sidof.plantmanagement.api;

import com.sidof.plantmanagement.model.Watering;
import com.sidof.plantmanagement.service.WateringService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("api/v1/plant/watering")
@CrossOrigin(origins = "*",allowedHeaders = "*",maxAge = 3600)
@RequiredArgsConstructor
public class WateringApi {
    private final WateringService wateringService;
    @GetMapping
    public ResponseEntity<List<Watering>> getAllWatering(){
        return new ResponseEntity<>(wateringService.getAllWatering(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Watering> saveWateringPlant(@RequestBody Watering  wateringToSave) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        wateringToSave.setDate(LocalDateTime.now());
        return new ResponseEntity<>(wateringService.saveWateringPlant(wateringToSave), HttpStatus.CREATED);
    }
}
