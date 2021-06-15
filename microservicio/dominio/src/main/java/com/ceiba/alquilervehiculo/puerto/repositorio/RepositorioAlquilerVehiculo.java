package com.ceiba.alquilervehiculo.puerto.repositorio;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;

public interface RepositorioAlquilerVehiculo {

    /**
     * Permite crear un alquilerVehiculo
     * @param alquilerVehiculo
     * @return el id generado
     */
    Long crear(AlquilerVehiculo  alquilerVehiculo);

    /**
     * Permite actualizar un alquilerVehiculo
     * @param alquilerVehiculo
     */
    void actualizar(AlquilerVehiculo alquilerVehiculo);

    /**
     * Permite eliminar un usuario
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe un alquilerVehiculo por id
     * @param id
     * @return si existe o no
     */
    boolean existe(Long id);

    /**
     * Permite validar si existe un alquilerVehiculo por nombre de la persona excluyendo un id
     * @param id
     * @return si existe o no
     */
    boolean existeExcluyendoId(Long id);


    AlquilerVehiculo finById(Long id);



}
