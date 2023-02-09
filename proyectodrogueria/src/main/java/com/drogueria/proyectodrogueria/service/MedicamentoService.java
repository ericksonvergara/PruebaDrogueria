package com.drogueria.proyectodrogueria.service;

import com.drogueria.proyectodrogueria.models.Medicamento;
import com.drogueria.proyectodrogueria.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public Medicamento bucarNombre(String nombre){

        Medicamento medicamentoAux = null;
        Optional<Medicamento> medicamento = medicamentoRepository.findByNombre(nombre);

        if(medicamento.isPresent()){
            medicamentoAux = medicamento.get();
        }
        return medicamentoAux;
    }

    public Medicamento saveMedicamento(Medicamento medicamento){
        Medicamento medicamentoAux = null;
        Medicamento medicamento1 = bucarNombre(medicamento.getNombre());
        if(medicamento1 == medicamentoAux){
            medicamentoAux = medicamentoRepository.save(medicamento);
        }
        return medicamentoAux;
    }

    public List<Medicamento> getMedicamentos(){
        return medicamentoRepository.findAll();
    }

    public Medicamento updateMedicamento(Medicamento medicamento, int id){
        Optional<Medicamento> updtMedicamento = medicamentoRepository.findById(id);
        if(updtMedicamento.isPresent()){
            updtMedicamento.get().setNombre(medicamento.getNombre());
            updtMedicamento.get().setLaboratorioFabrica(medicamento.getLaboratorioFabrica());
            updtMedicamento.get().setFechaFabricacion(medicamento.getFechaFabricacion());
            updtMedicamento.get().setFechaVencimiento(medicamento.getFechaVencimiento());
            updtMedicamento.get().setCantidadStock(medicamento.getCantidadStock());
            updtMedicamento.get().setValorUnitario(medicamento.getValorUnitario());
             return medicamentoRepository.save(updtMedicamento.get());
        }
        return null;
    }

    public String deleteMedicamento(int id){
        Optional<Medicamento> deletMedicamento = medicamentoRepository.findById(id);
        if(deletMedicamento.isPresent()){
            medicamentoRepository.deleteById(id);
            return "Medicamento Eliminado";
        }
        return "No existe Medicamento";
    }
}
