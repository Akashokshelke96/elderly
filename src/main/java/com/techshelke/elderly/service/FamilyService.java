package com.techshelke.elderly.service;


import com.techshelke.elderly.model.Family;
import java.util.Optional;

public interface FamilyService {
    Family registerFamily(Family family);
    Optional<Family> getFamilyById(Long id);
}

