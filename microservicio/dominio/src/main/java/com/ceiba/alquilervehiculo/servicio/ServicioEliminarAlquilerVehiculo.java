package com.ceiba.alquilervehiculo.servicio;

import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;

public class ServicioEliminarAlquilerVehiculo {

    private final RepositorioAlquilerVehiculo repositorioAlquilerVehiculo;

    public ServicioEliminarAlquilerVehiculo(RepositorioAlquilerVehiculo repositorioAlquilerVehiculo) {
        this.repositorioAlquilerVehiculo = repositorioAlquilerVehiculo;
    }

    public void ejecutar(Long id) {
        this.repositorioAlquilerVehiculo.eliminar(id);
    }
}
