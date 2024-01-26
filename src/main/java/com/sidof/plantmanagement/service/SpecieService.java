package com.sidof.plantmanagement.service;


import com.sidof.plantmanagement.model.Species;
import com.sidof.plantmanagement.repo.SpecieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class SpecieService {
    private final SpecieRepository specieRepository;

    public List<Species> getAllSpecie(){
        log.info("Fetching plant species");
        return specieRepository.findAll();
    }

    public Species addNewSpecie(Species specieToSave){
        log.info("Saving new specie {}",specieToSave);
        return specieRepository.save(specieToSave);
    }

}
