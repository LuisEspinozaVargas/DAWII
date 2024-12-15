package com.cibertec.edu.controller;

import com.cibertec.edu.model.Producto;
import com.cibertec.edu.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/{codigoUnico}")
    public ResponseEntity<List<Producto>> obtenerProductos(@PathVariable String codigoUnico) {
        List<Producto> productos = productoService.obtenerProductosPorCodigoUnico(codigoUnico);
        return productos.isEmpty() ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Producto> guardarProducto(@RequestBody Producto producto) {
        Producto createProducto = productoService.createProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createProducto);
    }
}
