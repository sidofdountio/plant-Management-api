package com.sidof.plantmanagement.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.sidof.plantmanagement.model.*;
import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Plant {
    @Id
    @SequenceGenerator(allocationSize = 1, name = "watering_sequence")
    @GeneratedValue(strategy = SEQUENCE, generator = "watering_sequence")
    private Long id;
    private String name;
    private LocalDate                                                                                                                                                                                                                                                                                                                                                            buyAt;
    private String imageUrl;
    private int waterQuantity;
    private LocalDate wateringDate;
    private int wateringFrequency;

    @OneToMany(mappedBy = "plant")
    @JsonIgnore
    private List<Watering> wateringList = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "specie_id",foreignKey = @ForeignKey(name = "plant_specie"), referencedColumnName = "id")
    private Species specie;


}
