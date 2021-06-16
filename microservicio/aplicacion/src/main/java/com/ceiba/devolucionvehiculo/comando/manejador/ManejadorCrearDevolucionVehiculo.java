package com.ceiba.devolucionvehiculo.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.devolucionvehiculo.comando.ComandoDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.comando.fabrica.FabricaDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.devolucionvehiculo.servicio.ServicioCrearDevolucionVehiculo;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearDevolucionVehiculo {

    private final FabricaDevolucionVehiculo fabricaDevolucionVehiculo;
    private final ServicioCrearDevolucionVehiculo servicioCrearDevolucionVehiculo;

    public ManejadorCrearDevolucionVehiculo(FabricaDevolucionVehiculo fabricaDevolucionVehiculo, ServicioCrearDevolucionVehiculo servicioCrearDevolucionVehiculo) {
        this.fabricaDevolucionVehiculo = fabricaDevolucionVehiculo;
        this.servicioCrearDevolucionVehiculo = servicioCrearDevolucionVehiculo;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoDevolucionVehiculo comandoDevolucionVehiculo) {
        DevolucionVehiculo devolucionVehiculo = this.fabricaDevolucionVehiculo.crear(comandoDevolucionVehiculo);
        return new ComandoRespuesta<>(this.servicioCrearDevolucionVehiculo.ejecutar(devolucionVehiculo));
    }
}
