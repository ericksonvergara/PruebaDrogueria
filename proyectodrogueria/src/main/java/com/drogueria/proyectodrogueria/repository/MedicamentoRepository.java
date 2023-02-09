package com.drogueria.proyectodrogueria.repository;

import java.util.Optional;

import com.drogueria.proyectodrogueria.models.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

    @Transactional
    Optional<Medicamento> findByNombre(String nombre);
}
