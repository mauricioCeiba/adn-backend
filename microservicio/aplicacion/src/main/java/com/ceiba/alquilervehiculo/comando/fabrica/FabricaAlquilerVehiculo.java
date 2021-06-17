package com.ceiba.alquilervehiculo.comando.fabrica;

import com.ceiba.alquilervehiculo.comando.ComandoAlquilerVehiculo;
import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import org.springframework.stereotype.Component;

@Component
public class FabricaAlquilerVehiculo {

    public AlquilerVehiculo crear(ComandoAlquilerVehiculo comandoAlquilerVehiculo) {
        return new AlquilerVehiculo(
                comandoAlquilerVehiculo.getId(),
                comandoAlquilerVehiculo.getVehiculosId(),
                comandoAlquilerVehiculo.getUsuariosId(),
                comandoAlquilerVehiculo.getCantidadDiasAlquiler(),
                comandoAlquilerVehiculo.getFechaAlquiler()
        );
    }
}
