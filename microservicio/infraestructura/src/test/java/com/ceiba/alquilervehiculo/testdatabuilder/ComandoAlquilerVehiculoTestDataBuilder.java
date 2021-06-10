package com.ceiba.alquilervehiculo.testdatabuilder;

import com.ceiba.alquilervehiculo.comando.ComandoAlquilerVehiculo;
import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;

import java.util.Date;
import java.util.UUID;

public class ComandoAlquilerVehiculoTestDataBuilder {

    private Long id;
    private Vehiculo  vehiculo;
    private Usuario usuario;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private Date fechaAlquiler;

    public ComandoAlquilerVehiculoTestDataBuilder() {
        cantidadDiasAlquiler = 2;


    }

    public ComandoAlquilerVehiculoTestDataBuilder conCantidadDiasAlquiler(int cantidadDiasAlquiler) {
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        return this;
    }


    public ComandoAlquilerVehiculo build() {
        return new ComandoAlquilerVehiculo(id,vehiculo, usuario,cantidadDiasAlquiler,valorTotalParcial,fechaAlquiler);
    }
}
