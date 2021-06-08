package com.ceiba.devolucionvehiculo.comando.manejador;

import com.ceiba.devolucionvehiculo.comando.ComandoDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.comando.fabrica.FabricaDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.devolucionvehiculo.servicio.ServicioActualizarDevolucionVehiculo;
import com.ceiba.manejador.ManejadorComando;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.comando.fabrica.FabricaUsuario;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.servicio.ServicioActualizarUsuario;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarDevolucionVehiculo implements ManejadorComando<ComandoDevolucionVehiculo> {

    private final FabricaDevolucionVehiculo fabricaDevolucionVehiculo;
    private final ServicioActualizarDevolucionVehiculo servicioActualizarDevolucionVehiculo;

    public ManejadorActualizarDevolucionVehiculo(FabricaDevolucionVehiculo fabricaDevolucionVehiculo,
                                                 ServicioActualizarDevolucionVehiculo servicioActualizarDevolucionVehiculo ) {
        this.fabricaDevolucionVehiculo = fabricaDevolucionVehiculo;
        this.servicioActualizarDevolucionVehiculo = servicioActualizarDevolucionVehiculo;
    }

    public void ejecutar(ComandoDevolucionVehiculo  comandoDevolucionVehiculo) {
        DevolucionVehiculo devolucionVehiculo = this.fabricaDevolucionVehiculo.crear(comandoDevolucionVehiculo);
        this.servicioActualizarDevolucionVehiculo.ejecutar(devolucionVehiculo);
    }
}
