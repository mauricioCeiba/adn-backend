package com.ceiba.devolucionvehiculo.adaptador.repositrio;

import com.ceiba.devolucionvehiculo.modelo.entidad.DevolucionVehiculo;
import com.ceiba.devolucionvehiculo.puerto.repositorio.RepositorioDevolucionVehiculo;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class RepositorioDevolucionVehiculoMysql implements RepositorioDevolucionVehiculo {


    private  final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "devolucionvehiculo", value = "crear")
    private static String sqlCrear;

    @SqlStatement(namespace = "devolucionvehiculo", value = "actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace = "devolucionvehiculo", value = "eliminar")
    private static String sqlEliminar;

    @SqlStatement(namespace = "devolucionvehiculo", value = "existe")
    private static String sqlExiste;

    @SqlStatement(namespace = "devolucionvehiculo", value = "existeExcluyendoId")
    private static String sqlExisteExcluyendoId;

    public  RepositorioDevolucionVehiculoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate){
        this.customNamedParameterJdbcTemplate=customNamedParameterJdbcTemplate;
    }


    @Override
    public Long crear(DevolucionVehiculo devolucionVehiculo) {

        return this.customNamedParameterJdbcTemplate.crear(devolucionVehiculo,sqlCrear);
    }

    @Override
    public void actualizar(DevolucionVehiculo devolucionVehiculo) {

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
