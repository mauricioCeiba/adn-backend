package com.ceiba.alquilervehiculo.modelo.entidad;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import static com.ceiba.dominio.ValidadorArgumento.*;

@Getter
@Setter
public class AlquilerVehiculo {

    private Long id;
    private Long vehiculosId;
    private Long usuariosId;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private LocalDate fechaAlquiler;

    private static final String EL_ID_NO_PUEDE_SER_NULL= "El id no pude ser nulo";
    private static final String EL_ID_DEL_VEHICULO_NO_PUEDE_SER_NULL= "El id del vehiculo no pude ser nulo";
    private static final String EL_ID_DEL_USUARIO_NO_PUEDE_SER_NULL= "El id del usuario no pude ser nulo";
    private static final String EL_VALOR_PARCIAL_PUEDE_SER_NEGATIVO= "El valor parcial no puede ser negativo";
    private static final String LA_CANTIDAD_DE_DIAS_DEBE_SER_MAYOR_A_CERO="La cantidad de dias debe ser mayor a cero";

    public AlquilerVehiculo(Long id,Long vehiculosId,Long usuariosId, int cantidadDiasAlquiler,
                            LocalDate fechaAlquiler, double valorTotalParcial){


        validarObligatorio(vehiculosId,EL_ID_DEL_VEHICULO_NO_PUEDE_SER_NULL);
        validarObligatorio(usuariosId,EL_ID_DEL_USUARIO_NO_PUEDE_SER_NULL);
        validarPositivo(valorTotalParcial,EL_VALOR_PARCIAL_PUEDE_SER_NEGATIVO);
        validarPositivo(cantidadDiasAlquiler,LA_CANTIDAD_DE_DIAS_DEBE_SER_MAYOR_A_CERO);

        this.id = id;
        this.vehiculosId = vehiculosId;
        this.usuariosId = usuariosId;
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        this.fechaAlquiler = fechaAlquiler;
        this.valorTotalParcial=valorTotalParcial;

    }


}
