package com.ceiba.alquilervehiculo.testdatabuilder;

import com.ceiba.alquilervehiculo.comando.ComandoAlquilerVehiculo;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;

import java.util.Date;


public class ComandoAlquilerVehiculoTestDataBuilder {

    private Long id;
    private Vehiculo  vehiculo;
    private Usuario usuario;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private Date fechaAlquiler;


    public ComandoAlquilerVehiculoTestDataBuilder() {

        this.vehiculo=new Vehiculo(3L, "HCX948", 150000, "CARRO");
        this.usuario = new Usuario(2L,"SOPHIA", "1097729359");



        this.cantidadDiasAlquiler = 2;
        this.valorTotalParcial=300000;
        this.fechaAlquiler=new Date();


    }

    public ComandoAlquilerVehiculoTestDataBuilder conCantidadDiasAlquiler(int cantidadDiasAlquiler) {
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        return this;
    }


    public ComandoAlquilerVehiculo build() {
        return new ComandoAlquilerVehiculo(id,vehiculo, usuario,cantidadDiasAlquiler,valorTotalParcial,fechaAlquiler);
    }
}
