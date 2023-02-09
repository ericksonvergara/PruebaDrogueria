package com.drogueria.proyectodrogueria.service;

import com.drogueria.proyectodrogueria.models.Medicamento;
import com.drogueria.proyectodrogueria.models.Venta;
import com.drogueria.proyectodrogueria.repository.MedicamentoRepository;
import com.drogueria.proyectodrogueria.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;

    @Autowired
    MedicamentoRepository medicamentoRepository;


    public Venta createVenta(Venta venta){
        Date fecha = new Date();
        venta.setFecha(fecha);

        Optional<Medicamento> medicamento = medicamentoRepository.findById(venta.getIdMedicamento());

        if(medicamento.isPresent()){
            int cantidad = venta.getCantidad();
            medicamento.get().setCantidadStock(medicamento.get().getCantidadStock()-cantidad);

            int valorTotal = cantidad * medicamento.get().getValorUnitario();
            if(valorTotal != venta.getValorTotal()){
                return null;
            }
        }
        return  ventaRepository.save(venta);
    }

}
