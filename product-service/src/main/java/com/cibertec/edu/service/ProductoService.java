package com.cibertec.edu.service;

import com.cibertec.edu.model.Producto;
import com.cibertec.edu.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerProductosPorCodigoUnico(String codigoUnico) {
        return productoRepository.findByUniqueCode(codigoUnico);
    }

    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }
}
