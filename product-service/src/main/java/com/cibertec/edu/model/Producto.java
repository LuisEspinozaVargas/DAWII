package com.cibertec.edu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    private Long id;
    private String uniqueCode;
    private String productName;
    private String productType;
    private String state;
    private BigDecimal balance;
    private LocalDateTime creationDate;
}
