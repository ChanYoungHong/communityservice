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

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "household_movement_address")
public class HouseholdMovementAddress {

    @Id
    private LocalDateTime houseMovementDate;

    @JoinColumn(name = "household_serial_number")
    private Integer HresidentNumber;

    @Column(name = "house_movement_address")
    private String HmovementAddress;

    @Column(name = "last_address-_yn")
    private String lastAddressYn;

}
