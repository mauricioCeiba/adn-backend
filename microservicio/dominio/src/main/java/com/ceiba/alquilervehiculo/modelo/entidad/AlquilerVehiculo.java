package com.ceiba.alquilervehiculo.modelo.entidad;

import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import lombok.Getter;

import java.util.Date;

@Getter
public class AlquilerVehiculo {


    private Long id;
    private Vehiculo vehiculo;
    private Usuario usuario;
    private int cantidadDiasAlquiler;
    private double valorTotalParcial;
    private Date fechaAlquiler;

    public AlquilerVehiculo(Long id,Vehiculo vehiculo,Usuario usuario, int cantidadDiasAlquiler,
                            Date fechaAlquiler){


        this.id = id;
        this.vehiculo = vehiculo;
        this.usuario = usuario;
        this.cantidadDiasAlquiler = cantidadDiasAlquiler;
        this.valorTotalParcial = calcularValorTotalParcial();
        this.fechaAlquiler = fechaAlquiler;

    }


    public double calcularValorTotalParcial(){

        if(this.cantidadDiasAlquiler > 10){
            this.valorTotalParcial = (this.vehiculo.getPrecioAlquilerPorDia()*this.cantidadDiasAlquiler)*(0.08);
        }
        else{
            this.valorTotalParcial = this.vehiculo.getPrecioAlquilerPorDia()*this.cantidadDiasAlquiler;
        }

        return  this.valorTotalParcial;
    }
}
