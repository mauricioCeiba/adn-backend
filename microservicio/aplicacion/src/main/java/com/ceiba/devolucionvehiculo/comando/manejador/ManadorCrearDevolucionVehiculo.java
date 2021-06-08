package com.ceiba.devolucionvehiculo.comando.manejador;

import com.ceiba.ComandoRespuesta;
import com.ceiba.devolucionvehiculo.comando.ComandoDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.comando.fabrica.FabricaDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.devolucionvehiculo.servicio.ServicioCrearDevolucionVehiculo;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.comando.fabrica.FabricaUsuario;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.servicio.ServicioCrearUsuario;
import org.springframework.stereotype.Component;

@Component
public class ManadorCrearDevolucionVehiculo {

    private final FabricaDevolucionVehiculo fabricaDevolucionVehiculo;
    private final ServicioCrearDevolucionVehiculo servicioCrearDevolucionVehiculo;

    public ManadorCrearDevolucionVehiculo(FabricaDevolucionVehiculo fabricaDevolucionVehiculo, ServicioCrearDevolucionVehiculo servicioCrearDevolucionVehiculo) {
        this.fabricaDevolucionVehiculo = fabricaDevolucionVehiculo;
        this.servicioCrearDevolucionVehiculo = servicioCrearDevolucionVehiculo;
    }

    public ComandoRespuesta<Long> ejecutar(ComandoDevolucionVehiculo comandoDevolucionVehiculo) {
        DevolucionVehiculo devolucionVehiculo = this.fabricaDevolucionVehiculo.crear(comandoDevolucionVehiculo);
        return new ComandoRespuesta<>(this.servicioCrearDevolucionVehiculo.ejecutar(devolucionVehiculo));
    }
}
