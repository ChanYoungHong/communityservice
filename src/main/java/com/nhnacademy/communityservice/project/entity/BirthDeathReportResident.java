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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "birth_death_report_resident")
public class BirthDeathReportResident {

    @EmbeddedId
    private BirthDeathReportResidentPk birthDeathReportResidentPk;

    @MapsId("residentserialNumber")
    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @Column(name = "birth_death_report_date")
    private LocalDateTime  birthdeathDate;

    @Column(name = "birth_report_qualifications_code")
    private String birthreportCode;

    @Column(name = "death_report_qualifications_code")
    private String deathreportCode;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    @Setter
    @Getter
    @EqualsAndHashCode
    private class BirthDeathReportResidentPk implements Serializable {

        @Column(name = "birth_death_type_code")
        private String birthdeathtypeCode;

        @Column(name = "report_resident_serial_number")
        private Integer reportResidentNumber;

        @Column(name = "resident_serial_number")
        private Integer residentserialNumber;

    }
}
