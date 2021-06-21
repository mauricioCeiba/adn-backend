package com.ceiba.alquilervehiculo.modelo.entidad;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class AlquilerVehiculo {

    private Long id;
    private Long vehiculosId;
    private Long usuariosId;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private LocalDate fechaAlquiler;



    public AlquilerVehiculo(Long id,Long vehiculosId,Long usuariosId, int cantidadDiasAlquiler,
                            LocalDate fechaAlquiler, double valorTotalParcial){


        this.id = id;
        this.vehiculosId = vehiculosId;
        this.usuariosId = usuariosId;
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        this.fechaAlquiler = fechaAlquiler;
        this.valorTotalParcial=valorTotalParcial;

    }


}
