package com.ceiba.alquilervehiculo.testdatabuilder;

import com.ceiba.alquilervehiculo.comando.ComandoAlquilerVehiculo;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;

import java.time.LocalDate;
import java.util.Date;


public class ComandoAlquilerVehiculoTestDataBuilder {

    private Long id;
    private Long  vehiculosId;
    private Long usuariosId;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private LocalDate fechaAlquiler;


    public ComandoAlquilerVehiculoTestDataBuilder() {




        this.vehiculosId = 1L;
        this.usuariosId = 1L;
        this.cantidadDiasAlquiler = 2;
        this.valorTotalParcial=300000;
        this.fechaAlquiler= LocalDate.now();


    }

    public ComandoAlquilerVehiculoTestDataBuilder conCantidadDiasAlquiler(int cantidadDiasAlquiler) {
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        return this;
    }


    public ComandoAlquilerVehiculo build() {
        return new ComandoAlquilerVehiculo(id,vehiculosId, usuariosId,cantidadDiasAlquiler,valorTotalParcial,fechaAlquiler);
    }
}
