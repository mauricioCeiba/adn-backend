package com.ceiba.alquilervehiculo.comando.fabrica;

import com.ceiba.alquilervehiculo.comando.ComandoAlquilerVehiculo;
import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.modelo.entidad.Usuario;
import org.springframework.stereotype.Component;

@Component
public class FabricaAlquilerVehiculo {

    public AlquilerVehiculo crear(ComandoAlquilerVehiculo comandoAlquilerVehiculo) {
        return new AlquilerVehiculo(
                comandoAlquilerVehiculo.getId(),
                comandoAlquilerVehiculo.getVehiculo(),
                comandoAlquilerVehiculo.getUsuario(),
                comandoAlquilerVehiculo.getCantidadDiasAlquiler(),
                comandoAlquilerVehiculo.getFechaAlquiler()
        );
    }
}
