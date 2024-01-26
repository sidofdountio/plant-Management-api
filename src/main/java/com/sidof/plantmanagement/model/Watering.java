package com.sidof.plantmanagement.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Watering {
    @Id
    @SequenceGenerator(allocationSize = 1, name = "watering_sequence",sequenceName = "watering_sequence")
    @GeneratedValue(strategy = SEQUENCE, generator = "watering_sequence")
    private Long id;
    private LocalDateTime date;
    @ManyToOne
    @JoinColumn(name = "plant_id",referencedColumnName = "id")
    private Plant plant;
}
