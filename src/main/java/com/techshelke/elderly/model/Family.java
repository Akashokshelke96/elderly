package com.techshelke.elderly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "families")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Family extends User {

    private String elderFirstName;
    private String elderLastName;
    private int elderAge;
    private String healthConditions;
}
