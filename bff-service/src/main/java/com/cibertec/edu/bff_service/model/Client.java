package com.cibertec.edu.bff_service.model;

import lombok.Data;

@Data
public class Client {
    private String uniqueCode;
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;

}
