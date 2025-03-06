package com.techshelke.elderly.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "caregivers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Caregiver extends User {

    private String aadharUrl;
    private String drivingLicenseUrl;
    private String panCardUrl;
    private boolean isMedicalProfessional;
    private int yearsOfExperience;
}
