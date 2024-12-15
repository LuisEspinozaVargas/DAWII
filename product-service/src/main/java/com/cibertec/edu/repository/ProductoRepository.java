package com.cibertec.edu.repository;

import com.cibertec.edu.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByUniqueCode(String uniqueCode);
}
