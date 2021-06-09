package com.ceiba.configuracion;

import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioActualizarAlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioCrearAlquiler;
import com.ceiba.alquilervehiculo.servicio.ServicioEliminarAlquilerVehiculo;
import com.ceiba.usuario.puerto.repositorio.RepositorioUsuario;
import com.ceiba.usuario.servicio.ServicioActualizarUsuario;
import com.ceiba.usuario.servicio.ServicioEliminarUsuario;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import com.ceiba.vehiculo.servicio.ServicioCrearVehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioAlquilerVehiculo {

    @Bean
    public ServicioCrearAlquiler servicioCrearAlquiler(RepositorioAlquilerVehiculo repositorioAlquilerVehiculo){
        return  new ServicioCrearAlquiler(repositorioAlquilerVehiculo);
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
