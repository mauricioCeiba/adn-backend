package com.ceiba.alquilervehiculo.modelo.entidad;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AlquilerVehiculo {

    private Long id;
    private Long vehiculosId;
    private Long usuariosId;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private Date fechaAlquiler;

    public AlquilerVehiculo(){ }

    public AlquilerVehiculo(Long id,Long vehiculosId,Long usuariosId, int cantidadDiasAlquiler,
                            Date fechaAlquiler){


        this.id = id;
        this.vehiculosId = vehiculosId;
        this.usuariosId = usuariosId;
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        this.fechaAlquiler = fechaAlquiler;

    }


}
