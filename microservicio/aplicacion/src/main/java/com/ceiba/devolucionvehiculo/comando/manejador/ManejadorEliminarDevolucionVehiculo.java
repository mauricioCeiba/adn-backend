package com.ceiba.devolucionvehiculo.comando.manejador;

import com.ceiba.devolucionvehiculo.servicio.ServicioEliminarDevolucionVehiculo;
import com.ceiba.manejador.ManejadorComando;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarDevolucionVehiculo  implements ManejadorComando<Long> {

    private final ServicioEliminarDevolucionVehiculo servicioEliminarDevolucionVehiculo;

    public ManejadorEliminarDevolucionVehiculo(ServicioEliminarDevolucionVehiculo servicioEliminarDevolucionVehiculo) {
        this.servicioEliminarDevolucionVehiculo = servicioEliminarDevolucionVehiculo;
    }

    public void ejecutar(Long idDevolucionVehiculo) {
        this.servicioEliminarDevolucionVehiculo.ejecutar(idDevolucionVehiculo);
    }

}
