package com.techshelke.elderly.controller;
import com.techshelke.elderly.model.Caregiver;
import com.techshelke.elderly.service.CaregiverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/caregivers")
@RequiredArgsConstructor
public class CaregiverController {

    private final CaregiverService caregiverService;

    @PostMapping("/register")
    public ResponseEntity<Caregiver> registerCaregiver(@RequestBody Caregiver caregiver) {
        return ResponseEntity.ok(caregiverService.registerCaregiver(caregiver));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Caregiver>> getCaregiverById(@PathVariable Long id) {
        return ResponseEntity.ok(caregiverService.getCaregiverById(id));
    }
}