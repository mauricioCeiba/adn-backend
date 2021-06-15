package com.ceiba.alquilerVehiculo.servicio.testdatabuilder;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;

import java.util.Date;



public class AlquilerVehiculoTestDataBuilder {


    private Long id;
    private Long VEHICULOS_id;
    private Long USUARIOS_id;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private Date fechaAlquiler;

    public AlquilerVehiculoTestDataBuilder( ) {

        VEHICULOS_id = 1L;
        USUARIOS_id = 1L;
        cantidadDiasAlquiler =10;
        valorTotalParcial = 1000;
        fechaAlquiler=new Date(121,5,3);
    }

    public AlquilerVehiculoTestDataBuilder conIdVehiculo(Long VEHICULOS_id) {
        this.VEHICULOS_id = VEHICULOS_id;
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
        return new AlquilerVehiculo(id,VEHICULOS_id, USUARIOS_id,cantidadDiasAlquiler,fechaAlquiler);
    }
}
