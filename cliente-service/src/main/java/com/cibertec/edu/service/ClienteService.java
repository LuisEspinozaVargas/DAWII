package com.cibertec.edu.service;

import com.cibertec.edu.model.Cliente;
import com.cibertec.edu.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente obtenerClientePorCodigoUnico(String codigoUnico) {
        Optional<Cliente> cliente = clienteRepository.findById(codigoUnico);
        return cliente.orElse(null);
    }

}
