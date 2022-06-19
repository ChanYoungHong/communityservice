package com.nhnacademy.communityservice.project.entity;


import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
    private HouseholdCompositionPk householdCompositionPk;

    @MapsId("HouseholdNumber")
    @ManyToOne
    @JoinColumn(name = "household_serial_number")
    private Household household;

    @MapsId("residentserialNumber")
    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @Column
    private LocalDateTime reportDate;

    @Column
    private String householdrelationshipCode;

    @Column
    private String householdChangeCode;

    @Embeddable
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    private class HouseholdCompositionPk implements Serializable {

        @Column(name = "household_serial_number")
        private Integer HouseholdNumber;

        @Column(name = "resident_serial_number")
        private Integer residentserialNumber;
    }
}
