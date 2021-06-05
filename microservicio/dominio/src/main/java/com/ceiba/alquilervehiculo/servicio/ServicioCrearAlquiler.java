package com.ceiba.alquilervehiculo.servicio;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;

public class ServicioCrearAlquiler {


    private static final String EL_ALQUILER_YA_EXISTE_EN_EL_SISTEMA = "El alquiler ya existe en el sistema";

    private final RepositorioAlquilerVehiculo repositorioAlquilerVehiculo;

    public ServicioCrearAlquiler(RepositorioAlquilerVehiculo repositorioAlquilerVehiculo){
        this.repositorioAlquilerVehiculo=repositorioAlquilerVehiculo;
    }

    public Long ejecutar(AlquilerVehiculo alquilerVehiculo) {
        validarExistenciaPrevia(alquilerVehiculo);
        return this.repositorioAlquilerVehiculo.crear(alquilerVehiculo);
    }

    private void validarExistenciaPrevia(AlquilerVehiculo alquilerVehiculo) {
        boolean existe = this.repositorioAlquilerVehiculo.existe(alquilerVehiculo.getId());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_ALQUILER_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
