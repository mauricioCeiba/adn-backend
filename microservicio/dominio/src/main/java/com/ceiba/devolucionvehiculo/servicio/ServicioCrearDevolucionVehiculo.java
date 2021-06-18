package com.ceiba.devolucionvehiculo.servicio;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.devolucionvehiculo.puerto.repositorio.RepositorioDevolucionVehiculo;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;

import java.util.Calendar;
import java.util.Date;

public class ServicioCrearDevolucionVehiculo {
    private final RepositorioDevolucionVehiculo repositorioDevolucionVehiculo;
    private final RepositorioVehiculo repositorioVehiculo;
    private final RepositorioAlquilerVehiculo repositorioAlquilerVehiculo;

    public ServicioCrearDevolucionVehiculo(RepositorioDevolucionVehiculo repositorioDevolucionVehiculo, RepositorioVehiculo repositorioVehiculo, RepositorioAlquilerVehiculo repositorioAlquilerVehiculo) {

        this.repositorioDevolucionVehiculo = repositorioDevolucionVehiculo;
        this.repositorioVehiculo = repositorioVehiculo;
        this.repositorioAlquilerVehiculo = repositorioAlquilerVehiculo;
    }


    public Long ejecutar(DevolucionVehiculo devolucionVehiculo) {

        return this.repositorioDevolucionVehiculo.crear(asignarPrecios(devolucionVehiculo));
    }


    private DevolucionVehiculo asignarPrecios(DevolucionVehiculo devolucionVehiculo){
        AlquilerVehiculo alquilerVehiculo = repositorioAlquilerVehiculo.finById(devolucionVehiculo.getIdAlquilerVehiculos());

        devolucionVehiculo.setValorPorDanos(calcularValorPorDanos(devolucionVehiculo, alquilerVehiculo));
        devolucionVehiculo.setValorPorMora(calcularMora(devolucionVehiculo, alquilerVehiculo));
        devolucionVehiculo.setValorTotalAPagar(calcularValorTotalAPagar(devolucionVehiculo, alquilerVehiculo));

        return devolucionVehiculo;
    }

    private double calcularMora( DevolucionVehiculo devolucionVehiculo, AlquilerVehiculo alquilerVehiculo){

         Vehiculo vehiculo= repositorioVehiculo.finById(alquilerVehiculo.getVehiculosId());

        Calendar calendar = Calendar.getInstance();

        Date fechaAlquiler= alquilerVehiculo.getFechaAlquiler();
        calendar.setTime(fechaAlquiler);
        //se le suma la cantidad de dias que alquilo el carro a la fecha de alquiler
        calendar.add(calendar.DAY_OF_YEAR, alquilerVehiculo.getCantidadDiasAlquiler());

        //si la fecha de entrega es mayor que el dia que tiene que retornar el vehiculo
        if(devolucionVehiculo.getFechaEntrega().compareTo(calendar.getTime()) > 0){

            int diasMora= devolucionVehiculo.getFechaEntrega().compareTo(calendar.getTime());
            return (vehiculo.getPrecioAlquilerPorDia()*diasMora)*0.05;
        }
        return 0;
    }


    private double calcularValorTotalAPagar(DevolucionVehiculo devolucionVehiculo, AlquilerVehiculo alquilerVehiculo){


        return alquilerVehiculo.getValorTotalParcial()+devolucionVehiculo.getValorPorMora()+ devolucionVehiculo.getValorPorDanos();
    }

    private double calcularValorPorDanos(DevolucionVehiculo devolucionVehiculo,AlquilerVehiculo alquilerVehiculo){


        if(devolucionVehiculo.getPorcentajeDeDano()>0 && devolucionVehiculo.getPorcentajeDeDano()<=10){

            return alquilerVehiculo.getValorTotalParcial()*0.10;
        }
        else if(devolucionVehiculo.getPorcentajeDeDano()>10 && devolucionVehiculo.getPorcentajeDeDano()<=50){

            return alquilerVehiculo.getValorTotalParcial()*0.30;
        }
        else if(devolucionVehiculo.getPorcentajeDeDano()>50 && devolucionVehiculo.getPorcentajeDeDano()<=100){

            return alquilerVehiculo.getValorTotalParcial()*0.50;
        }
        return 0;
    }

}
