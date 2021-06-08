package com.ceiba.devolucionvehiculo.servicio;

import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.devolucionvehiculo.puerto.repositorio.RepositorioDevolucionVehiculo;
import com.ceiba.usuario.modelo.entidad.Usuario;

public class ServicioCrearDevolucionVehiculo {

    private final RepositorioDevolucionVehiculo repositorioDevolucionVehiculo;

    public ServicioCrearDevolucionVehiculo(RepositorioDevolucionVehiculo repositorioDevolucionVehiculo){

        this.repositorioDevolucionVehiculo = repositorioDevolucionVehiculo;
    }

    public Long ejecutar(DevolucionVehiculo devolucionVehiculo) {

        return this.repositorioDevolucionVehiculo.crear(devolucionVehiculo);
    }
}
