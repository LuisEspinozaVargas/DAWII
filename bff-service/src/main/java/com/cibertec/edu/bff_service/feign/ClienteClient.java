package com.cibertec.edu.bff_service.feign;

import com.cibertec.edu.bff_service.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cliente-service", url = "http://localhost:8083")
public interface ClienteClient {
    @GetMapping("/api/clientes/{codigoUnico}")
    Client obtenerCliente(@PathVariable String codigoUnico);
}
