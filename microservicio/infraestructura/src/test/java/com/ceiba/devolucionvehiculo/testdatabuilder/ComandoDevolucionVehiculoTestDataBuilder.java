package com.ceiba.devolucionvehiculo.testdatabuilder;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.devolucionvehiculo.comando.ComandoDevolucionVehiculo;
import com.ceiba.usuario.comando.ComandoUsuario;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class ComandoDevolucionVehiculoTestDataBuilder {

    private Long id;
    private Long idAlquilerVehiculo;
    private LocalDate fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;

    public ComandoDevolucionVehiculoTestDataBuilder() {
        porcentajeDeDano = 10;
        valorPorMora= 0;
        valorPorDanos=0;
        valorTotalAPagar=100000;
        fechaEntrega = LocalDate.now();
        idAlquilerVehiculo = 1L;
    }

    public ComandoDevolucionVehiculoTestDataBuilder conPorcentajeDeDano(int porcentajeDeDano) {
        this.porcentajeDeDano = porcentajeDeDano;
        return this;
    }




    public ComandoDevolucionVehiculo build() {
        return new ComandoDevolucionVehiculo(id,idAlquilerVehiculo, fechaEntrega,porcentajeDeDano,valorPorMora,valorPorDanos,valorTotalAPagar);
    }
}
