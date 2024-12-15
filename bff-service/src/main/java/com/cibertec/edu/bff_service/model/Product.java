package com.cibertec.edu.bff_service.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Product {
    private Long id;
    private String uniqueCode;
    private String productName;
    private String productType;
    private String state;
    private BigDecimal balance;
    private LocalDateTime creationDate;

}
