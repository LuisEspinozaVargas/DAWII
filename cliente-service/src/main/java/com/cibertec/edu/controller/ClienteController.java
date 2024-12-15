package com.cibertec.edu.controller;

import com.cibertec.edu.model.Cliente;
import com.cibertec.edu.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente) {
        Cliente saveCliente = clienteService.saveCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveCliente);
    }

    @GetMapping("/{codigoUnico}")
    public ResponseEntity<Cliente> obtenerCliente(@PathVariable String codigoUnico) {
        Cliente cliente = clienteService.obtenerClientePorCodigoUnico(codigoUnico);
        return cliente != null ? new ResponseEntity<>(cliente, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
