package com.ceiba.devolucionvehiculo.servicio;

import com.ceiba.devolucionvehiculo.puerto.repositorio.RepositorioDevolucionVehiculo;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;

public class ServicioEliminarDevolucionVehiculo {


    private final RepositorioDevolucionVehiculo repositorioDevolucionVehiculo;

    public ServicioEliminarDevolucionVehiculo(RepositorioDevolucionVehiculo repositorioDevolucionVehiculo) {
        this.repositorioDevolucionVehiculo = repositorioDevolucionVehiculo;
    }

    public void ejecutar(Long id) {
        this.repositorioDevolucionVehiculo.eliminar(id);
    }
}
