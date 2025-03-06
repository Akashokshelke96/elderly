package com.techshelke.elderly.controller;

import com.techshelke.elderly.model.Family;
import com.techshelke.elderly.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/families")
@RequiredArgsConstructor
public class FamilyController {

    private final FamilyService familyService;

    @PostMapping("/register")
    public ResponseEntity<Family> registerFamily(@RequestBody Family family) {
        return ResponseEntity.ok(familyService.registerFamily(family));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Family>> getFamilyById(@PathVariable Long id) {
        return ResponseEntity.ok(familyService.getFamilyById(id));
    }
}
