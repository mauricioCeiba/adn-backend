package com.ceiba.devolucionvehiculo.comando.fabrica;

import com.ceiba.devolucionvehiculo.comando.ComandoDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.modelo.entidad.Usuario;
import org.springframework.stereotype.Component;

@Component
public class FabricaDevolucionVehiculo {

    public DevolucionVehiculo crear(ComandoDevolucionVehiculo comandoDevolucionVehiculo) {
        return new DevolucionVehiculo(
                comandoDevolucionVehiculo.getId(),
                comandoDevolucionVehiculo.getAlquilerVehiculo().getId(),
                comandoDevolucionVehiculo.getFechaEntrega(),
                comandoDevolucionVehiculo.getPorcentajeDeDano()
               );
    }
}
