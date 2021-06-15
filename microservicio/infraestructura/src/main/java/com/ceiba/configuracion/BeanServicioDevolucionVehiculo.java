package com.ceiba.configuracion;

import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.devolucionvehiculo.puerto.repositorio.RepositorioDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.servicio.ServicioActualizarDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.servicio.ServicioCrearDevolucionVehiculo;
import com.ceiba.devolucionvehiculo.servicio.ServicioEliminarDevolucionVehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioDevolucionVehiculo {


    @Bean
    public ServicioCrearDevolucionVehiculo servicioCrearDevolucionVehiculo(RepositorioDevolucionVehiculo repositorioDevolucionVehiculo, RepositorioVehiculo repositorioVehiculo, RepositorioAlquilerVehiculo repositorioAlquilerVehiculo) {
        return new ServicioCrearDevolucionVehiculo(repositorioDevolucionVehiculo, repositorioVehiculo,repositorioAlquilerVehiculo);
    }

    @Bean
    public ServicioEliminarDevolucionVehiculo servicioEliminarDevolucionVehiculo(RepositorioDevolucionVehiculo repositorioDevolucionVehiculo) {
        return new ServicioEliminarDevolucionVehiculo(repositorioDevolucionVehiculo);
    }

    @Bean
    public ServicioActualizarDevolucionVehiculo servicioActualizarDevolucionVehiculo(RepositorioDevolucionVehiculo repositorioDevolucionVehiculo) {
        return new ServicioActualizarDevolucionVehiculo(repositorioDevolucionVehiculo);
    }


}
