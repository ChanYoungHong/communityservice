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
import net.bytebuddy.asm.Advice;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "household_movement_address")
public class HouseholdMovementAddress {

    @EmbeddedId
    private HouseholdMovementPk householdMovementPk;

    @MapsId("HouseholdNumber")
    @ManyToOne
    @JoinColumn(name = "household_serial_number")
    private Household household;

    @Column(name = "house_movement_address")
    private String HmovementAddress;

    @Column(name = "last_address-_yn")
    private String lastAddressYn;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Embeddable
    @EqualsAndHashCode
    private class HouseholdMovementPk implements Serializable {

        @Column(name = "house_movement_report_date")
        private LocalDateTime housemovementDate;

        @Column(name = "household_serial_number")
        private Integer HouseholdNumber;

    }
}
