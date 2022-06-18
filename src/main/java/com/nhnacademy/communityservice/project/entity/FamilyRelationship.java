package com.nhnacademy.communityservice.project.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
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

    @Id
    @Column(name = "family_resident_serial_number")
    private Integer familyresidentNumber;

    @ManyToOne()
    @Column(name = "base_resident_serial_number")
    private Integer baseresidentNumber;

    @Column(name = "family_relationship_code")
    private String familyrelationshipCode;

}
