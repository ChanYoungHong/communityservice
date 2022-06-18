package com.nhnacademy.communityservice.project.entity;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "household_composition_resident")
@Entity
public class HouseholdCompositionResident {

    @EmbeddedId
    private Pk pk;

    @Column
    private LocalDateTime reportDate;

    @Column
    private String householdrelationshipCode;

    @Column
    private String householdChangeCode;


    private class Pk {
    }
}
