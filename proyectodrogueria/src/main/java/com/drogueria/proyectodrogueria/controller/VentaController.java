package com.drogueria.proyectodrogueria.controller;

import com.drogueria.proyectodrogueria.models.Medicamento;
import com.drogueria.proyectodrogueria.models.Venta;
import com.drogueria.proyectodrogueria.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apiRest/venta")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @PostMapping("/create")
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

    @GetMapping("/get")
    public ResponseEntity<Map<String, Object>> getVenta(){

        List<Venta> venta = new ArrayList<Venta>(ventaService.getVenta());


        Map respuesta = new HashMap();

        String mensaje = "No existen ventas registradas!";


        if(venta.size() > 0){
            mensaje = "lista de ventas";
        }
        respuesta.put("ventas", venta);
        respuesta.put("mensaje", mensaje);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
