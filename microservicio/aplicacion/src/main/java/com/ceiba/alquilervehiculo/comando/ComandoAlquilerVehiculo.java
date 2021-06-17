package com.ceiba.alquilervehiculo.comando;

import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoAlquilerVehiculo {

    private Long id;
    private Long vehiculosId;
    private Long usuariosId;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private Date fechaAlquiler;
}
