package com.ceiba.alquilervehiculo.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class DtoAlquilerVehiculo {

    private Long id;
    private Long VEHICULOS_id;
    private Long USUARIOS_id;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private Date fechaAlquiler;
}
