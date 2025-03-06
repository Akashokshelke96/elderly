package com.techshelke.elderly.service;

import com.techshelke.elderly.model.Caregiver;

import java.util.Optional;

public interface CaregiverService {
    Caregiver registerCaregiver(Caregiver caregiver);
    Optional<Caregiver> getCaregiverById(Long id);
}