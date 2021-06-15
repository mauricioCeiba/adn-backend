package com.ceiba.devolucionvehiculo.modelo.dto;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class DtoDevolucionVehiculo {

    private Long id;
    private Long ALQUILER_VEHICULOS_id;
    private Date fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;
}
