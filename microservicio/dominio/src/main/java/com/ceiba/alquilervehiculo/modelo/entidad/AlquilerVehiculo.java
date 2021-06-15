package com.ceiba.alquilervehiculo.modelo.entidad;

import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AlquilerVehiculo {

    private Long id;
    private Long VEHICULOS_id;
    private Long USUARIOS_id;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private Date fechaAlquiler;

    public AlquilerVehiculo(){ }

    public AlquilerVehiculo(Long id,Long VEHICULOS_id,Long USUARIOS_id, int cantidadDiasAlquiler,
                            Date fechaAlquiler){


        this.id = id;
        this.VEHICULOS_id = VEHICULOS_id;
        this.USUARIOS_id = USUARIOS_id;
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        this.fechaAlquiler = fechaAlquiler;

    }


}
