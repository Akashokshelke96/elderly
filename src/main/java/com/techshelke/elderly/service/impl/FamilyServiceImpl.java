package com.techshelke.elderly.service.impl;

import com.techshelke.elderly.model.Family;
import com.techshelke.elderly.repository.FamilyRepository;
import com.techshelke.elderly.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FamilyServiceImpl implements FamilyService {

    private final FamilyRepository familyRepository;

    @Override
    public Family registerFamily(Family family) {
        return familyRepository.save(family);
    }

    @Override
    public Optional<Family> getFamilyById(Long id) {
        return familyRepository.findById(id);
    }
}