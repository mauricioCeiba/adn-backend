package com.ceiba.vehiculo.testdatabuilder;

import com.ceiba.usuario.comando.ComandoUsuario;
import com.ceiba.vehiculo.comando.ComandoVehiculo;

import java.util.UUID;

public class ComandoVehiculoTestDataBuilder {

    private Long id;
    private String placa;
    private double precioAlquilerPorDia;
    private String tipoVehiculo;

    public ComandoVehiculoTestDataBuilder() {
        placa = "icx531";
        tipoVehiculo = "CARRO";

    }

    public ComandoVehiculoTestDataBuilder conPlaca(String placa) {
        this.placa = placa;
        return this;
    }
    public ComandoVehiculoTestDataBuilder conTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
        return this;
    }

    public ComandoVehiculo build() {
        return new ComandoVehiculo(id,placa,precioAlquilerPorDia,tipoVehiculo);
    }
}
