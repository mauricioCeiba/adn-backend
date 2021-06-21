package com.ceiba.alquilerVehiculo.servicio.testdatabuilder;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;

import java.time.LocalDate;
import java.util.Date;



public class AlquilerVehiculoTestDataBuilder {


    private Long id;
    private Long vehiculosId;
    private Long usuariosId;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private LocalDate fechaAlquiler;

    public AlquilerVehiculoTestDataBuilder( ) {

        vehiculosId = 1L;
        usuariosId = 1L;
        cantidadDiasAlquiler =10;
        valorTotalParcial = 100000;
        fechaAlquiler=LocalDate.of(2021,6,10);
    }

    public AlquilerVehiculoTestDataBuilder conIdVehiculo(Long VEHICULOS_id) {
        this.vehiculosId = VEHICULOS_id;
        return this;
    }

    public AlquilerVehiculoTestDataBuilder conCantidadDiasAlquiler(int cantidadDiasAlquiler) {
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        return this;
    }

    public AlquilerVehiculoTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }
    public AlquilerVehiculoTestDataBuilder conValorTotalParcial(double valorTotalParcial) {
        this.valorTotalParcial = valorTotalParcial;
        return this;
    }

    public AlquilerVehiculo build() {
        return new AlquilerVehiculo(id,vehiculosId, usuariosId,cantidadDiasAlquiler,fechaAlquiler,valorTotalParcial);
    }
}
