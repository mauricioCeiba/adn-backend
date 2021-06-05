package com.ceiba.vehiculo.modelo.entidad;

import com.ceiba.vehiculo.modelo.tipo.TipoVehiculo;
import lombok.Getter;

import static com.ceiba.dominio.ValidadorArgumento.*;

@Getter
public class Vehiculo {

    private static final String LA_PLACA_DEBE_TENER_UNA_LONGITUD_IGUAL_A = "La placa debe tener una longitud  igual a %s";
    private static final String SE_DEBE_INGRESAR_LA_CEDULA = "Se debe ingresar la cedula";
    private static final String SE_DEBE_INGRESAR_LA_PLACA_DEL_VEHICULO = "Se debe ingresar la placa del vehiculo";
    private static final String SE_DEBE_INGRESAR_UN_PRECIO_ALQUILER_POSITIVO = "Debe ingresar un precio de alquiler positivo";

    private static final int LONGITUD_MINIMA_PLACA = 6;

    private Long id;
    private String placa;
    private double precioAlquilerPorDia;
    private TipoVehiculo tipoVehiculo;

    public Vehiculo(Long id, String placa, double precioAlquilerPorDia, TipoVehiculo tipoVehiculo) {
        validarObligatorio(placa, SE_DEBE_INGRESAR_LA_PLACA_DEL_VEHICULO);
        validarLongitud(placa, LONGITUD_MINIMA_PLACA, LA_PLACA_DEBE_TENER_UNA_LONGITUD_IGUAL_A);
        validarPositivo(precioAlquilerPorDia, SE_DEBE_INGRESAR_UN_PRECIO_ALQUILER_POSITIVO);


        this.id = id;
        this.placa = placa;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
        this.tipoVehiculo = tipoVehiculo;

    }



}
