package com.ceiba.alquilervehiculo.consulta;

import com.ceiba.alquilervehiculo.modelo.dto.DtoAlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.dao.DaoAlquilerVehiculo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarAlquilerVehiculo {

    private final DaoAlquilerVehiculo daoAlquilerVehiculo;

    public ManejadorListarAlquilerVehiculo(DaoAlquilerVehiculo daoAlquilerVehiculo){
        this.daoAlquilerVehiculo = daoAlquilerVehiculo;
    }

    public List<DtoAlquilerVehiculo> ejecutar(){ return this.daoAlquilerVehiculo.listar();}
}
