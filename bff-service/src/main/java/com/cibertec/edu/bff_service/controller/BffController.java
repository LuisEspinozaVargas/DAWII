package com.cibertec.edu.bff_service.controller;

import com.cibertec.edu.bff_service.service.BffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/detalles")
public class BffController {

    @Autowired
    private BffService bffService;

    @GetMapping("/{codigoUnico}")
    public ResponseEntity<Map<String, Object>> obtenerDetalles(@PathVariable String codigoUnico) {
        Map<String, Object> response = bffService.obtenerDetalles(codigoUnico);

        if (response == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
