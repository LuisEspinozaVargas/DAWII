package com.cibertec.edu.bff_service.service;

import com.cibertec.edu.bff_service.feign.ClienteClient;
import com.cibertec.edu.bff_service.feign.ProductoClient;
import com.cibertec.edu.bff_service.model.Client;
import com.cibertec.edu.bff_service.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BffService {

    @Autowired
    private ClienteClient clienteClient;

    @Autowired
    private ProductoClient productoClient;

    // Obtener detalles del cliente y productos basados en el código único
    public Map<String, Object> obtenerDetalles(String codigoUnico) {
        Client cliente = clienteClient.obtenerCliente(codigoUnico);
        List<Product> productos = productoClient.obtenerProductos(codigoUnico);

        if (cliente == null || productos.isEmpty()) {
            return null; // O puedes manejar un error, dependiendo de la lógica de negocio
        }

        Map<String, Object> response = new HashMap<>();
        response.put("cliente", cliente);
        response.put("productos", productos);

        return response;
    }
}
