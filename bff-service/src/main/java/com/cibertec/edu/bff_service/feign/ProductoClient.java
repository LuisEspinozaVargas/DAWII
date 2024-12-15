package com.cibertec.edu.bff_service.feign;

import com.cibertec.edu.bff_service.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service", url = "http://localhost:8082")
public interface ProductoClient {

    @GetMapping("/api/productos/{codigoUnico}")
    List<Product> obtenerProductos(@PathVariable String codigoUnico);
}
