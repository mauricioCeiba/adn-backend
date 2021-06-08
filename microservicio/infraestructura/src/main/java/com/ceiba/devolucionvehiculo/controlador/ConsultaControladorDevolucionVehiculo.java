package com.ceiba.devolucionvehiculo.controlador;

import com.ceiba.devolucionvehiculo.consulta.ManejadorListarDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.modelo.dto.DtoDevolucionVehiculo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ConsultaControladorDevolucionVehiculo {

    private final ManejadorListarDevolucionVehiculo manejadorListarDevolucionVehiculo;

    public ConsultaControladorDevolucionVehiculo(ManejadorListarDevolucionVehiculo manejadorListarDevolucionVehiculo){

        this.manejadorListarDevolucionVehiculo=manejadorListarDevolucionVehiculo;
    }


    @GetMapping
    @ApiOperation("Listar Devolucion Vehiculos")
    public List<DtoDevolucionVehiculo> listar() {
        return this.manejadorListarDevolucionVehiculo.ejecutar();
    }
}
