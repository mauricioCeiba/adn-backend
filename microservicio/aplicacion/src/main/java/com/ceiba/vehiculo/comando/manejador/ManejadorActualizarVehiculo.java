package com.ceiba.vehiculo.comando.manejador;


import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.comando.fabrica.FabricaUsuario;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.usuario.servicio.ServicioActualizarUsuario;
import com.ceiba.vehiculo.comando.ComandoVehiculo;
import com.ceiba.vehiculo.comando.fabrica.FabricaVehiculo;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.servicio.ServicioActualizarVehiculo;

public class ManejadorActualizarVehiculo {

    private final FabricaVehiculo fabricaVehiculo;
    private final ServicioActualizarVehiculo servicioActualizarVehiculo;

    public ManejadorActualizarVehiculo(FabricaVehiculo fabricaVehiculo, ServicioActualizarVehiculo servicioActualizarVehiculo) {
        this.fabricaVehiculo = fabricaVehiculo;
        this.servicioActualizarVehiculo = servicioActualizarVehiculo;
    }

    public void ejecutar(ComandoVehiculo comandoVehiculo) {
        Vehiculo vehiculo = this.fabricaVehiculo.crear(comandoVehiculo);
        this.servicioActualizarVehiculo.ejecutar(vehiculo);
    }
}
