package com.drogueria.proyectodrogueria.repository;

import com.drogueria.proyectodrogueria.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository  extends JpaRepository<Venta, Integer> {
}
