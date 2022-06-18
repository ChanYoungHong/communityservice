package com.nhnacademy.communityservice.project.entity;

import java.lang.annotation.Repeatable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "resident")
public class Resident {

    @Id
    @Column(name = "resident_serial_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer residentserialNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "resident_registration_number")
    private String residentRegistrationNumber;

    @Column(name = "gender_code")
    private String genderCode;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Column(name = "birth_place_code")
    private String birthplaceCode;

    @Column(name = "registration_base_addres")
    private String registrationbaseAddress;

    @Column(name = "death_date")
    private LocalDateTime deathDate;

    @Column(name = "death_place_code")
    private String deathplaceCode;

    @Column(name = "death_place_address")
    private String deathplaceAddress;

}

