package com.ceiba.alquilervehiculo.adaptador.repositorio;

import com.ceiba.alquilervehiculo.modelo.entidad.AlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.repositorio.RepositorioAlquilerVehiculo;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioAlquilerVehiculoMysql implements RepositorioAlquilerVehiculo {

    private  final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "alquilervehiculo", value = "crear")
    private static String sqlCrear;


    @SqlStatement(namespace="alquilervehiculo", value="actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace="alquilervehiculo", value="eliminar")
    private static String sqlEliminar;

    @SqlStatement(namespace="alquilervehiculo", value="existe")
    private static String sqlExiste;

    @SqlStatement(namespace="alquilervehiculo", value="existeExcluyendoId")
    private static String sqlExisteExcluyendoId;

    public  RepositorioAlquilerVehiculoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate){
        this.customNamedParameterJdbcTemplate=customNamedParameterJdbcTemplate;
    }





    @Override
    public Long crear(AlquilerVehiculo alquilerVehiculo) {
        return this.customNamedParameterJdbcTemplate.crear(alquilerVehiculo,sqlCrear);
    }

    @Override
    public void actualizar(AlquilerVehiculo alquilerVehiculo) {
        this.customNamedParameterJdbcTemplate.actualizar(alquilerVehiculo, sqlActualizar);
    }

    @Override
    public void eliminar(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);

        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);

    }

    @Override
    public boolean existe(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste,paramSource, Boolean.class);

    }

    @Override
    public boolean existeExcluyendoId(Long id, String nombre) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        paramSource.addValue("nombre", nombre);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteExcluyendoId,paramSource, Boolean.class);

    }
}
