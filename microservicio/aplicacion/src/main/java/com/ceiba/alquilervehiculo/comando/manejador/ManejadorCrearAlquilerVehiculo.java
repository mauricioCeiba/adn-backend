package com.ceiba.alquilervehiculo.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.alquilervehiculo.comando.ComandoAlquilerVehiculo;
import com.ceiba.alquilervehiculo.comando.fabrica.FabricaAlquilerVehiculo;
import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioCrearAlquiler;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearAlquilerVehiculo implements ManejadorComandoRespuesta<ComandoAlquilerVehiculo, ComandoRespuesta<Long>> {

private final FabricaAlquilerVehiculo fabricaAlquilerVehiculo;
private final ServicioCrearAlquiler servicioCrearAlquiler;

public ManejadorCrearAlquilerVehiculo(FabricaAlquilerVehiculo fabricaAlquilerVehiculo, ServicioCrearAlquiler servicioCrearAlquiler){
    this.fabricaAlquilerVehiculo = fabricaAlquilerVehiculo;
    this.servicioCrearAlquiler = servicioCrearAlquiler;
}

    @Override
    public ComandoRespuesta<Long> ejecutar(ComandoAlquilerVehiculo comandoAlquilerVehiculo) {
        AlquilerVehiculo alquilerVehiculo = this.fabricaAlquilerVehiculo.crear(comandoAlquilerVehiculo);
        return new ComandoRespuesta<>(this.servicioCrearAlquiler.ejecutar(alquilerVehiculo));
    }
}
