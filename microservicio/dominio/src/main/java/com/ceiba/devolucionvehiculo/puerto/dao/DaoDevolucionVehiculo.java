package com.ceiba.devolucionvehiculo.puerto.dao;

import com.ceiba.devolucionvehiculo.modelo.dto.DtoDevolucionVehiculo;

import java.util.List;

public interface DaoDevolucionVehiculo {

    /**
     * Permite listar usuarios
     * @return los usuarios
     */
    List<DtoDevolucionVehiculo> listar();
}
