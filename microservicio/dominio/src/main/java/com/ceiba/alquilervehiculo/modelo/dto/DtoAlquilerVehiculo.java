package com.ceiba.alquilervehiculo.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@AllArgsConstructor
public class DtoAlquilerVehiculo {

    private Long id;
    private Long vehiculosId;
    private Long usuariosId;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private LocalDate fechaAlquiler;
}
