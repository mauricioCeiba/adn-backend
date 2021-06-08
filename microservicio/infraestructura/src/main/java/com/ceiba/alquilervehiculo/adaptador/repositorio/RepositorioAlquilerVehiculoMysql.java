package com.ceiba.alquilervehiculo.adaptador.repositorio;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioAlquilerVehiculoMysql implements RepositorioAlquilerVehiculo {

    private  final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "alquilerVehiculo", value = "crear")
    private static String sqlCrear;

    public  RepositorioAlquilerVehiculoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate){
        this.customNamedParameterJdbcTemplate=customNamedParameterJdbcTemplate;
    }





    @Override
    public Long crear(AlquilerVehiculo alquilerVehiculo) {
        return this.customNamedParameterJdbcTemplate.crear(alquilerVehiculo,sqlCrear);
    }

    @Override
    public void actualizar(AlquilerVehiculo alquilerVehiculo) {

    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public boolean existe(Long id) {
        return false;
    }

    @Override
    public boolean existeExcluyendoId(Long id, String nombre) {
        return false;
    }
}
