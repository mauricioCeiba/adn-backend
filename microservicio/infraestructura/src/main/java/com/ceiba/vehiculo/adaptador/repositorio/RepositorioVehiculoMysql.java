package com.ceiba.vehiculo.adaptador.repositorio;

import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.adaptador.repositorio.MapeoUsuariosEntidad;
import com.ceiba.vehiculo.modelo.entidad.Vehiculo;
import com.ceiba.vehiculo.puerto.repositorio.RepositorioVehiculo;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import java.time.Clock;

@Repository
public class RepositorioVehiculoMysql  implements RepositorioVehiculo {

    private  final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "vehiculo", value = "crear")
    private static String sqlCrear;

    @SqlStatement(namespace = "vehiculo", value = "actualizar")
    private static String sqlActualizar;

    @SqlStatement(namespace = "vehiculo", value = "eliminar")
    private static String sqlEliminar;

    @SqlStatement(namespace = "vehiculo", value = "existe")
    private static String sqlExiste;

    @SqlStatement(namespace = "vehiculo", value = "existeExcluyendoId")
    private static String sqlExisteExcluyendoId;

    @SqlStatement(namespace="vehiculo", value="finById")
    private static String sqlFinById;

    public  RepositorioVehiculoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate){
        this.customNamedParameterJdbcTemplate=customNamedParameterJdbcTemplate;
    }


    @Override
    public Long crear(Vehiculo vehiculo) {


        return this.customNamedParameterJdbcTemplate.crear(vehiculo,sqlCrear);
    }

    @Override
    public void actualizar(Vehiculo vehiculo) {
        this.customNamedParameterJdbcTemplate.actualizar(vehiculo,sqlActualizar);
    }

    @Override
    public void eliminar(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);

        this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().update(sqlEliminar, paramSource);

    }

    @Override
    public boolean existe(String placa) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("placa", placa);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExiste,paramSource, Boolean.class);

    }

    @Override
    public boolean existeExcluyendoId(Long id, String placa) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);
        paramSource.addValue("placa", placa);

        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteExcluyendoId,paramSource, Boolean.class);

    }

    @Override
    public Vehiculo finById(Long id) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id", id);


        return  this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlFinById,paramSource,new MapeoVehiculoEntidad());

    }
}
