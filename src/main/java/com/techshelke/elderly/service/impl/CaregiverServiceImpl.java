package com.techshelke.elderly.service.impl;
import com.techshelke.elderly.model.Caregiver;
import com.techshelke.elderly.repository.CaregiverRepository;
import com.techshelke.elderly.service.CaregiverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CaregiverServiceImpl implements CaregiverService {

    private final CaregiverRepository caregiverRepository;

    @Override
    public Caregiver registerCaregiver(Caregiver caregiver) {
        return caregiverRepository.save(caregiver);
    }

    @Override
    public Optional<Caregiver> getCaregiverById(Long id) {
        return caregiverRepository.findById(id);
    }
}