package com.drogueria.proyectodrogueria.controller;

import com.drogueria.proyectodrogueria.models.Medicamento;
import com.drogueria.proyectodrogueria.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apiRest/medicamento")
public class MedicamentoController {

    @Autowired
    MedicamentoService medicamentoService;

    @PostMapping("/save")
    public ResponseEntity<Map<String, Object>> save(@RequestBody Medicamento medicamento){

        Map respuesta = new HashMap();

        String mensaje = "Se guardo el medicamento!";

        Medicamento medicamentosave = medicamentoService.saveMedicamento(medicamento);
        if(medicamentosave == null){
            mensaje = "Ya existe el medicamento!";
        }
        respuesta.put("Medicamento", medicamento);
        respuesta.put("mensaje", mensaje);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<Map<String, Object>> getMedicamento(){

        List<Medicamento> medicamentos = new ArrayList<Medicamento>(medicamentoService.getMedicamentos());


        Map respuesta = new HashMap();

        String mensaje = "No existen medicamentos registrados!";


        if(medicamentos.size() > 0){
            mensaje = "lista de medicamentos";
        }
        respuesta.put("Medicamentos", medicamentos);
        respuesta.put("mensaje", mensaje);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Map<String, Object>> updateMedicamento(@RequestBody Medicamento medicamento, @RequestParam int id){

        Medicamento medicamentosuptd = medicamentoService.updateMedicamento(medicamento, id);


        Map respuesta = new HashMap();

        String mensaje = "No existen medicamento!";


        if(medicamentosuptd != null){
            mensaje = "medicamento actualizado correctamente";
        }
        respuesta.put("Medicamentos", medicamentosuptd);
        respuesta.put("mensaje", mensaje);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Map<String, Object>> deleteMedicamento(@RequestParam int id){

        String mensaje = medicamentoService.deleteMedicamento(id);

        Map respuesta = new HashMap();

        respuesta.put("mensaje", mensaje);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
