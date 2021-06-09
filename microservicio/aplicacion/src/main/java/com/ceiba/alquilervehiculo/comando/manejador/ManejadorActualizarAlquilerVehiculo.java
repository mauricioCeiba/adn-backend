package com.ceiba.alquilervehiculo.comando.manejador;

import com.ceiba.alquilervehiculo.comando.ComandoAlquilerVehiculo;
import com.ceiba.alquilervehiculo.comando.fabrica.FabricaAlquilerVehiculo;
import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioActualizarAlquilerVehiculo;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.comando.fabrica.FabricaUsuario;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.servicio.ServicioActualizarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarAlquilerVehiculo {

    private final FabricaAlquilerVehiculo fabricaAlquilerVehiculo ;
    private final ServicioActualizarAlquilerVehiculo servicioActualizarAlquilerVehiculo;

    public ManejadorActualizarAlquilerVehiculo(FabricaAlquilerVehiculo fabricaAlquilerVehiculo,
                                               ServicioActualizarAlquilerVehiculo servicioActualizarAlquilerVehiculo) {
        this.fabricaAlquilerVehiculo = fabricaAlquilerVehiculo;
        this.servicioActualizarAlquilerVehiculo = servicioActualizarAlquilerVehiculo;
    }

    public void ejecutar(ComandoAlquilerVehiculo comandoAlquilerVehiculo) {
        AlquilerVehiculo alquilerVehiculo = this.fabricaAlquilerVehiculo.crear(comandoAlquilerVehiculo);
        this.servicioActualizarAlquilerVehiculo.ejecutar(alquilerVehiculo);
    }
}
