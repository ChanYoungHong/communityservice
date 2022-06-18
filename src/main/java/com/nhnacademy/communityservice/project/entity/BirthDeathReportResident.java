package com.nhnacademy.communityservice.project.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "birth_death_report_resident")
public class BirthDeathReportResident {

    @Id
    private String birthdeathCode;

    @Id
    private Integer reportresidentNumber;



}
