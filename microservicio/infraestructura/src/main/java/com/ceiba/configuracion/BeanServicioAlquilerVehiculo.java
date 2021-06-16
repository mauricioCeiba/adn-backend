package com.ceiba.configuracion;

import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioActualizarAlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioCrearAlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioEliminarAlquilerVehiculo;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioAlquilerVehiculo {

    @Bean
    public ServicioCrearAlquilerVehiculo servicioCrearAlquiler(RepositorioAlquilerVehiculo repositorioAlquilerVehiculo, RepositorioVehiculo repositorioVehiculo, RepositorioUsuario repositorioUsuario){
        return  new ServicioCrearAlquilerVehiculo(repositorioAlquilerVehiculo,repositorioVehiculo,repositorioUsuario);
    }

    @Bean
    public ServicioEliminarAlquilerVehiculo servicioEliminarAlquilerVehiculo(RepositorioAlquilerVehiculo repositorioAlquilerVehiculo) {
        return new ServicioEliminarAlquilerVehiculo(repositorioAlquilerVehiculo);
    }

    @Bean
    public ServicioActualizarAlquilerVehiculo servicioActualizarAlquilerVehiculo(RepositorioAlquilerVehiculo repositorioAlquilerVehiculo) {
        return new ServicioActualizarAlquilerVehiculo(repositorioAlquilerVehiculo);
    }
}
