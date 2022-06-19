package com.nhnacademy.communityservice.project.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "family_relationship")
public class FamilyRelationship {

    @EmbeddedId
    private FamilyRerationshipPk familyRerationshipPk;

    @MapsId("baseSerialNumber")
    @ManyToOne
    @Column(name = "base_resident_serial_number")
    private Resident resident;

    @Column(name = "family_relationship_code")
    private String familyrelationshipCode;


    @Embeddable
    @EqualsAndHashCode
    private class FamilyRerationshipPk implements Serializable {

        @Column(name = "family_resident_serial_number")
        private Integer familySerialNumber;

        @Column(name = "base_resident_serial_number")
        private Integer baseSerialNumber;


    }
}
