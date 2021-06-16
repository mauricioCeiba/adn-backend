package com.ceiba.devolucionvehiculo.comando;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoDevolucionVehiculo {

    private Long id;
    private AlquilerVehiculo alquilerVehiculo;
    private Date fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;
}
