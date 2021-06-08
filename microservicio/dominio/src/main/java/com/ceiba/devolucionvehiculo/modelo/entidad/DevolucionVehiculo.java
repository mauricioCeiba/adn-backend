package com.ceiba.devolucionvehiculo.modelo.entidad;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.usuario.modelo.entidad.Usuario;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import lombok.Getter;

import java.util.Calendar;
import java.util.Date;
@Getter
public class DevolucionVehiculo {

    private Long id;
    private AlquilerVehiculo alquilerVehiculo;
    private Date fechaEntrega;
    private int porcentajeDeDano;
    private double valorPorMora;
    private double valorPorDanos;
    private double valorTotalAPagar;


    public DevolucionVehiculo(Long id,AlquilerVehiculo alquilerVehiculo, Date fechaEntrega,int porcentajeDeDano){
        this.alquilerVehiculo = alquilerVehiculo;
        this.fechaEntrega = fechaEntrega;
        this.porcentajeDeDano = porcentajeDeDano;
        this.valorPorMora = calcularMora();
        this.valorPorDanos = calcularValorPorDanos();
        this.valorTotalAPagar = calcularValorTotalAPagar();


    }
public double calcularValorTotalAPagar(){
        return alquilerVehiculo.getValorTotalParcial()+valorPorMora+valorPorDanos;
}
    public double calcularValorPorDanos(){

        if(porcentajeDeDano>0 && porcentajeDeDano<=10){

            return alquilerVehiculo.getValorTotalParcial()*1.10;
        }
        else if(porcentajeDeDano>10 && porcentajeDeDano<=50){

            return alquilerVehiculo.getValorTotalParcial()*1.30;
        }
        else if(porcentajeDeDano>50 && porcentajeDeDano<=100){

            return alquilerVehiculo.getValorTotalParcial()*1.50;
        }
        return 0;
    }

    public double calcularMora(){

        Calendar calendar = Calendar.getInstance();
        Date fechaAlquiler= this.alquilerVehiculo.getFechaAlquiler();
        calendar.setTime(fechaAlquiler);
        //se le suma la cantidad de dias que alquilo el carro a la fecha de alquiler
        calendar.add(calendar.DAY_OF_YEAR, alquilerVehiculo.getCantidadDiasAlquiler());

        //si la fecha de entrega es mayor que el dia que tiene que retornar el vehiculo
        if(this.fechaEntrega.compareTo(calendar.getTime()) > 0){

            int diasMora= this.fechaEntrega.compareTo(calendar.getTime());
            return (alquilerVehiculo.getVehiculo().getPrecioAlquilerPorDia()*diasMora)*1.05;
        }
        return 0;
    }
}
