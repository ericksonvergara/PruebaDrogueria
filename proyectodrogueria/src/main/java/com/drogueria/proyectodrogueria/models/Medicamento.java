package com.drogueria.proyectodrogueria.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;


@Entity
@Getter
@Setter
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(nullable = false)
    private String laboratorioFabrica;

    @Column(nullable = false)
    private Date fechaFabricacion;

    @Column(nullable = false)
    private Date fechaVencimiento;

    @Column(nullable = false)
    private int cantidadStock;

    @Column(nullable = false)
    private int valorUnitario;

    public Medicamento(){
        super();
    }

    public Medicamento(String nombre, String laboratorioFabrica, Date fechaFabricacion, Date fechaVencimiento, int cantidadStock, int valorUnitario) {
        this.nombre = nombre;
        this.laboratorioFabrica = laboratorioFabrica;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidadStock = cantidadStock;
        this.valorUnitario = valorUnitario;
    }
}
