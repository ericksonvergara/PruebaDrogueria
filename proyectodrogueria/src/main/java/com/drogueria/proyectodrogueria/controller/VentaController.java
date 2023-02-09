package com.drogueria.proyectodrogueria.controller;

import com.drogueria.proyectodrogueria.models.Venta;
import com.drogueria.proyectodrogueria.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/apiRest/medicamento")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @PostMapping("/venta/create")
    public ResponseEntity<Map<String, Object>> createVenta(@RequestBody Venta venta){

        Map<String, Object> respuesta = new HashMap<>();

        String mensaje = "Venta realizada exitosamente!";

        Venta venta1 = ventaService.createVenta(venta);
        if(venta1 == null){
            mensaje = "Algo salio mal!";
        }else {
            respuesta.put("Venta", venta);
            respuesta.put("Mensaje", mensaje);
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
