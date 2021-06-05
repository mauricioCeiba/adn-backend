package com.ceiba.alquilervehiculo.puerto.dao;

import com.ceiba.alquilervehiculo.modelo.dto.DtoAlquilerVehiculo;

import java.util.List;

public interface DaoAlquilerVehiculo {

    /**
     * Permite listar los alquileres
     * @return los DtoAlquilerVehiculo
     */
    List<DtoAlquilerVehiculo> listar();
}
