package com.ceiba.vehiculo.servicio;

import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;

public class ServicioActualizarVehiculo {

    private static final String EL_VEHICUL_YA_EXISTE_EN_EL_SISTEMA = "El vehiculo ya existe en el sistema";

    private final RepositorioVehiculo repositorioVehiculo;

    public ServicioActualizarVehiculo(RepositorioVehiculo repositorioVehiculo){


        this.repositorioVehiculo=repositorioVehiculo;
    }
    public void ejecutar(Vehiculo vehiculo) {
        validarExistenciaPrevia(vehiculo);
        this.repositorioVehiculo.actualizar(vehiculo);
    }

    public void validarExistenciaPrevia(Vehiculo  vehiculo){

        boolean exist= this.repositorioVehiculo.existeExcluyendoId(vehiculo.getId(),vehiculo.getPlaca());
        if(exist){
            throw new ExcepcionDuplicidad(EL_VEHICUL_YA_EXISTE_EN_EL_SISTEMA);
        }

    }
}
