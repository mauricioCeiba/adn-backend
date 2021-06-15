package com.ceiba.alquilervehiculo.controlador;


import com.ceiba.ComandoRespuesta;
import com.ceiba.alquilervehiculo.comando.ComandoAlquilerVehiculo;
import com.ceiba.alquilervehiculo.comando.manejador.ManejadorActualizarAlquilerVehiculo;
import com.ceiba.alquilervehiculo.comando.manejador.ManejadorCrearAlquilerVehiculo;
import com.ceiba.alquilervehiculo.comando.manejador.ManejadorEliminarAlquilerVehiculo;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.vehiculo.comando.ComandoVehiculo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alquilervehiculos")
@Api(tags = { "Controlador comando alquiler vehiculo"})
public class ComandoContoladorAlquilerVehiculo {
    private final ManejadorCrearAlquilerVehiculo manejadorCrearAlquilerVehiculo;
    private final ManejadorActualizarAlquilerVehiculo manejadorActualizarAlquilerVehiculo;
    private final ManejadorEliminarAlquilerVehiculo manejadorEliminarAlquilerVehiculo;

    @Autowired
    public ComandoContoladorAlquilerVehiculo(ManejadorCrearAlquilerVehiculo manejadorCrearAlquilerVehiculo, ManejadorActualizarAlquilerVehiculo manejadorActualizarAlquilerVehiculo, ManejadorEliminarAlquilerVehiculo manejadorEliminarAlquilerVehiculo){
        this.manejadorCrearAlquilerVehiculo = manejadorCrearAlquilerVehiculo;
        this.manejadorActualizarAlquilerVehiculo = manejadorActualizarAlquilerVehiculo;
        this.manejadorEliminarAlquilerVehiculo = manejadorEliminarAlquilerVehiculo;
    }

    @PostMapping
    @ApiOperation("Crear Alquiler Vehiculo")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoAlquilerVehiculo comandoAlquilerVehiculo) {
        return manejadorCrearAlquilerVehiculo.ejecutar(comandoAlquilerVehiculo);
    }

    @PutMapping(value="/{id}")
    @ApiOperation("Actualizar Usuario")
    public void actualizar(@RequestBody ComandoAlquilerVehiculo comandoAlquilerVehiculo, @PathVariable Long id) {
        comandoAlquilerVehiculo.setId(id);
        manejadorActualizarAlquilerVehiculo.ejecutar(comandoAlquilerVehiculo);
    }

    @DeleteMapping(value="/{id}")
    @ApiOperation("Eliminar Usuario")
    public void eliminar(@PathVariable Long id) {
        manejadorEliminarAlquilerVehiculo.ejecutar(id);
    }

}
