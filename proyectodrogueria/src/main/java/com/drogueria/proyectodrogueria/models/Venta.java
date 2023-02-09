package com.drogueria.proyectodrogueria.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private Date Fecha;

    @Column(nullable = false)
    private String medicamento;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private int valorUnitario;

    @Column(nullable = false)
    private int valorTotal;

    @Column(nullable = false)
    private int idMedicamento;

    public Venta(){
        super();
    }

    public Venta(Date fecha, String medicamento, int cantidad, int valorUnitario, int valorTotal, int idMedicamento) {
        this.Fecha = fecha;
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.idMedicamento = idMedicamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMeedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
}
