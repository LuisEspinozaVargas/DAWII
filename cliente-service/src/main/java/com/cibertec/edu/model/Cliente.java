package com.cibertec.edu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    private String uniqueCode;
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
}
