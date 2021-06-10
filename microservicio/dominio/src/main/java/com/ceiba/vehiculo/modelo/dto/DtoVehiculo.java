package com.ceiba.vehiculo.modelo.dto;


import com.ceiba.vehiculo.modelo.tipo.TipoVehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoVehiculo {

    private Long id;
    private String placa;
    private double precioAlquilerPorDia;
    private String tipoVehiculo;
}
