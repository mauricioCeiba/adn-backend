package com.ceiba.vehiculo.comando;

import com.ceiba.vehiculo.modelo.tipo.TipoVehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoVehiculo {

    private Long id;
    private String placa;
    private double precioAlquilerPorDia;
    private TipoVehiculo tipoVehiculo;
}
