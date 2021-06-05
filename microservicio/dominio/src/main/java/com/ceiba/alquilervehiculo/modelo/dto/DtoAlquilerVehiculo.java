package com.ceiba.alquilervehiculo.modelo.dto;

import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class DtoAlquilerVehiculo {

    private Long id;
    private Vehiculo vehiculo;
    private Usuario usuario;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private Date fechaAlquiler;
}
