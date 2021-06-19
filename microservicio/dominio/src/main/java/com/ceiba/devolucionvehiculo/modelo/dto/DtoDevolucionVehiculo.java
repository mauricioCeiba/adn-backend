package com.ceiba.devolucionvehiculo.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@AllArgsConstructor
public class DtoDevolucionVehiculo {

    private Long id;
    private Long idAlquilerVehiculos;
    private LocalDate fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;
}
