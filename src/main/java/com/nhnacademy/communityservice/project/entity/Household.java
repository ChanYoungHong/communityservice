package com.nhnacademy.communityservice.project.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hosuehold")
@Entity
public class Household {

    @Id
    private Integer HouseholdNumbrer;

    @JoinColumn(name = "household_resident_serial_number")
    private Integer HresidentNumber;

    @Column(name = "household_composition_date")
    private LocalDateTime HcompositonDate;

    @Column(name = "household_composition_reason_code")
    private String HcompositionreasonCode;

    @Column(name = "current_house_movement_address")
    private String CurrenthouseAddress;


}
