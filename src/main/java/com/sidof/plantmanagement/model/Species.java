package com.sidof.plantmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Species {
    @Id
    @SequenceGenerator(allocationSize = 1, name = "specie_sequence")
    @GeneratedValue(strategy = SEQUENCE, generator = "specie_sequence")
    private Long id;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "specie")
    private List<Plant> plantList = new ArrayList<>();
}
