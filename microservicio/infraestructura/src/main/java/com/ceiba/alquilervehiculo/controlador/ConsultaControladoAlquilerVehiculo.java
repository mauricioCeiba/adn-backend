package com.ceiba.alquilervehiculo.controlador;

import com.ceiba.alquilervehiculo.consulta.ManejadorListarAlquilerVehiculo;
import com.ceiba.alquilervehiculo.modelo.dto.DtoAlquilerVehiculo;
import com.ceiba.devolucionvehiculo.consulta.ManejadorListarDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.modelo.dto.DtoDevolucionVehiculo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alquiler")
public class ConsultaControladoAlquilerVehiculo {

    private final ManejadorListarAlquilerVehiculo manejadorListarAlquilerVehiculo;

    public ConsultaControladoAlquilerVehiculo(ManejadorListarAlquilerVehiculo manejadorListarAlquilerVehiculo){
        this.manejadorListarAlquilerVehiculo=manejadorListarAlquilerVehiculo;
    }


    @GetMapping
    @ApiOperation("Listar Devolucion Vehiculos")
    public List<DtoAlquilerVehiculo> listar() {
        return this.manejadorListarAlquilerVehiculo.ejecutar();
    }
}
