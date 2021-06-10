package com.ceiba.vehiculo.servicio.testdatabuilder;

import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;

public class VehiculoTestDataBuilder {

    private Long id;
    private String placa;
    private double precioAlquilerPorDia;
    private String tipoVehiculo;


    public VehiculoTestDataBuilder() {
        placa = "icx123";
        precioAlquilerPorDia = 12345678;
        tipoVehiculo ="CARRO";
    }

    public VehiculoTestDataBuilder conPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public VehiculoTestDataBuilder conId(Long id) {
        this.id = id;
        return this;
    }

    public Vehiculo build() {
        return new Vehiculo(id,placa, precioAlquilerPorDia,tipoVehiculo);
    }
}
