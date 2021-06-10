package com.ceiba.devolucionvehiculo.testdatabuilder;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.devolucionvehiculo.comando.ComandoDevolucionVehiculo;
import com.ceiba.usuario.comando.ComandoUsuario;

import java.util.Date;
import java.util.UUID;

public class ComandoDevolucionVehiculoTestDataBuilder {

    private Long id;
    private AlquilerVehiculo alquilerVehiculo;
    private Date fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;

    public ComandoDevolucionVehiculoTestDataBuilder() {
        porcentajeDeDano = 10;


    }

    public ComandoDevolucionVehiculoTestDataBuilder conPorcentajeDeDano(int porcentajeDeDano) {
        this.porcentajeDeDano = porcentajeDeDano;
        return this;
    }


    public ComandoDevolucionVehiculo build() {
        return new ComandoDevolucionVehiculo(id,alquilerVehiculo, fechaEntrega,porcentajeDeDano,valorPorMora,valorPorDanos,valorTotalAPagar);
    }
}
