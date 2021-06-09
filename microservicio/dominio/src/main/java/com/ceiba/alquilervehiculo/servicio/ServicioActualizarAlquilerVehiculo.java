package com.ceiba.alquilervehiculo.servicio;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.dominio.excepcion.ExcepcionDuplicidad;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;

public class ServicioActualizarAlquilerVehiculo {

    private static final String EL_ALQUILER_YA_EXISTE_EN_EL_SISTEMA = "El alquiler ya existe en el sistema";

    private final RepositorioAlquilerVehiculo repositorioAlquilerVehiculo;

    public ServicioActualizarAlquilerVehiculo(RepositorioAlquilerVehiculo repositorioAlquilerVehiculo) {
        this.repositorioAlquilerVehiculo = repositorioAlquilerVehiculo;
    }

    public void ejecutar(AlquilerVehiculo alquilerVehiculo) {
        validarExistenciaPrevia(alquilerVehiculo);
        this.repositorioAlquilerVehiculo.actualizar(alquilerVehiculo);
    }

    private void validarExistenciaPrevia(AlquilerVehiculo alquilerVehiculo) {
        boolean existe = this.repositorioAlquilerVehiculo.existeExcluyendoId(alquilerVehiculo.getId(),alquilerVehiculo.getUsuario().getNombre());
        if(existe) {
            throw new ExcepcionDuplicidad(EL_ALQUILER_YA_EXISTE_EN_EL_SISTEMA);
        }
    }
}
