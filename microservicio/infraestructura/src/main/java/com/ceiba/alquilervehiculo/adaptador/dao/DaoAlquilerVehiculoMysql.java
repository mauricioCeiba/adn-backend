package com.ceiba.alquilervehiculo.adaptador.dao;

import com.ceiba.alquilervehiculo.modelo.dto.DtoAlquilerVehiculo;
import com.ceiba.alquilervehiculo.puerto.dao.DaoAlquilerVehiculo;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.usuario.adaptador.dao.MapeoUsuario;
import com.ceiba.usuario.modelo.dto.DtoUsuario;
import com.ceiba.usuario.puerto.dao.DaoUsuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoAlquilerVehiculoMysql implements DaoAlquilerVehiculo {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="alquilervehiculo", value="listar")
    private static String sqlListar;

    public DaoAlquilerVehiculoMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoAlquilerVehiculo> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoAlquilerVehiculo());
    }
}
