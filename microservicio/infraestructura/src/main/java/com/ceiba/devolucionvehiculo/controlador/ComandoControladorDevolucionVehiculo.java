package com.ceiba.devolucionvehiculo.controlador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.devolucionvehiculo.comando.ComandoDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.comando.manejador.ManejadorCrearDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.comando.manejador.ManejadorActualizarDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.comando.manejador.ManejadorEliminarDevolucionVehiculo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/devolucionvehiculo")
@Api(tags = { "Controlador comando devolucion  vehiculo"})
public class ComandoControladorDevolucionVehiculo {

    private  final ManejadorCrearDevolucionVehiculo manejadorCrearDevolucionVehiculo;
    private final ManejadorActualizarDevolucionVehiculo manejadorActualizarDevolucionVehiculo;
    private final ManejadorEliminarDevolucionVehiculo manejadorEliminarDevolucionVehiculo;

    @Autowired
    public ComandoControladorDevolucionVehiculo(ManejadorCrearDevolucionVehiculo manejadorCrearDevolucionVehiculo,
                                     ManejadorActualizarDevolucionVehiculo manejadorActualizarDevolucionVehiculo,
                                     ManejadorEliminarDevolucionVehiculo manejadorEliminarDevolucionVehiculo){

        this.manejadorCrearDevolucionVehiculo = manejadorCrearDevolucionVehiculo;
        this.manejadorActualizarDevolucionVehiculo = manejadorActualizarDevolucionVehiculo;
        this.manejadorEliminarDevolucionVehiculo = manejadorEliminarDevolucionVehiculo;
    }

    @PostMapping
    @ApiOperation("Crear Devolucion Vehiculo")
    public ComandoRespuesta<Long> crear(@RequestBody ComandoDevolucionVehiculo comandoDevolucionVehiculo) {
        return manejadorCrearDevolucionVehiculo.ejecutar(comandoDevolucionVehiculo);
    }

    @DeleteMapping(value="/{id}")
    @ApiOperation("Eliminar Devolucion Vehiculo")
    public void eliminar(@PathVariable Long id) {
        manejadorEliminarDevolucionVehiculo.ejecutar(id);
    }

    @PutMapping(value="/{id}")
    @ApiOperation("Actualizar Devolucion Vehiculo")
    public void actualizar(@RequestBody ComandoDevolucionVehiculo comandoDevolucionVehiculo,@PathVariable Long id) {
        comandoDevolucionVehiculo.setId(id);
        manejadorActualizarDevolucionVehiculo.ejecutar(comandoDevolucionVehiculo);
    }
}
