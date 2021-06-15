package com.ceiba.devolucionvehiculo.servicio;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.devolucionvehiculo.puerto.repositorio.RepositorioDevolucionVehiculo;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;


public class ServicioActualizarDevolucionVehiculo {

    private static final String LA_DEVOLUCION_YA_EXISTE_EN_EL_SISTEMA = "La devolucion ya existe en el sistema";

    private final RepositorioDevolucionVehiculo repositorioDevolucionVehiculo;


    public ServicioActualizarDevolucionVehiculo (RepositorioDevolucionVehiculo repositorioDevolucionVehiculo){

        this.repositorioDevolucionVehiculo = repositorioDevolucionVehiculo;

    }

    public void ejecutar(DevolucionVehiculo devolucionVehiculo) {
        // validarExistenciaPrevia(devolucionVehiculo);
        this.repositorioDevolucionVehiculo.actualizar(devolucionVehiculo);
    }

    private void validarExistenciaPrevia(DevolucionVehiculo devolucionVehiculo) {

        boolean existe = this.repositorioDevolucionVehiculo.existe(devolucionVehiculo.getId());
        if(existe) {
            throw new ExcepcionDuplicidad(LA_DEVOLUCION_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
