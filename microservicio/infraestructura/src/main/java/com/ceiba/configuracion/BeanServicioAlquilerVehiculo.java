package com.ceiba.configuracion;

import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.alquilervehiculo.servicio.ServicioCrearAlquiler;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import com.ceiba.vehiculo.servicio.ServicioCrearVehiculo;
import org.springframework.context.annotation.Bean;

public class BeanServicioAlquilerVehiculo {

    @Bean
    public ServicioCrearAlquiler servicioCrearAlquiler(RepositorioAlquilerVehiculo repositorioAlquilerVehiculo){
        return  new ServicioCrearAlquiler(repositorioAlquilerVehiculo);
    }
}
