package com.sidof.plantmanagement.DTO;

import com.sidof.plantmanagement.model.Species;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class PlantDTO {
    private String name;
    private Species species;
    private LocalDate buyAt;
    private String imageUrl;
}
