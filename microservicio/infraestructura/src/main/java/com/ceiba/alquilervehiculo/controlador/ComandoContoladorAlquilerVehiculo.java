package com.ceiba.alquilervehiculo.controlador;


import com.ceiba.ComandoRespuesta;
import com.ceiba.alquilervehiculo.comando.ComandoAlquilerVehiculo;
import com.ceiba.alquilervehiculo.comando.manejador.ManejadorCrearAlquilerVehiculo;
import com.ceiba.vehiculo.comando.ComandoVehiculo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alquilervehiculos")
@Api(tags = { "Controlador comando alquiler vehiculo"})
public class ComandoContoladorAlquilerVehiculo {


    private final ManejadorCrearAlquilerVehiculo manejadorCrearAlquilerVehiculo;

    @Autowired
    public ComandoContoladorAlquilerVehiculo(ManejadorCrearAlquilerVehiculo manejadorCrearAlquilerVehiculo){
        this.manejadorCrearAlquilerVehiculo = manejadorCrearAlquilerVehiculo;
    }

    @PostMapping
    @ApiOperation("Crear Alquiler Vehiculo")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoAlquilerVehiculo comandoAlquilerVehiculo) {
        return manejadorCrearAlquilerVehiculo.ejecutar(comandoAlquilerVehiculo);
    }
}
