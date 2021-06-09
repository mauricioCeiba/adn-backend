package com.ceiba.alquilervehiculo.comando.manejador;
import com.ceiba.alquilervehiculo.servicio.ServicioEliminarAlquilerVehiculo;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarAlquilerVehiculo {

    private final ServicioEliminarAlquilerVehiculo servicioEliminarAlquilerVehiculo;

    public ManejadorEliminarAlquilerVehiculo(ServicioEliminarAlquilerVehiculo servicioEliminarAlquilerVehiculo) {
        this.servicioEliminarAlquilerVehiculo = servicioEliminarAlquilerVehiculo;
    }

    public void ejecutar(Long idAlquilerVehiculo) {
        this.servicioEliminarAlquilerVehiculo.ejecutar(idAlquilerVehiculo);
    }
}
