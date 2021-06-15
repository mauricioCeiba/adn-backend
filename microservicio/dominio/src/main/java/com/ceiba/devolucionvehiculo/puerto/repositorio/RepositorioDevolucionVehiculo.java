package com.ceiba.devolucionvehiculo.puerto.repositorio;

import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.usuario.modelo.entidad.Usuario;

public interface RepositorioDevolucionVehiculo {

    /**
     * Permite crear una devolucion de un vehiculo
     * @param devolucionVehiculo
     * @return el id generado
     */
    Long crear(DevolucionVehiculo devolucionVehiculo);

    /**
     * Permite actualizar una devolucion de veihuclo
     * @param devolucionVehiculo
     */
    void actualizar(DevolucionVehiculo devolucionVehiculo);

    /**
     * Permite eliminar una devolucion de vehiculo
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe una devolucion de vehiculo
     * @param id
     * @return si existe o no
     */
    boolean existe(Long id);

    /**
     * Permite validar si existe una devolucion  excluyendo un id
     * @param id
     * @return si existe o no
     */
    boolean existeExcluyendoId(Long id);

    DevolucionVehiculo finById(Long id);
}
